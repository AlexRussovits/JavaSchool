/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Product;
import entity.User;
import entity.UserProducts;
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
import javax.servlet.http.HttpSession;
import session.ProductFacade;
import session.UserProductsFacade;
import utils.UserManager;

/**
 *
 * @author pupil
 */
@WebServlet(name = "ProductController", urlPatterns =
        {
    "/showFormAddProduct",
    "/createProduct",
    "/listProducts",
    "/showProduct",
    "/deleteProduct",
    "/showEditProduct",
    "/updateProduct"                               
    })
public class ProductController extends HttpServlet {
    
    @EJB
    private ProductFacade productFacade;
    @EJB 
    private UserProductsFacade userProductsFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession(false);
        if (session == null) {
            request.setAttribute("info", "У вас нет прав для этого товара. Авторизуйтесь");
            request.getRequestDispatcher("/showFormLogin").forward(request, response);
        }
        User user = (User) session.getAttribute("user");
        UserManager userManager = new UserManager();
        if(!userManager.isRole(user, "USER")) {
            request.setAttribute("info", "У вас нет прав для эттго ресурса. Авторизуйтесь");
            request.getRequestDispatcher("/showFormLogin").forward(request,response);
        }
        String path = request.getServletPath();
        switch (path) {
            case "/showFormAddProduct":
                request.getRequestDispatcher("/pages/showFormAddResource.jsp").forward(request, response);
                break;
                
            case "/createProduct":
                String name = request.getParameter("name");
                int price = Integer.parseInt(request.getParameter("price"));
                Product product = new Product(name,price);
                productFacade.create(product);
                Calendar c = new GregorianCalendar();
                UserProducts userProducts = new UserProducts(user, product, c.getTime());
                userProductsFacade.create(userProducts);
                request.setAttribute("info", "Товар "+product.getName()+" создан");
                request.getRequestDispatcher("/pages/showListPeoducts.jsp").forward(request, response);
                break;
                
            case "/listProducts":
                List<Product> listProducts = productFacade.findbyUser(user);
                request.setAttribute("listProducts", listProducts);
                request.getRequestDispatcher("/pages/showListProducts.jsp").forward(request, response);
                break;
                
            case "/showProduct":
                String id = request.getParameter("idProduct");
                product = productFacade.find(Long.parseLong(id));
                request.setAttribute("product", product);
                request.getRequestDispatcher("/pages/showProduct.jsp");
                break;
                
            case "/deleteProduct":
                id = request.getParameter("idProduct");
                if(id == null || "".equals(id)) {
                    request.setAttribute("info", "Нет такого товара");
                    request.getRequestDispatcher("/showListProducts").forward(request, response);
                    break;
                }
                
                Product deleteProduct = productFacade.find(Long.parseLong(id));
                listProducts = productFacade.findbyUser(user);
                if(!listProducts.contains(deleteProduct)) {
                    request.setAttribute("info", "Нет такого товара");
                    request.getRequestDispatcher("/showListGames").forward(request, response);
                    break;
                }
                
                userProductsFacade.removeByProduct(deleteProduct);
                request.setAttribute("info", "Товар "+ deleteProduct.getName()+" удалён.");
                request.getRequestDispatcher("/listProducts").forward(request, response);
                
            case "/showEditProduct":
                id = request.getParameter("idProduct");
                request.setAttribute("idProduct", id);
                request.getRequestDispatcher("/pages/showFormEditProduct.jsp").forward(request, response);
                break;
                
            case "/updateProduct":
                id = request.getParameter("idProduct");
                product = productFacade.find(Long.parseLong(id));
                name = request.getParameter("name");
                price = Integer.parseInt(request.getParameter("price"));
                product.setName(name);
                product.setPrice(price);
                productFacade.edit(product);
                request.setAttribute("product", product);
                request.getRequestDispatcher("/pages/showProduct.jsp").forward(request, response);
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
