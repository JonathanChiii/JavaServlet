package com.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

/**
 * Servlet implementation class FetchSevlet
 */
@WebServlet("/FetchServlet") // URL pattern
public class FetchSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeService employeeService = new EmployeeServiceImpl();
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> al = employeeService.getAllData();
		request.setAttribute("AllList", al); // send the data
		System.out.print("Fetch Servlet");
		// sender take key and value, use setAttribute(key, value);
		// receiver will take key only, use getAttribute(key);
		// getAttribute is a method of httpServletRequest interface
		
		// whenever you send data from one servlet to another servlet, or servlet to JSP, use key-value paires 
		// where key is used to receive data in other file/(servlet/JSP)
		// and value have existing data
		// we always play with data
		// send and receive
		// s/w is combination of multiple files.
		
		//response.sendRedirect("AllEmployee.jsp");
		
		RequestDispatcher rd = request.getRequestDispatcher("employeeList.jsp");
		rd.forward(request, response);
		
	}

}
