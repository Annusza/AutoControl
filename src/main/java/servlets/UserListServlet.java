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

@WebServlet("/userlist")
public class UserListServlet extends HttpServlet implements Servlets {

	private static final long serialVersionUID = 1L;
	private UserRepository repository;

	@Override
	public void init(ServletConfig config) throws ServletException {

		repository = new DummyUserRepository();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String makePremium = request.getParameter("makePremium");

		if (makePremium != null) {
			try {
				Long id = Long.valueOf(makePremium);
				repository.togglePremium(id);

			}
			catch (Exception e) {

			}
		}
		request.getSession().setAttribute("userList", repository.getUsers());
		request.getRequestDispatcher("userlist.jsp").forward(request, response);
	}

	@Override
	public User retrieveUserFromRequest(HttpServletRequest request) {

		return null;
	}

}