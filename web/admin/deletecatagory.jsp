<%@page import="java.util.*,java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String email=null;
    Cookie c[]=request.getCookies();
    
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
        
                    String id1=request.getParameter("id");
                     out.print(id1);
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
                        Statement st= cn.createStatement();
                        st.execute("delete from catagory where Sn='"+id1+"'");
                        response.sendRedirect("deletecatagoryform.jsp?succ=1");
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
        response.sendRedirect("login.jsp?invalid_pass=1");
                 
                         
     
                
              
%>
 
    
          