<%-- 
    Document   : logout
    Created on : Mar 9, 2020, 3:45:03 PM
    Author     : dell
--%>
<%
Cookie c=new Cookie("user"," ");
c.setMaxAge(0);
response.addCookie(c);
response.sendRedirect("userindex.jsp?logoutsucc=1");
%>