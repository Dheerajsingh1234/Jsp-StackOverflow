package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class deletecatagory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("\n");

        Cookie c[]=request.getCookies();
        String email=null;
        for(int i =0;i<c.length;i++)
        {
            if(c[i].getName().equals("user"))
               email=c[i].getValue();
        }
     if(email!=null || session.getAttribute(email)!=null)
     {
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stackoverflow1","root","");
         Statement st=cn.createStatement();
         ResultSet rs=st.executeQuery("select * from catagory");

      out.write("     \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Glance Design Dashboard Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("<!-- font-awesome icons CSS -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!-- //font-awesome icons CSS -->\n");
      out.write("\n");
      out.write(" <!-- side nav css file -->\n");
      out.write(" <link href='css/SidebarNav.min.css' media='all' rel='stylesheet' type='text/css'/>\n");
      out.write(" <!-- side nav css file -->\n");
      out.write(" \n");
      out.write(" <!-- js-->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\n");
      out.write("<!--webfonts-->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext\" rel=\"stylesheet\">\n");
      out.write("<!--//webfonts--> \n");
      out.write("\n");
      out.write("<!-- Metis Menu -->\n");
      out.write("<script src=\"js/metisMenu.min.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("<link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("<!--//Metis Menu -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head> \n");
      out.write("\n");
      out.write("<body class=\"cbp-spmenu-push\">\n");
      out.write("\t<div class=\"main-content\">\n");
      out.write("\t<div class=\"cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left\" id=\"cbp-spmenu-s1\">\n");
      out.write("\t\t<!--left-fixed -navigation-->\n");
      out.write("\t\t<aside class=\"sidebar-left\">\n");
      out.write("      <nav class=\"navbar navbar-inverse\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".collapse\" aria-expanded=\"false\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\"><span class=\"fa fa-area-chart\"></span> Glance<span class=\"dashboard_text\">Design Dashboard</span></a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("            <ul class=\"sidebar-menu\">\n");
      out.write("              <li class=\"header\">MAIN NAVIGATION</li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"index.html\">\n");
      out.write("                <i class=\"fa fa-dashboard\"></i> <span>Admin</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("\t\t\t  <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                <i class=\"fa fa-laptop\"></i>\n");
      out.write("                <span>Catagory</span>\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"form.html\"><i class=\"fa fa-angle-right\"></i>Add</a></li>\n");
      out.write("                  <li><a href=\"form.html\"><i class=\"fa fa-angle-right\"></i> Delete</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"charts.html\">\n");
      out.write("                <i class=\"fa fa-pie-chart\"></i>\n");
      out.write("                <span>Charts</span>\n");
      out.write("                <span class=\"label label-primary pull-right\">new</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                <i class=\"fa fa-laptop\"></i>\n");
      out.write("                <span>UI Elements</span>\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"general.html\"><i class=\"fa fa-angle-right\"></i> General</a></li>\n");
      out.write("                  <li><a href=\"icons.html\"><i class=\"fa fa-angle-right\"></i> Icons</a></li>\n");
      out.write("                  <li><a href=\"buttons.html\"><i class=\"fa fa-angle-right\"></i> Buttons</a></li>\n");
      out.write("                  <li><a href=\"typography.html\"><i class=\"fa fa-angle-right\"></i> Typography</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"widgets.html\">\n");
      out.write("                <i class=\"fa fa-th\"></i> <span>Widgets</span>\n");
      out.write("                <small class=\"label pull-right label-info\">08</small>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                <i class=\"fa fa-edit\"></i> <span>Forms</span>\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"forms.html\"><i class=\"fa fa-angle-right\"></i> General Forms</a></li>\n");
      out.write("                  <li><a href=\"validation.html\"><i class=\"fa fa-angle-right\"></i> Form Validations</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                <i class=\"fa fa-table\"></i> <span>Tables</span>\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"tables.html\"><i class=\"fa fa-angle-right\"></i> Simple tables</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                <i class=\"fa fa-envelope\"></i> <span>Mailbox</span>\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i><small class=\"label pull-right label-info1\">08</small><span class=\"label label-primary1 pull-right\">02</span></a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"inbox.html\"><i class=\"fa fa-angle-right\"></i> Mail Inbox</a></li>\n");
      out.write("                  <li><a href=\"compose.html\"><i class=\"fa fa-angle-right\"></i> Compose Mail </a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                <i class=\"fa fa-folder\"></i> <span>Examples</span>\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"login.html\"><i class=\"fa fa-angle-right\"></i> Login</a></li>\n");
      out.write("                  <li><a href=\"signup.html\"><i class=\"fa fa-angle-right\"></i> Register</a></li>\n");
      out.write("                  <li><a href=\"404.html\"><i class=\"fa fa-angle-right\"></i> 404 Error</a></li>\n");
      out.write("                  <li><a href=\"500.html\"><i class=\"fa fa-angle-right\"></i> 500 Error</a></li>\n");
      out.write("                  <li><a href=\"blank-page.html\"><i class=\"fa fa-angle-right\"></i> Blank Page</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"header\">LABELS</li>\n");
      out.write("              <li><a href=\"#\"><i class=\"fa fa-angle-right text-red\"></i> <span>Important</span></a></li>\n");
      out.write("              <li><a href=\"#\"><i class=\"fa fa-angle-right text-yellow\"></i> <span>Warning</span></a></li>\n");
      out.write("              <li><a href=\"#\"><i class=\"fa fa-angle-right text-aqua\"></i> <span>Information</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <!-- /.navbar-collapse -->\n");
      out.write("      </nav>\n");
      out.write("    </aside>\n");
      out.write("\t</div>\n");
      out.write("\t\t<!--left-fixed -navigation-->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- header-starts -->\n");
      out.write("\t\t<div class=\"sticky-header header-section \">\n");
      out.write("\t\t\t<div class=\"header-left\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!--toggle button start-->\n");
      out.write("\t\t\t\t<button id=\"showLeftPush\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("\t\t\t\t<!--toggle button end-->\n");
      out.write("\t\t\t\t<div class=\"profile_details_left\"><!--notifications of menu start -->\n");
      out.write("\t\t\t\t\t<ul class=\"nofitications-dropdown\">\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown head-dpdn\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-envelope\"></i><span class=\"badge\">4</span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>You have 3 new messages</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"user_img\"><img src=\"images/1.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor amet</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"odd\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/4.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"user_img\"><img src=\"images/3.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">See all messages</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown head-dpdn\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-bell\"></i><span class=\"badge blue\">4</span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>You have 3 new notification</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/4.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor amet</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t <li class=\"odd\"><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/1.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t <li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user_img\"><img src=\"images/3.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"notification_desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor amet </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span>1 hour ago</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t <li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">See all notifications</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\t\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown head-dpdn\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa fa-tasks\"></i><span class=\"badge blue1\">8</span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>You have 8 pending task</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Database update</span><span class=\"percentage\">40%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"bar yellow\" style=\"width:40%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Dashboard done</span><span class=\"percentage\">90%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <div class=\"bar green\" style=\"width:90%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Mobile App</span><span class=\"percentage\">33%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <div class=\"bar red\" style=\"width: 33%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"task-desc\">Issues fixed</span><span class=\"percentage\">80%</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t   <div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <div class=\"bar  blue\" style=\"width: 80%;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"notification_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">See all pending tasks</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--notification menu end -->\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!--search-box-->\n");
      out.write("\t\t\t\t<div class=\"search-box\">\n");
      out.write("\t\t\t\t\t<form class=\"input\">\n");
      out.write("\t\t\t\t\t\t<input class=\"sb-search-input input__field--madoka\" placeholder=\"Search...\" type=\"search\" id=\"input-31\" />\n");
      out.write("\t\t\t\t\t\t<label class=\"input__label\" for=\"input-31\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"graphic\" width=\"100%\" height=\"100%\" viewBox=\"0 0 404 77\" preserveAspectRatio=\"none\">\n");
      out.write("\t\t\t\t\t\t\t\t<path d=\"m0,0l404,0l0,77l-404,0l0,-77z\"/>\n");
      out.write("\t\t\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div><!--//end-search-box-->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"profile_details\">\t\t\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown profile_details_drop\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"profile_img\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"prfil-img\"><img src=\"images/2.jpg\" alt=\"\"> </span> \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"user-name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Admin Name</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>Administrator</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-down lnr\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-up lnr\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li> <a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a> </li> \n");
      out.write("\t\t\t\t\t\t\t\t<li> <a href=\"#\"><i class=\"fa fa-user\"></i> My Account</a> </li>\n");
      out.write("\t\t\t\t\t\t\t\t<li> <a href=\"#\"><i class=\"fa fa-suitcase\"></i> Profile</a> </li> \n");
      out.write("\t\t\t\t\t\t\t\t<li> <a href=\"#\"><i class=\"fa fa-sign-out\"></i> Logout</a> </li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //header-ends -->\n");
      out.write("\t\t<!-- main content start-->\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t\t<div class=\"main-page\">\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\t\t\t\t<div class=\"forms\">\n");
      out.write("\t\t\t\t\t<h2 class=\"title1\">Forms</h2>\n");
      out.write("                                         <table class=\"table table-striped\">\n");
      out.write("                                                                          <thead>\n");
      out.write("                                                                            <tr>\n");
      out.write("                                                                              \n");
      out.write("                                                                              <th scope=\"col\">Sn</th>\n");
      out.write("                                                                              \n");
      out.write("                                                                              <th scope=\"col\">Question Catagory</th>\n");
      out.write("                                                                              <th scop=\"col\"> Catagory Discription</th>\n");
      out.write("                                                                              <th scop=\"col\"> Delete</th>\n");
      out.write("                                                                              \n");
      out.write("                                                                            </tr>\n");
      out.write("                                                                          </thead>\n");
      out.write("                                                                          <tbody>         \n");
      out.write("                                                                                        \n");
      out.write("                                                                                      \n");
      out.write("                                                                        ");
 
                                                            
                                                                            while(rs.next())
                                                                           {    

                                                                                      int sn=rs.getInt(1);
                                                                         
      out.write("             \n");
      out.write("                                                                               \n");
      out.write("                                                                                      <tr>\n");
      out.write("                                                                                          <td >");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("                                                                                                     \n");
      out.write("                                                                                              <td> ");
      out.print(rs.getString(2));
      out.write(" </td>\n");
      out.write("                                                                                              <td> ");
      out.print(rs.getString(3));
      out.write(" </td>\n");
      out.write("                                                                                              <td><a href=\"delete1.jsp?id=");
      out.print(sn);
      out.write("\"><button class=\"btn\"><i class=\"fa fa-trash\"></i>Delete</button></a></td> \n");
      out.write("                                                                                        </tr>  \n");
      out.write("                                                                                     ");
   
                                                                           
                                                                                                            }
                                                                                                        }
                                                                                                        catch(ClassNotFoundException e)
                                                                                                          {  out.print(e.getMessage()); 

                                                                                                        }  
                                                                                                        catch(SQLException e)
                                                                                                          {
                                                                                                            out.print(e.getMessage());
                                                                                                        }  
                                                                                                  
                                                                            
      out.write("\n");
      out.write("                                                                           \n");
      out.write("                                            </tbody>\n");
      out.write("                                      </table>\n");
      out.write("\t\t\t\t\t<div class=\"form-grids row widget-shadow\" data-example-id=\"basic-forms\"> \n");
      out.write("\t\t\t\t\t\t<div class=\"form-title\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Basic Form :</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-body\">\n");
      out.write("\t\t\t\t\t\t\t<form method=\"post\" action=\"addcatagory.jsp\"> \n");
      out.write("                                                            <div class=\"form-group\"> <label >Catagaory name</label> <input type=\"text\" class=\"form-control\" name=\"catagory\" placeholder=\"Catogaory Name\"> </div> \n");
      out.write("                                                            <div class=\"form-group\"> <label >Catagory Discription</label> <input type=\"text\" class=\"form-control\" name=\"discription\" placeholder=\"Catagaory Discription\"> </div> \n");
      out.write("                                                             <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("\t\t\t\t\t\t\t</form> \n");
      out.write("                                                    </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!--footer-->\n");
      out.write("\t\t\n");
      out.write("        <!--//footer-->\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t\n");
      out.write("\t<!-- side nav js -->\n");
      out.write("\t<script src='js/SidebarNav.min.js' type='text/javascript'></script>\n");
      out.write("\t<script>\n");
      out.write("      $('.sidebar-menu').SidebarNav()\n");
      out.write("    </script>\n");
      out.write("\t<!-- //side nav js -->\n");
      out.write("\t\n");
      out.write("\t<!-- Classie --><!-- for toggle left push menu script -->\n");
      out.write("\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\tvar menuLeft = document.getElementById( 'cbp-spmenu-s1' ),\n");
      out.write("\t\t\t\tshowLeftPush = document.getElementById( 'showLeftPush' ),\n");
      out.write("\t\t\t\tbody = document.body;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\tshowLeftPush.onclick = function() {\n");
      out.write("\t\t\t\tclassie.toggle( this, 'active' );\n");
      out.write("\t\t\t\tclassie.toggle( body, 'cbp-spmenu-push-toright' );\n");
      out.write("\t\t\t\tclassie.toggle( menuLeft, 'cbp-spmenu-open' );\n");
      out.write("\t\t\t\tdisableOther( 'showLeftPush' );\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction disableOther( button ) {\n");
      out.write("\t\t\t\tif( button !== 'showLeftPush' ) {\n");
      out.write("\t\t\t\t\tclassie.toggle( showLeftPush, 'disabled' );\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\t<!-- //Classie --><!-- //for toggle left push menu script -->\n");
      out.write("\t\n");
      out.write("\t<!--scrolling js-->\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\n");
      out.write("\t<!--//scrolling js-->\n");
      out.write("\t\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\n");
      out.write("   <script src=\"js/bootstrap.js\"> </script>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");

                     }
                     else
                         response.sendRedirect("admin.jsp?catemail=1");
          
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
