package servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repositories.DummyUserRepository;
import repositories.UserRepository;
import domain.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet implements Servlets {

	private static final long serialVersionUID = 1L;
	private UserRepository repository;

	@Override
	public void init(ServletConfig config) throws ServletException {

		repository = new DummyUserRepository();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User user = retrieveUserFromRequest(request);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("profil.jsp");

		}
		else {
			response.sendRedirect("login.jsp");
		}
	}

	@Override
	public User retrieveUserFromRequest(HttpServletRequest request) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		return repository.findUser(username, password);

	}

}
