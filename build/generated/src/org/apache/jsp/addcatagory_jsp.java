package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class addcatagory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

     Cookie c[]=request.getCookies();
     String email=null;
     for(int i=0;i<c.length;i++)
    {        
        if(c[i].getName().equals("user"))
         {
            email=c[i].getValue();
            break;
        }
   }     
        if(email!=null && session.getAttribute(email)!=null)
          {
            
                    String catagory=request.getParameter("catagory");
                    String discription=request.getParameter("discription");
                   /* out.print(discription);
                    out.print(catagory);*/
                    
                try
                  {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
                    Statement st=cn.createStatement();
                    int sn=0;
                    ResultSet rs=st.executeQuery("select Max(Sn) from catagory ");
                    if(rs.next())
                   {
                    sn=rs.getInt(1);
                    }
                    sn=sn+1;
                    String code ="";
                  LinkedList l=new LinkedList();
                  for(char s='a';s<='z';s++)
                   {
                      l.add(s+"");
                  }
                  for(char s='A';s<='Z';s++)
                   {
                      l.add(c+"");
                      
                  }
                  for(int i =0 ;i<=9;i++)
                {
                        l.add(i+"");
                    }
                  Collections.shuffle(l);
                  for(int i=0;i<=9;i++)
                   {
                      code=code+l.get(i);
                      
                  }
                  
                   //  st2.execute("insert into album values('"+sn+"','"+name+"','"+ucode+"','"+status+"','"+catagory+"')");
                    st.execute("insert into catagory values(1,'"+catagory+"','"+discription+"','"+code+"')");
                    
                    response.sendRedirect("addcatagoryform.jsp?addsucc=1");
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
             else
                 response.sendRedirect("index.jsp?updatemail=1");
            
        
     

      out.write("     ");
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
