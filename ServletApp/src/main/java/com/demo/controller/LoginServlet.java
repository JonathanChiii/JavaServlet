package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService employeeService = new EmployeeServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("pwd");
		Employee e = employeeService.getById(id);
		RequestDispatcher rd = null;
		
		if(e !=null && e.getPassword().equals(password)) {
			List<Employee> al = List.of(e);
			request.setAttribute("AllList", al);
			rd = request.getRequestDispatcher("employeeList.jsp");
			rd.forward(request, response);
		}
		else {
			PrintWriter pw = response.getWriter();
			String msg = "Id and password not match.";
			pw.print(msg);
			rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}
}
