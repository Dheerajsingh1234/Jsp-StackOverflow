<%-- 
    Document   : paging.jdp
    Created on : Mar 14, 2020, 6:26:24 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*,java.util.*"%>
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
        int id=0;
        int n=3;
        if(request.getParameter("id")!=null)
            id=Integer.parseInt(request.getParameter("id"));
        int start=id*n;
        int prev=id-1;
        int next=id+1;
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql:/localhost:3306//stackoverflow1","root","");
        Statement st=cn.createStatement();
       // ResultSet rs=st.executeQuery("select * from replytable order by Sn limit "+start+","+n);
        if(rs.next())
        {
            
                        
        }
                     
        }
    else
      {
        response.sendRedirect("");
    }
        