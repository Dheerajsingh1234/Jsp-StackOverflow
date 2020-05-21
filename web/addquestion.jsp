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
    if(email!=null || session.getAttribute(email)!=null)
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
        Statement st=cn.createStatement();
        Statement st1=cn.createStatement();
        int sn=0;
        ResultSet rs=st1.executeQuery("select max(Sn) from question ");
        if(rs.next())
       {
            sn=rs.getInt(1);
        }
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
                  
        sn=sn+1;
        String time=new java.util.Date().toLocaleString();
        String discription =request.getParameter("discription");
        String title=request.getParameter("title");
        String catagory=request.getParameter("cat1");
        PreparedStatement ps=cn.prepareStatement("insert into question values(?,?,?,?,?,?)");
        ps.setInt(1,sn);
        ps.setString(2,title);
        ps.setString(3,discription);
        ps.setString(4,catagory);
         ps.setString(5,time);
        ps.setString(6,ucode);
        ps.execute();
        cn.close();
        
       // st.execute("insert into question values('"+sn+"','"+title+"','"+discription+"','"+catagory+"','"+time+"','"+ucode+"')");
        response.sendRedirect("userindex.jsp");
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
