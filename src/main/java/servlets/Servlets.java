package servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;

public interface Servlets {

	void init(ServletConfig config) throws ServletException;

	void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	User retrieveUserFromRequest(HttpServletRequest request);

}
