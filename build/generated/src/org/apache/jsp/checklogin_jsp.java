package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class checklogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
        String email="dheeraj";
        Cookie c[]=request.getCookies();
       for(int i=0;i<c.length;i++)
        {
           if(c[i].getName().equals("user"))
            email=c[i].getValue();
       }
     if(email!=null && session.getAttribute(email)!=null)
        response.sendRedirect("edit.jsp");
     else
     {
            if(email==null)
           {
                if(request.getParameter("email")==null)
                    response.sendRedirect("admin.jsp?emailerr=1");
                else
                    email=request.getParameter("email");
            }
            if(request.getParameter("pass")==null)
             response.sendRedirect("admin.jsp?pass=1");
            else
          {
                String pass= request.getParameter("pass");
               // out.print(email);
              try  
               {
                  Class.forName("com.mysql.jdbc.Driver");
              
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
                 Statement st = cn.createStatement();
                ResultSet rs=st.executeQuery("select * from admin where Email='"+email+"'");
                if(rs.next())
                  {
                     if(pass.equals(rs.getString("password")))
                     {
                         Cookie ct=new Cookie("user",email);
                         ct.setMaxAge(3600);
                         response.addCookie(ct);
                         session.setAttribute(email,pass);
                         session.setMaxInactiveInterval(3600);
                         response.sendRedirect("index.jsp");
                      }
                      else
                       response.sendRedirect("login.jsp?invalid_pass=1");
                  } 
                else
                   response.sendRedirect("login.jsp?invalid_emailerr=1");
                
                cn.close();
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
                         
    }   
                
              

      out.write('\n');
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
