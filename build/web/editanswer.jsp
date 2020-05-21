<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.util.*,java.sql.*"%>
<%             
        Cookie c[]=request.getCookies();
        String email=null;
        for(int i =0;i<c.length;i++)
        {
            if(c[i].getName().equals("user"))
               email=c[i].getValue();
        }
     if(email!=null && session.getAttribute(email)!=null)
     {
        try
        {
            
                 String answer=request.getParameter("answer");
                 String questioncode=request.getParameter("id");
               //  String usercode=request.getParameter("id2");
                 Class.forName("com.mysql.jdbc.Driver");
                    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
                    Statement st=cn.createStatement();
                    Statement st1=cn.createStatement();
                     //ResultSet rs1=st.executeQuery("select * from user where Email='"+email+"'");
                    ResultSet rs=st1.executeQuery("select * from user where Email='"+email+"'");
                    if(rs.next())
                    {      String editcode="";
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
                                editcode=editcode+l.get(i);
                            }
                  
                         String usercode=rs.getString(5);
                         PreparedStatement ps=cn.prepareStatement("insert into answeredit values(?,?,?,?)");
                        ps.setString(1,answer);
                        ps.setString(2,questioncode);
                        ps.setString(3,usercode);
                        ps.setString(4,editcode);
                         
                        ps.execute();
                        cn.close();
                       //st.execute("insert into answeredit values('"+answer+"','"+questioncode+"','"+usercode+"','"+editcode+"')");
                       response.sendRedirect("answer.jsp?id="+questioncode+"&id1="+usercode+"&id2="+editcode);
                       
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
            response.sendRedirect("userlogin.jsp?emailerr=1");
                         
    %>          