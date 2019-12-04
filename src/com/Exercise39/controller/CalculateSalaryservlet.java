package com.Exercise39.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Exercise39.model.Employee;
import com.Exercise39.model.PayRoll;

@WebServlet("/CalculateSalaryservlet")
public class CalculateSalaryservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output = response.getWriter();
		Employee miEmpleado = new Employee();
		
		double calculatedSalary=0.0;
		miEmpleado.setNameEmployee(request.getParameter("txtname"));
		miEmpleado.setSalary(Double.parseDouble(request.getParameter("txtsalary")));
		
		calculatedSalary =PayRoll.CalculateSalary(miEmpleado);
		
		//output.append("Estamos en el servlet");
		
		output.append("El Salario calculado es: "+calculatedSalary);
		
		output.close();
	}

}
