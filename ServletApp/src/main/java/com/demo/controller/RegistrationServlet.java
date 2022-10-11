package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class RegistrationSevlet
 */
@WebServlet("/RegistrationSevlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	EmployeeService employeeService = new EmployeeServiceImpl();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int salary = Integer.valueOf(request.getParameter("salary"));
		String password = request.getParameter("pwd");
		
		Employee e = new Employee(id, name, email, salary, password);
		String msg = employeeService.save(e);
		
		RequestDispatcher rd = request.getRequestDispatcher("FetchServlet");
		rd.forward(request, response);
		
		
		PrintWriter pw = response.getWriter();
		pw.print(msg);
	}

}
