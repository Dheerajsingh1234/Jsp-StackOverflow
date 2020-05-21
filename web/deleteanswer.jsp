<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
        Statement st1=cn.createStatement();
        Statement st2=cn.createStatement();
        Statement st3=cn.createStatement();
        String questioncode=request.getParameter("id");
        String usercode=request.getParameter("id1");
        String replycode=request.getParameter("id2");
         ResultSet rs1= st1.executeQuery("select * from replytable where Questioncode='"+questioncode+"'");
        
       while(rs1.next())
        {
             ResultSet rs2=st2.executeQuery("select * from user where code='"+rs1.getString(3)+"'");
             if(rs2.next())
             {
                if(rs1.getString(2).equals(questioncode) && rs2.getString(5).equals(usercode))
                 {
                    st3.execute("delete from replytable where Questioncode='"+questioncode+"' AND Usercode='"+usercode+"' AND Replycode='"+replycode+"'");
                    response.sendRedirect("answer.jsp?id="+questioncode+"&id1="+usercode+"&deletesucc=1");
                    break;
                }
                
           } 
          }
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
     {
        response.sendRedirect("userlogin.jsp?deletequestion=1");
    }
                         
    %>          

