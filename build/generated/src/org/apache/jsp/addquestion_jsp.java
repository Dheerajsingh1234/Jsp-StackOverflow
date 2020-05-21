package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class addquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("\n");

    String email="dheeraj@gmail.com";
    Cookie c[]=request.getCookies();
    for(int i=0;i<c.length;i++)
     {
        if(c[i].getName().equals("user"))
          {
              email=c[i].getValue();
              break;
          }
    }
    if(email!=null || session.getAttribute(email)!=null)
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
        Statement st=cn.createStatement();
        

      out.write("    \n");
      out.write("        \n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("<!-- font-awesome icons CSS-->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!-- //font-awesome icons CSS-->\n");
      out.write("\n");
      out.write(" <!-- side nav css file -->\n");
      out.write(" <link href='css/SidebarNav.min.css' media='all' rel='stylesheet' type='text/css'/>\n");
      out.write(" <!-- side nav css file -->\n");
      out.write(" \n");
      out.write(" <!-- js-->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\n");
      out.write("<!--webfonts-->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext\" rel=\"stylesheet\">\n");
      out.write("<!--//webfonts-->\n");
      out.write(" \n");
      out.write("<!-- Metis Menu -->\n");
      out.write("<script src=\"js/metisMenu.min.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("<link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("<!--//Metis Menu -->\n");
      out.write("<style>\n");
      out.write(".header{\n");
      out.write("            padding: 30px;\n");
      out.write("            color: black;\n");
      out.write("            text-align:left;\n");
      out.write("            background-color: white;\n");
      out.write("                \n");
      out.write("}\n");
      out.write(".frame{\n");
      out.write("          padding:60px;\n");
      out.write("          color:black;\n");
      out.write("          background-color: white;\n");
      out.write("          \n");
      out.write("}\n");
      out.write("input[type=text], select {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=text1]{\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  text-align: left;\n");
      out.write("  display: block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  width: 100%;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head> \n");
      out.write("\n");
      out.write("<body >\n");
      out.write("            <div class=\"header\">\n");
      out.write("               <h1>Stackoverflow</h1>\n");
      out.write("                </div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- main content start-->\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("                   <div class=\"title\"> \n");
      out.write("                    <h2>Ask a new question</h2>\t\n");
      out.write("                    <div class=\"frame\">\n");
      out.write("                       \n");
      out.write("                              <form action=\"/action_page.php\">\n");
      out.write("                                <label for=\"title\">Title</label>\n");
      out.write("                                <input type=\"text\" id=\"fname\" name=\"title\" placeholder=\"ex. which language is best for cloud computing\">\n");
      out.write("                                    <label for=\"country\">Country</label>\n");
      out.write("                                <select id=\"country\" name=\"catagory\">\n");
      out.write("                               ");

                                    ResultSet rs= st.executeQuery("select * from catagory");
                                    while(rs.next())
                                {     
                                   
      out.write(" \n");
      out.write("                                  <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                  ");

                                                                         }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                   <label for=\"discription\">Discription</label>\n");
      out.write("                                <input type=\"text1\" id=\"lname\" name=\"discription\" placeholder=\"describe your question \">\n");
      out.write("                                <input type=\"submit\" value=\"Submit\">\n");
      out.write("                              </form>\n");
      out.write("                \n");
      out.write("\t\t\t\t</div>\n");
      out.write("                      </div>  \n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("\t<!-- //Bootstrap Core JavaScript -->\n");
      out.write("  <script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.js\"> </script> \n");
      out.write("</body>\n");
      out.write("</html>\n");

                } 
               
             catch(ClassNotFoundException er)
             {
                 out.print(er.getMessage());
             }
             catch(SQLException er)
             {
                 out.print(er.getMessage());
             }   
             
          }  
   
      out.write("       \n");
      out.write("           ");
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
