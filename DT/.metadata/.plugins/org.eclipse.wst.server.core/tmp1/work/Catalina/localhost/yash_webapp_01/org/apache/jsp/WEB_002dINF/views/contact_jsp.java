/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-10-25 13:10:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"robots\" content=\"noindex\">\r\n");
      out.write("\r\n");
      out.write("    <title>contact</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./resources/my.css\">\r\n");
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/demo.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/footer-basic-centered.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./resources/crunchify.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js></script>\r\n");
      out.write("<script src=https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script>!function(e,a,t,n,c,o,s){e.GoogleAnalyticsObject=c,e[c]=e[c]||function(){(e[c].q=e[c].q||[]).push(arguments)},e[c].l=1*new Date,o=a.createElement(t),s=a.getElementsByTagName(t)[0],o.async=1,o.src=n,s.parentNode.insertBefore(o,s)}(window,document,\"script\",\"//www.google-analytics.com/analytics.js\",\"ga\"),ga(\"create\",\"UA-47210639-2\",\"auto\"),ga(\"send\",\"pageview\")</script><script type=application/ld+json>{ \"@context\": \"http://schema.org/\",\"@type\": \"Review\",\"itemReviewed\": {\"@type\": \"Thing\",\"name\": \"Article\"},\"author\": {\"@type\": \"Person\",\"name\": \"Md Ashraf Malik\"}, \"reviewRating\": {\"@type\": \"Rating\",\"ratingValue\": \"5\",\"bestRating\": \"5\"}, \"publisher\": { \"@type\": \"Organization\", \"name\": \"Web Developer Bareilly\" } }</script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("/* header */\r\n");
      out.write("html,body{height:100%; width:100%}\r\n");
      out.write("h1,h2,h3{font-weight:700}\r\n");
      out.write("header{position:relative; width:100%; background-size:cover; background-position:center; background-image:url(images/header.jpg); text-align:center}\r\n");
      out.write("header .wel{position: relative;text-align: center;padding: 100px 15px 100px;width: 100%; color:#eee}\r\n");
      out.write(".wel h1{font-weight:700; color:#fff}.brk{height:4px; border-radius:4px; background:#d9534f; margin:25px auto; display:block; width:60px}\r\n");
      out.write(".abs-back{background:rgba(29, 21, 24, 0.4); position:absolute; height:100%; width:100%; left:0; top:0}\r\n");
      out.write("/* who we */\r\n");
      out.write(".who-we{margin-top:50px; margin-bottom:50px}\r\n");
      out.write(".who-we h2{color:#d9534f;}\r\n");
      out.write("/* cards*/\r\n");
      out.write(".cards-row{padding-top:70px; padding-bottom:50px; background:#eee}\r\n");
      out.write(".thumbnail{padding:0; border-radius:0; border:none; box-shadow:0 2px 2px 0 rgba(0,0,0,.14),0 3px 1px -2px rgba(0,0,0,.2),0 1px 5px 0 rgba(0,0,0,.12)}\r\n");
      out.write(".thumbnail>img{width:100%; display:block}\r\n");
      out.write(".thumbnail h3{font-size:26px; color:#336}\r\n");
      out.write(".thumbnail h3,.card-description{margin:0; padding:8px 0; border-bottom:solid 1px #eee; text-align:center}\r\n");
      out.write(".thumbnail p{padding-top:8px; font-size:20px}\r\n");
      out.write(".thumbnail .btn{border-radius:0; box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12); font-size:20px}\r\n");
      out.write(".team-pic{height:150px !important; width:150px !important; border-radius:50%; margin-top:-75px; box-shadow:0 2px 5px 0 rgba(0,0,0,.4),0 2px 10px 0 rgba(0,0,0,.5); transition:all .2s ease-out}\r\n");
      out.write(".thumbnail:hover .team-pic{height:200px !important; width:200px !important; margin-top:-100px}\r\n");
      out.write(".thumbnail p.social{padding-top:15px; text-align:center}\r\n");
      out.write(".social a{color:#FFF; font-size:18px !important}\r\n");
      out.write(".social i.fa{height:36px; width:36px; text-align:center; line-height:36px; background:#069; border-radius:50%}\r\n");
      out.write(".social i.fa.fa-facebook{background:#43609C}\r\n");
      out.write(".social i.fa.fa-twitter{background:#2CA8D2}\r\n");
      out.write(".social i.fa.fa-linkedin{background:#428099}\r\n");
      out.write(".social i.fa.fa-google-plus{background:#ce4d39}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* media */\r\n");
      out.write("@media (min-width:768px) { \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    .contact-form {\r\n");
      out.write("    margin-top:70px;\r\n");
      out.write("}\r\n");
      out.write("#footer{background:#336; padding-top:30px; padding-bottom:30px; text-align:center; border-top:solid 4px #303}\r\n");
      out.write("#footer p{padding:10px; color:#fff}\r\n");
      out.write(".dont-remove{color:#fff !important; text-decoration:none !important; font-weight:700}\r\n");
      out.write(".rights{display:inline-block; border-top:solid 1px rgba(103, 58, 183, 0.3)}\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        window.alert = function(){};\r\n");
      out.write("        var defaultCSS = document.getElementById('bootstrap-css');\r\n");
      out.write("        function changeCSS(css){\r\n");
      out.write("            if(css) $('head > link').filter(':first').replaceWith('<link rel=\"stylesheet\" href=\"'+ css +'\" type=\"text/css\" />'); \r\n");
      out.write("            else $('head > link').filter(':first').replaceWith(defaultCSS); \r\n");
      out.write("        }\r\n");
      out.write("        $( document ).ready(function() {\r\n");
      out.write("          var iframe_height = parseInt($('html').height()); \r\n");
      out.write("          window.parent.postMessage( iframe_height, 'http://bootsnipp.com');\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<section class=\"content\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-sm-4\">\r\n");
      out.write("<div class=\"col-xs-12\" style=\"height:50px;\"></div>\r\n");
      out.write("<div class=\"col-xs-12\" style=\"height:50px;\"></div>\r\n");
      out.write("\r\n");
      out.write("<h3>VanuShopping Customer Support </h3>\r\n");
      out.write("<hr>\r\n");
      out.write("<address>\r\n");
      out.write("\r\n");
      out.write("<strong>Head Quarters address:</strong><br>VanuShopping Ltd.<br>Vanu Garden Square<br>100 ft road,Gandhipuram,Coimbatore<br>\r\n");
      out.write("<strong>Phone:</strong> 0422-2250773<br>\r\n");
      out.write("<strong>E-mail:</strong>reachustotellus@vanushopping.com\r\n");
      out.write("</address>\r\n");
      out.write("\r\n");
      out.write("<address>\r\n");
      out.write("<strong>Germany Branch Address:</strong> VanuShopping Ltd., Morsering 2, Munich 80937 Germany , <br>\r\n");
      out.write("<strong>Phone:</strong> +49 151 2757 2810\r\n");
      out.write("</address>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<div class=\"col-sm-8 contact-form\">\r\n");
      out.write("<div class=\"col-xs-12\" style=\"height:50px;\"></div>\r\n");
      out.write("<div class=\"col-xs-12\" style=\"height:50px;\"></div>\r\n");
      out.write("<form id=\"contact\" method=\"post\" class=\"form\" role=\"form\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-xs-6 col-md-6 form-group\">\r\n");
      out.write("<input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\" type=\"text\" required autofocus />\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-xs-6 col-md-6 form-group\">\r\n");
      out.write("<input class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\" type=\"email\" required />\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<textarea class=\"form-control\" id=\"message\" name=\"message\" placeholder=\"Message\" rows=\"5\"></textarea>\r\n");
      out.write("<br />\r\n");
      out.write("<div class=\"row\"></div>\r\n");
      out.write("<div class=\"col-xs-12 col-md-12 form-group\"></div>\r\n");
      out.write("<button class=\"btn btn-primary pull-right\" type=\"submit\">Submit</button>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-xs-12\" style=\"height:50px;\"></div>\r\n");
      out.write("\t<div class=\"col-xs-12\" style=\"height:50px;\"></div>\r\n");
      out.write("\t<div class=\"col-xs-12\" style=\"height:50px;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("        </section>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("    &nbsp;\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
