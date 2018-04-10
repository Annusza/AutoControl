package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.User;

@WebFilter({ "/userlist" })
public class AdminFilter implements Filter {

	public AdminFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null && user.isAdmin()) {
			chain.doFilter(request, response);
		}
		else {

			response.getWriter().print("Strona dostêpna tylko dla administratora.");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
