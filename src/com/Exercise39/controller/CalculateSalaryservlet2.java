package com.Exercise39.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Exercise39.model.Employee;
import com.Exercise39.model.PayRoll;

@MultipartConfig
@WebServlet("/CalculateSalaryservlet2")
public class CalculateSalaryservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json charset='utf-8'");
		PrintWriter output = response.getWriter();
		Employee miEmpleado = new Employee();
		
		double calculatedSalary=0.0;
		
		//se colocan los valores de txtname y txtsalary creados en el script, dentro de calculatedsalary2
		miEmpleado.setNameEmployee(request.getParameter("txtname"));
		miEmpleado.setSalary(Double.parseDouble(request.getParameter("txtsalary")));
		
		calculatedSalary =PayRoll.CalculateSalary(miEmpleado);
		
		// Se envia por JSON
		output.append("{\"Calculated Salary\" : "+calculatedSalary+"}");
		
		output.close();
	}

}
