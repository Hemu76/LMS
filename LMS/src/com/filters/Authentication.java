package com.filters;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import com.service.AppService;

@Order(1)
@WebFilter(
	    filterName = "Authentication",
	    urlPatterns = {"/admin", "/personaldetails","/adminld"}
	)
public class Authentication extends HttpFilter implements Filter 
{
	
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		
		System.out.println("Entered filter"+request.getParameter("username"));
		boolean x=(request.getParameter("username")!=null) && (request.getParameter("password")!=null);
		System.out.println("Entered filter "+x+" "+request.getParameter("username")+" "+request.getParameter("password"));
        String usertype=request.getParameter("usertype");
        HttpSession hs = request.getSession();
        String ut=""+hs.getAttribute("ut");
        System.out.println(usertype);
		if(x)
		{
        System.out.println("Entered inside filter");
			
			chain.doFilter(request, response);
		}
		
			String requestedURL = request.getRequestURL().toString().substring(26, 32);
			System.out.println(requestedURL);
			System.out.println(requestedURL.startsWith("admin") && usertype.equals(ut));
			System.out.println(requestedURL.startsWith("admin"));
			System.out.println(usertype.equals("admin"));
			if(requestedURL.startsWith("admin") && usertype.equals("admin"))
			{
			 
			System.out.println("Entered inside filter");
			
			chain.doFilter(request, response);
			}
		

        
        
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	

}