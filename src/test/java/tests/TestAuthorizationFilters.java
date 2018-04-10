package tests;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
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
import filters.AdminFilter;
import repositories.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class TestAuthorizationFilters extends Mockito {

	@Spy
	UserRepository repository = mock(UserRepository.class);

	@InjectMocks
	AdminFilter filter;

	@Test
	public void adminIsNotFiltered() throws IOException, ServletException {

		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		FilterChain chain = mock(FilterChain.class);
		HttpSession session = mock(HttpSession.class);
		User user = new User();
		user.setAdmin(true);

		when(request.getSession()).thenReturn(session);
		when(response.getWriter()).thenReturn(mock(PrintWriter.class));
		when(session.getAttribute("user")).thenReturn(user);

		filter.doFilter(request, response, chain);

		verify(chain).doFilter(request, response);

		when(session.getAttribute("user")).thenReturn(null);
		filter.doFilter(request, response, chain);
		verify(response.getWriter()).print(anyString());

	}

	@Test
	public void notAdminIsFiltered() throws IOException, ServletException {

		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		FilterChain chain = mock(FilterChain.class);
		HttpSession session = mock(HttpSession.class);
		User user = new User();
		user.setAdmin(false);

		when(request.getSession()).thenReturn(session);
		when(response.getWriter()).thenReturn(mock(PrintWriter.class));
		when(session.getAttribute("user")).thenReturn(user);

		filter.doFilter(request, response, chain);

		verify(response.getWriter()).print(anyString());

		verify(chain, never()).doFilter(request, response);

	}

	@Test
	public void anonymousUserIsFiltered() throws IOException, ServletException {

		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		FilterChain chain = mock(FilterChain.class);
		HttpSession session = mock(HttpSession.class);

		when(request.getSession()).thenReturn(session);
		when(response.getWriter()).thenReturn(mock(PrintWriter.class));
		when(session.getAttribute("user")).thenReturn(null);

		filter.doFilter(request, response, chain);

		verify(response.getWriter()).print(anyString());

		verify(chain, never()).doFilter(request, response);

	}

}