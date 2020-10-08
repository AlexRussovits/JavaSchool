/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.CustomerGames;
import entity.Game;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.CustomerGamesFacade;
import sessions.GameFacade;

/**
 *
 * @author PC
 */
@WebServlet(name = "GameController", urlPatterns = 
{"/createGame",
 "/listGames",
 "/showFormAddGames",
 "/deleteGame",
 "/updateGame",
 "/showGame",
 "/showEditGame"
        
})
public class GameController extends HttpServlet {
    @EJB
    private GameFacade gameFacade;
    @EJB
    private CustomerGamesFacade customerGamesFacade;

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
        try (PrintWriter out = response.getWriter()) {
            String path = request.getServletPath();
            switch (path) {
                
                case "/showFormAddGames":
                    
                    request.getRequestDispatcher("/pages/showFormAddGames.jsp")
                        .forward(request, response);
                    
                    break;
                    
                case "/createGame":
                    String name = request.getParameter("name");
                    String devName = request.getParameter("devName");
                    Game game = new Game (name, devName, 0);
                    gameFacade.create(game);
                    Calendar c = new GregorianCalendar();
                    //CustomerGames customerGames = new CustomerGames(customer, game, date);
                    //customerGamesFacade.create(customerGames);
                    request.setAttribute("info", "Ресурс \""
                        +game.getName()+"\" создан");
                    request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                    break;
                    
                case "/listGames":
                    //List<Game> listGames = gameFacade.findByCustomer(customer);
//                    request.setAttribute("listResources", listResources);
//                    request.getRequestDispatcher("/pages/showListResources.jsp")
//                        .forward(request, response); 
                    break;   
                
                case "/showGame":
//                    String id = request.getParameter("idRecource");
//                    resource = resourceFacade.find(Long.parseLong(id));
//                    request.setAttribute("resource", resource);
//                    request.getRequestDispatcher("/pages/showResource.jsp")
//                            .forward(request, response);
                    
                    break;       
                      
                case "/deleteGame":
//                    id = request.getParameter("idResource");
//                    if(id == null || "".equals(id)){
//                    request.setAttribute("info", "Нет такого ресурса");
//                    request.getRequestDispatcher("/showListResources")
//                        .forward(request, response);
//                    break;
//                }
//                    Resource deleteResource = resourceFacade.find(Long.parseLong(id));
//                    listResources = resourceFacade.findByUser(user);
//                    if(!listResources.contains(deleteResource)){
//                    request.setAttribute("info", "Нет такого ресурса");
//                    request.getRequestDispatcher("/showListResources")
//                        .forward(request, response);
//                    break;
//                }
//                    userResourcesFacade.removeByResource(deleteResource);
//                    request.setAttribute("info", "Ресурс "+deleteResource.getName()+" удален.");
//                    request.getRequestDispatcher("/listResources")
//                        .forward(request, response);
                    
                    break;
                case "/showEditGame":
                    
                    break;      
                case "/updateGame":
//                    id = request.getParameter("idRecource");
//                resource = resourceFacade.find(Long.parseLong(id));
//                name = request.getParameter("name");
//                url = request.getParameter("url");
//                login = request.getParameter("login");
//                password = request.getParameter("password");
//                resource.setLogin(login);
//                resource.setUrl(url);
//                resource.setName(name);
//                resource.setPassword(password);
//                resourceFacade.edit(resource);
//                request.setAttribute("resource", resource);
//                request.getRequestDispatcher("/pages/showResource.jsp")
//                        .forward(request, response);
                    
                    break;   


                    
            }
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
