package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.User;

public final class profil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Menu</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("\t\t\t<font color=\"blue\">Profil użytkownika</font>\r\n");
      out.write("\t\t</H1>\r\n");
      out.write("\t\t");

		User user =(User)request.getSession().getAttribute("user");
		if(user!=null){
			out.write("Login = " + user.getUsername());
			
      out.write("\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t");
out.write("Password = " + user.getPassword());
			
      out.write("\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t");

			out.write("Email = " + user.getEmail());
		} else {
			out.write("Użytkownik nie jest zalogowany!");
		}
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<form action=\"\" method=\"get\">\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
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
