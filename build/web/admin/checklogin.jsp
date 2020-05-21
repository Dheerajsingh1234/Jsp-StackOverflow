<%-- 
    Document   : cheack.jsp
    Created on : Dec 18, 2019, 12:58:56 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,java.sql.*"%>
<% 
        String email=null;
        Cookie c[]=request.getCookies();
       for(int i=0;i<c.length;i++)
        {
           if(c[i].getName().equals("user"))
            email=c[i].getValue();
       }
     if(email!=null && session.getAttribute(email)!=null)
        response.sendRedirect("index.jsp");
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
                
              
%>
