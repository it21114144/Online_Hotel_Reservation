/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-07 12:31:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updatecustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Edit Profile</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class = \"head\">\r\n");
      out.write("<p id=\"logo\" align = \"center\"> Paradise <span class = \"logonm\"> Beach Resort </span> </p> <img src = \"images/logo.jpg\" class = \"logo\"> \r\n");
      out.write("	<div class = \"topnav\"> \r\n");
      out.write("		<a class = \"active\" href = \"home.html\"> Home </a>\r\n");
      out.write("		<a class = \"active\" href = \"#\"> News </a>\r\n");
      out.write("		<a class = \"active\" href = \"#\"> About </a>\r\n");
      out.write("		<a class = \"active\" href = \"#\"> Rooms </a>\r\n");
      out.write("		<a class = \"active\" href = \"#\"> Feedback </a>\r\n");
      out.write("		<a class = \"active\" href = \"#\"> Blog </a>\r\n");
      out.write("		<a class = \"active\" href = \"#\"> Contact </a>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String nic = request.getParameter("nic");
		String username = request.getParameter("uname");
	
      out.write("\r\n");
      out.write("	<div class = \"center\" > <br>\r\n");
      out.write("	<h2 align = \"center\"> <u> Edit Profile </u> </h2> <br><br>\r\n");
      out.write("	<form action = \"update\" method = \"post\">\r\n");
      out.write("		Customer ID <input type = \"text\" name = \"cid\" value = \"");
      out.print( id);
      out.write("\" readonly> <br><br><br>\r\n");
      out.write("		Customer Name <input type = \"text\" name = \"name\" value = \"");
      out.print( name);
      out.write("\"> <br><br><br>\r\n");
      out.write("		E-mail <input type = \"text\" name = \"email\" value = \"");
      out.print( email);
      out.write("\"> <br><br><br>\r\n");
      out.write("		Phone Number <input type = \"text\" name = \"phone\" value = \"");
      out.print( phone);
      out.write("\"> <br><br><br>\r\n");
      out.write("		NIC <input type = \"text\" name = \"nic\" value = \"");
      out.print( nic);
      out.write("\" readonly> <br><br><br>\r\n");
      out.write("		User Name <input type = \"text\" name = \"uname\" value = \"");
      out.print( username);
      out.write("\"> <br><br><br>\r\n");
      out.write("		<div align = \"center\" >\r\n");
      out.write("		<input type = \"submit\" name = \"submit\" value = \"Update my Profile\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<footer>\r\n");
      out.write("<br>\r\n");
      out.write("	<div class = \"icon\">\r\n");
      out.write("		<p class = \"p3\">Follow Us !</p>\r\n");
      out.write("		<a href = \"#\"><img src = \"images/facebook1.png\" class = \"img\"> </a>\r\n");
      out.write("		<a href = \"#\"><img src = \"images/instagram.png\" class = \"img\"> </a>\r\n");
      out.write("		<a href = \"#\"><img src = \"images/twitter.png\" class = \"img\"></a>\r\n");
      out.write("		<a href = \"#\"><img src = \"images/linkedin.png\" class = \"img\"></a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class = \"contact\">\r\n");
      out.write("		<p class = \"c1\"> Contact Us !</p> <p class = \"c2\"> +94 011 2 345 678 <br> paradisebeachresort@company.com <br> www.paradisebeachresort.lk </p>\r\n");
      out.write("	</div>\r\n");
      out.write("	<h3> Copyright &copy; 2022 Paradise Beach Resort. All right reserved </h3><br><br>\r\n");
      out.write("</footer>\r\n");
      out.write("	<style>\r\n");
      out.write("		.logo{\r\n");
      out.write("			width:20%;\r\n");
      out.write("			height:60%;\r\n");
      out.write("			border-radius:50%;\r\n");
      out.write("			top:40px;\r\n");
      out.write("			position:absolute;\r\n");
      out.write("			left:5%;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.logonm{\r\n");
      out.write("			top:100px;\r\n");
      out.write("			font-size:70px;\r\n");
      out.write("			font-family:Freestyle Script;\r\n");
      out.write("			left:50%;\r\n");
      out.write("			position:absolute;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#logo{\r\n");
      out.write("			top:-60px;\r\n");
      out.write("			font-size:90px;\r\n");
      out.write("			transform:translate(-50% -50%);\r\n");
      out.write("			font-family:Jokerman;\r\n");
      out.write("			position:relative;\r\n");
      out.write("		}\r\n");
      out.write("	\r\n");
      out.write("		body{\r\n");
      out.write("			background-image:url(\"images/image1.jpg\");\r\n");
      out.write("			background-position:center;\r\n");
      out.write("			background-size:cover;\r\n");
      out.write("			width:400px;\r\n");
      out.write("			height:1600px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.center {\r\n");
      out.write("			box-shadow:0 5px 30px black;\r\n");
      out.write("			width:550px;\r\n");
      out.write("			height:675px;\r\n");
      out.write("			background-color:rgba(200 , 200 , 200 , 0.5);\r\n");
      out.write("			color:#000137;\r\n");
      out.write("			top:130%;\r\n");
      out.write("			left:50%;\r\n");
      out.write("			position:absolute;\r\n");
      out.write("			transform:translate(-50% , -50%);\r\n");
      out.write("			box-sizing:border-box;\r\n");
      out.write("			font-size:20px;\r\n");
      out.write("			font-weight:bold;\r\n");
      out.write("			padding:0px 50px;\r\n");
      out.write("		\r\n");
      out.write("		}\r\n");
      out.write("		label{\r\n");
      out.write("			font-size:20px;\r\n");
      out.write("			font-weight:bold;\r\n");
      out.write("			grid-row:auto;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		input[type = \"text\"] , [type = \"password\"]\r\n");
      out.write("		{\r\n");
      out.write("			width : 50% ;\r\n");
      out.write("			padding: 7px ;\r\n");
      out.write("			float:center;\r\n");
      out.write("			font-size:15px;\r\n");
      out.write("			border:2px solid;\r\n");
      out.write("			border-radius:16px;\r\n");
      out.write("		 	text-align: center;\r\n");
      out.write("		 	border-style:none;\r\n");
      out.write("		 	font-famity:calibri;\r\n");
      out.write("		 	backgrount-color:transparent;\r\n");
      out.write("		 	color:black;\r\n");
      out.write("		 	float:right;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		input[type = \"submit\"] {\r\n");
      out.write("		  background-color: #070b24;\r\n");
      out.write("		  color: white;\r\n");
      out.write("		  padding: 10px 20px;\r\n");
      out.write("		  margin: 8px 0;\r\n");
      out.write("		  border: none;\r\n");
      out.write("		  cursor: pointer;\r\n");
      out.write("		  font-size:16px;\r\n");
      out.write("		  border-radius:8px;\r\n");
      out.write("		  width: 45%;\r\n");
      out.write("		  font-weight:bold;\r\n");
      out.write("		  opacity:0.8;\r\n");
      out.write("		\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.text {\r\n");
      out.write("			font-size:20px;\r\n");
      out.write("			color:black;\r\n");
      out.write("			display:inline-block;\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("			\r\n");
      out.write("		\r\n");
      out.write("		a{\r\n");
      out.write("			text-decoration:none;\r\n");
      out.write("			color:white;\r\n");
      out.write("			font-size:18px;\r\n");
      out.write("			padding: 0px 3px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.topnav{\r\n");
      out.write("			background-color:#333;\r\n");
      out.write("			overflow:hidden;\r\n");
      out.write("			width:100%;\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.topnav a{\r\n");
      out.write("			float:left;\r\n");
      out.write("			color:#f2f2f2;\r\n");
      out.write("			text-align:center;\r\n");
      out.write("			padding:14px 18px;\r\n");
      out.write("			text-decoration:none;\r\n");
      out.write("			font-size:16px;\r\n");
      out.write("			font-family:calibri;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.topnav a:hover{\r\n");
      out.write("			background-color:#ddd;\r\n");
      out.write("			color:black;\r\n");
      out.write("		\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#log{\r\n");
      out.write("			float:right;\r\n");
      out.write("			background-color:#090825;\r\n");
      out.write("			color:white;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.head{\r\n");
      out.write("			background-color:#090825;\r\n");
      out.write("			background:rgba(100 , 100 , 100 , 0.7);\r\n");
      out.write("			position: absolute;\r\n");
      out.write("			top:0;\r\n");
      out.write("		  	left:0;\r\n");
      out.write("		  	right:0;\r\n");
      out.write("		  	width:100%;\r\n");
      out.write("		  	height:auto;\r\n");
      out.write("		  	padding-top:40px;\r\n");
      out.write("		  	color:#fff;\r\n");
      out.write("		 \r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		footer {\r\n");
      out.write("			  position: absolute;\r\n");
      out.write("			  right:0;\r\n");
      out.write("			  left:0;\r\n");
      out.write("			  bottom: -1000px;\r\n");
      out.write("			  height:60%;\r\n");
      out.write("			  width: 100%;\r\n");
      out.write("			  background: #111;\r\n");
      out.write("			  color:#fff;\r\n");
      out.write("			  background:rgba(0 , 0 , 0 , 0.9);\r\n");
      out.write("		\r\n");
      out.write("			}\r\n");
      out.write("		\r\n");
      out.write("		footer  h3{\r\n");
      out.write("		   color: grey;\r\n");
      out.write("		   text-align:left;\r\n");
      out.write("		   float:right;\r\n");
      out.write("		   font-family:calibri;\r\n");
      out.write("		   padding:50px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		.body{\r\n");
      out.write("			background-color:#333;\r\n");
      out.write("			overflow:hidden;\r\n");
      out.write("			width:50%;\r\n");
      out.write("			right:20px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.body a{\r\n");
      out.write("			float:left;\r\n");
      out.write("			color:#f2f2f2;\r\n");
      out.write("			text-align:center;\r\n");
      out.write("			padding:14px 20px;\r\n");
      out.write("			text-decoration:none;\r\n");
      out.write("			font-size:18px;\r\n");
      out.write("			font-family:calibri;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.body a:hover{\r\n");
      out.write("			background-color:#ddd;\r\n");
      out.write("			color:black;\r\n");
      out.write("		\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#aval{\r\n");
      out.write("			background-color:#090825;\r\n");
      out.write("			color:white;\r\n");
      out.write("			float:right;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.p2{\r\n");
      out.write("			font-family:sans-serif;\r\n");
      out.write("			color:#FFFDE7;\r\n");
      out.write("			font-size :20px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.p1{\r\n");
      out.write("			 font-size :60px;\r\n");
      out.write("			 color:#FFFDDD;\r\n");
      out.write("			 font-weight:bold;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.img{\r\n");
      out.write("			width:10%;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.icon{\r\n");
      out.write("			float:right;\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.p3{\r\n");
      out.write("			padding:0px 40px;\r\n");
      out.write("			font-size:22px;\r\n");
      out.write("			font-weight:bold;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.contact{\r\n");
      out.write("			 padding:10px 10px 10px 50px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.c1{\r\n");
      out.write("			font-size:22px;\r\n");
      out.write("			font-weight:bold;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.c2{\r\n");
      out.write("			font-size:20px;\r\n");
      out.write("			line-height:1.5;\r\n");
      out.write("			font-family:calibri;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</style>\r\n");
      out.write("	\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}