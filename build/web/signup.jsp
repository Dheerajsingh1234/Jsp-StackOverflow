<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,java.sql.*"%>
<%
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String email=request.getParameter("email");
         String gender=request.getParameter("gender");
        String pass=request.getParameter("password");
        String conferm=request.getParameter("conferm");
        String password="";
        if(fname==null || lname==null || email==null || gender==null || pass==null || conferm==null)
        {
            response.sendRedirect("usersignup.jsp?empty=1");
        }
        else{
                    if(pass.equals(conferm))
                   {
                         password=pass;
                    }
                    else
                        response.sendRedirect("usersignup.jsp?passconferm=1");
            
                    String name=fname+lname;
                  try
                  {  
                      String ucode="";
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
                                ucode=ucode+l.get(i);
                            }
                    Class.forName("com.mysql.jdbc.Driver");
              
                    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
                    PreparedStatement ps=cn.prepareStatement("insert into user values(?,?,?,?,?)");
                         ps.setString(1,name);
                        ps.setString(2,gender);
                        ps.setString(3,password);
                        ps.setString(4,email);
                         ps.setString(5,ucode);
                        //ps.setString(6,ucode);
                        ps.execute();
                        cn.close();
                     /*Statement st = cn.createStatement();
                      st.execute("insert into user values('"+name+"','"+gender+"','"+password+"','"+email+"','"+ucode+"')");*/
                 response.sendRedirect("userlogin.jsp?signupsucc=1");
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
           
   %>     
