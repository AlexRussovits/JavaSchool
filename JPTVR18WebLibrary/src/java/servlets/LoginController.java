/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.UserFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "LoginController", urlPatterns = {"/showLogin", "/login", "/logout"})
public class LoginController extends HttpServlet {
    @EJB private UserFacade userFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession(false);
        String path = request.getServletPath();
        switch (path) {
            case "/showLogin":
                request.getRequestDispatcher("/showLogin.jsp")
                        .forward(request, response);
                break;
            case "/login":
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                // Authentication
                User user = null;
                if (login != null) {
                    user = userFacade.findByLogin(login);
                }
                if (user == null) {
                    request.setAttribute("info", "Нет такого пользователя");
                    request.getRequestDispatcher("/showLogin.jsp")
                        .forward(request, response);
                        break;
                }
                // Authorization
                if (!password.equals(user.getPassword())) {
                    request.setAttribute("info", "Нет такого пользователя");
                    request.getRequestDispatcher("/showLogin.jsp")
                        .forward(request, response);
                        break;
                }
                session = request.getSession(true);
                session.setAttribute("user", user);
                request.setAttribute("info", "Вы вошли как "+ user.getLogin());
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
                
            case "/logout":
                if (session != null) {
                session.invalidate();
            }
                request.setAttribute("info", "Вы вышли");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                break;
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
