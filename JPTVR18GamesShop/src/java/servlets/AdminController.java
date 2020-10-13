/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Customer;
import entity.Role;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessions.CustomerFacade;
import sessions.CustomerRolesFacade;
import sessions.RoleFacade;
import utilities.MakeHash;

/**
 *
 * @author PC
 */
@WebServlet(name = "AdminController", urlPatterns = 
        {"/showListCustomers",
         "/editCustomerRoles",
         "/updateCustomerRoles",})

public class AdminController extends HttpServlet {
    @EJB
    private CustomerRolesFacade customerRolesFacade;
    @EJB
    private CustomerFacade customerFacade;
    @EJB
    private RoleFacade roleFacade;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession(false);
        if(session == null){
            request.setAttribute("info", "У вас нет прав для просмотра игр. Авторизуйтесь");
           request.getRequestDispatcher("/showFormLogin")
                .forward(request, response);
        }
        Customer customer = (Customer) session.getAttribute("customer");
        //UserManager userManager = new UserManager();
        if(!customerRolesFacade.checkRole(customer,"ADMIN")){
           request.setAttribute("info", "У вас нет прав для этого ресурса. Авторизуйтесь");
         request.getRequestDispatcher("/showFormLogin")
                .forward(request, response);
        }
        
        String path = request.getServletPath();
        switch (path) {
            case "/showListCustomers":
                Map<Customer,String> customersMap = new HashMap<>();
                List<Customer> listCustomers = customerFacade.findAll();
                for (int i = 0; i < listCustomers.size(); i++) {
                    Customer customerForMap = listCustomers.get(i);
                    String topRoleCustomerForMap = customerRolesFacade.getTopRoleName(customerForMap);
                    customersMap.put(customerForMap, topRoleCustomerForMap);
                }
                request.setAttribute("customersMap", customersMap);
                
                request.getRequestDispatcher("/admin/showListUsers.jsp")
                        .forward(request, response);
                break;
            case "/editCustomerRoles":
                String customerId = request.getParameter("customerId");
                Customer editCustomer = customerFacade.find(Long.parseLong(customerId));
                if(editCustomer == null){
                    request.setAttribute("info", "Не найден покупатель с иднетификатором "+customerId);
                    request.getRequestDispatcher("/admin/showListCustomers.jsp")
                        .forward(request, response);
                    break;
                }
                request.setAttribute("editCustomer", editCustomer);
                List<Role> listRoles = roleFacade.findAll();
                request.setAttribute("listRoles", listRoles);
                String topRoleEditCustomer = customerRolesFacade.getTopRoleName(editCustomer);
                request.setAttribute("topRoleEditCustomer", topRoleEditCustomer);
                
                request.getRequestDispatcher("/admin/editCustomerRolesForm.jsp")
                    .forward(request, response);
                break;
            case "/updateUserRoles":
                customerId = request.getParameter("customerId");
                String newLogin = request.getParameter("newLogin");
                String newPassword = request.getParameter("newPassword");
                String currentRole = request.getParameter("currentRole");
                String newRole = request.getParameter("newRole");
                if(newRole.equals(currentRole)){
                    request.setAttribute("info", "Роль не изменилась. Выберите другую роль");
                    request.getRequestDispatcher("/admin/editUserRolesForm.jsp")
                        .forward(request, response);
                    break;
                }
                Role newRoleUpdateCustomer = roleFacade.find(Long.parseLong(newRole));
                if(customerId == null){
                    request.setAttribute("info", "Не найден покупатель с иднетификатором "+customerId);
                    request.getRequestDispatcher("/showListCustomers")
                        .forward(request, response);
                    break;
                }
                Customer updateCustomer = customerFacade.find(Long.parseLong(customerId));
                customerRolesFacade.deleteAllCustomerRoles(updateCustomer);
                customerRolesFacade.setNewRoleToCustomer(newRoleUpdateCustomer,updateCustomer);
                updateCustomer.setLogin(newLogin);
                if(newPassword != null && !newPassword.isEmpty()){
                    MakeHash mh = new MakeHash();
                    String salts = mh.createSalts();
                    newPassword = mh.createHash(newPassword, salts);
                    updateCustomer.setPassword(newPassword);
                }
                customerFacade.edit(updateCustomer);
                request.setAttribute("info", "Данные покупателя "+updateCustomer.getLogin()+" изменены");
                    request.getRequestDispatcher("/showListCustomers")
                        .forward(request, response);
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
