package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlets.RegistrationServlet;
import domain.User;
import java.util.List;

public final class userlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/menu.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Lista użytkowników</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t<H1>\r\n");
      out.write("\t\t\t<font color=\"red\">Menu:</font>\r\n");
      out.write("\t\t</H1>\r\n");
      out.write("\t\t<h3><a href=\"profil.jsp\">Profil</a></h3>\r\n");
      out.write("\t\t<h3><a href=\"premium.jsp\">Premium</a></h3>\r\n");
      out.write("\t\t<h3><a href=\"userlist\">Administrator</a></h3>\r\n");
      out.write("\t\t<h3><a href=\"profil?logout=1\">Wyloguj</a></h3>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<H1>\r\n");
      out.write("\t\t\t<font color=\"purple\">Lista użytkowników</font>\r\n");
      out.write("\t\t</H1>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t");

		List<User> userList = (List<User>)(request.getSession().getAttribute("userList"));
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<table border=\"2\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Id</th>\r\n");
      out.write("\t\t\t<th>Username</th>\r\n");
      out.write("\t\t\t<th>Password</th>\r\n");
      out.write("\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t<th>Premium</th>\r\n");
      out.write("\t\t\t<th>Admin</th>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			for (int i = 0; i < userList.size(); i++){
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td>");
      out.print(userList.get(i).getId());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(userList.get(i).getUsername());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(userList.get(i).getPassword());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(userList.get(i).getEmail());
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"?makePremium=");
      out.print(userList.get(i).getId());
      out.write('"');
      out.write('>');
      out.print(userList.get(i).getPremium());
      out.write("</a></td>\r\n");
      out.write("\t\t\t<td>");
      out.print(userList.get(i).getAdmin());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<form action=\"\" method=\"get\"></form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
