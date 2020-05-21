<%-- 
         Document   : update
    Created on : Jan 7, 2020, 12:38:13 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<%
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
                   /**/
                    
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
                    String code="";
                            LinkedList l= new LinkedList();
                            for(char i='a';i<='z';i++)
                                   {
                                        l.add(i+"");
                                  }
                            for(char i='A';i<='Z';i++)
                             {
                                l.add(i+"");
                            }
                             for(int i=0;i<=9;i++) 
                              {
                                 l.add(i+"");
                             }
                            Collections.shuffle(l);
                            for(int i=1;i<9;i++)
                             {
                                code=code+l.get(i);
                                
                            }
                  // out.println(discription);
                    //out.println(catagory);
                   //out.println(code);
                    //out.println(sn);
                    // st2.execute("insert into album values('"+sn+"','"+catagory+"','"+ucode+"','"+status+"','"+catagory+"')");
                    st.execute("insert into catagory values('"+sn+"','"+catagory+"','"+discription+"','"+code+"')");
                    
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
                 response.sendRedirect("index.jsp?addemail=1");
            
        
     
%>     