/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import entity.User;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.ejb.EJB;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import session.UserRolesFacade;

/**
 *
 * @author pupil
 */
@WebFilter(filterName = "SecureFilter", dispatcherTypes= {DispatcherType.FORWARD} ,urlPatterns = {"/*"})
public class SecureFilter implements Filter {
    @EJB
    private UserRolesFacade userRolesFacade;
    
    public SecureFilter() {
        
    } 
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        String topRoleCurrentUser = null;
        HttpSession session = httpRequest.getSession(false);
        if(session == null) {
            httpRequest.setAttribute("topRoleCurrentUser", topRoleCurrentUser);
            chain.doFilter(request, response);
            return;
        }
        User user = (User) session.getAttribute("user");
        if(user == null) {
            httpRequest.setAttribute("topRoleCurrentUser", topRoleCurrentUser);
            chain.doFilter(request, response);
            return;
        }
        topRoleCurrentUser = userRolesFacade.getTopRoleName(user);
        if(topRoleCurrentUser == null) {
            httpRequest.setAttribute("topRoleCurrentUser", topRoleCurrentUser);
            chain.doFilter(request, response);
            return;
        }
        request.setAttribute("topRoleCurrentUser",topRoleCurrentUser);
        chain.doFilter(request, response);
 
    }
    @Override
    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    @Override
    public void init(FilterConfig filterConfig) {        
    }
   
}
