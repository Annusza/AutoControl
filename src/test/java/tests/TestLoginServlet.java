package tests;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import domain.User;
import repositories.UserRepository;
import servlets.LoginServlet;

@RunWith(MockitoJUnitRunner.class)
public class TestLoginServlet extends Mockito {

	@Spy
	UserRepository repository = mock(UserRepository.class);

	@InjectMocks
	LoginServlet servlet;

	@Test
	public void authorizedSeesProfile() throws IOException, ServletException {

		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);

		when(request.getSession()).thenReturn(session);
		when(servlet.retrieveUserFromRequest(request)).thenReturn(new User());

		servlet.doGet(request, response);

		verify(response).sendRedirect("profil.jsp");

	}

	@Test
	public void notAuthorizedDoesntSeeProfile() throws IOException, ServletException {

		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);

		when(request.getSession()).thenReturn(session);
		when(servlet.retrieveUserFromRequest(request)).thenReturn(null);

		servlet.doGet(request, response);
		verify(response).sendRedirect("login.jsp");

	}

}