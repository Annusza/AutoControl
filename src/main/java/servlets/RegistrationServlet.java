package servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import repositories.DummyUserRepository;
import repositories.UserRepository;

@WebServlet("/newuser")
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserRepository repository;

	@Override
	public void init(ServletConfig config) throws ServletException {

		repository = new DummyUserRepository();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User user = retrieveUserFromRequest(request);
		repository.add(user);
		request.getSession().setAttribute("user", user);
		response.sendRedirect("login.jsp");
	}

	public User retrieveUserFromRequest(HttpServletRequest request) {

		User result = new User();
		result.setUsername(request.getParameter("username"));
		result.setEmail(request.getParameter("email"));
		result.setPassword(request.getParameter("password"));
		return result;
	}

}
