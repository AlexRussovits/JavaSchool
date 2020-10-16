/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevlets;

import utils.UserManager;
import entity.Resource;
import entity.User;
import entity.UserResources;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.ResourceFacade;
import session.UserResourcesFacade;

/**
 *
 * @author Melnikov
 */
@WebServlet(name = "ResourceController", urlPatterns = {
    "/showFormAddResource",
    "/createResource",
    "/listResources",
    "/deleteResource",
    "/showEditResource",
    "/updateResource"
    
})
public class ResourceController extends HttpServlet {
    @EJB
    private ResourceFacade resourceFacade;
    @EJB
    private UserResourcesFacade userResourcesFacade;
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
        if(session == null){
            request.setAttribute("info", "У вас нет прав для этого ресурса. Авторизуйтесь");
            request.getRequestDispatcher("/showFormLogin")
                .forward(request, response);
        }
        User user = (User) session.getAttribute("user");
        UserManager userManager = new UserManager();
        if(!userManager.isRole(user,"USER")){
            request.setAttribute("info", "У вас нет прав для этого ресурса. Авторизуйтесь");
            request.getRequestDispatcher("/showFormLogin")
                .forward(request, response);
        }
        
        String path = request.getServletPath();
        switch (path) {
            case "/showFormAddResource":
                request.getRequestDispatcher("/pages/showFormAddResource.jsp")
                        .forward(request, response);
                break;
            case "/createResource":
                String name = request.getParameter("name");
                String url = request.getParameter("url");
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                Resource resource = new Resource(name, url, login, password);
                resourceFacade.create(resource);
                Calendar c = new GregorianCalendar();
                UserResources userResources = new UserResources(user, resource, c.getTime());
                userResourcesFacade.create(userResources);
                request.setAttribute("info", "Ресурс \""
                        +resource.getName()+"\" создан");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/listResources":
                List<Resource> listResources = resourceFacade.findByUser(user);
                request.setAttribute("listResources", listResources);
                request.getRequestDispatcher("/pages/showListResources.jsp")
                        .forward(request, response);
                break;
            case "/deleteResource":
                String id = request.getParameter("id");
                if(id == null || "".equals(id)){
                    request.setAttribute("info", "Нет такого ресурса");
                    request.getRequestDispatcher("/showListResources")
                        .forward(request, response);
                    break;
                }
                Resource deleteResource = resourceFacade.find(Long.parseLong(id));
                listResources = resourceFacade.findByUser(user);
                if(!listResources.contains(deleteResource)){
                    request.setAttribute("info", "Нет такого ресурса");
                    request.getRequestDispatcher("/showListResources")
                        .forward(request, response);
                    break;
                }
                userResourcesFacade.removeByResource(deleteResource);
               
                //resourceFacade.remove(deleteResource);
                request.setAttribute("info", "Ресурс "+deleteResource.getName()+" удален.");
                request.getRequestDispatcher("/listResources")
                        .forward(request, response);
                break;
            case "/showEditResource":
                
                
                break;
            case "/updateResource":
                
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