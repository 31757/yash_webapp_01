/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-10-25 11:27:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class billing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Credit Card Payment with Stripe (updated) - Bootsnipp.com</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    /* Padding - just for asthetics on Bootsnipp.com */\r\n");
      out.write("body { margin-top:20px; }\r\n");
      out.write("\r\n");
      out.write("/* CSS for Credit Card Payment form */\r\n");
      out.write(".credit-card-box .panel-title {\r\n");
      out.write("    display: inline;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".credit-card-box .form-control.error {\r\n");
      out.write("    border-color: red;\r\n");
      out.write("    outline: 0;\r\n");
      out.write("    box-shadow: inset 0 1px 1px rgba(0,0,0,0.075),0 0 8px rgba(255,0,0,0.6);\r\n");
      out.write("}\r\n");
      out.write(".credit-card-box label.error {\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: red;\r\n");
      out.write("  padding: 2px 8px;\r\n");
      out.write("  margin-top: 2px;\r\n");
      out.write("}\r\n");
      out.write(".credit-card-box .payment-errors {\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: red;\r\n");
      out.write("  padding: 2px 8px;\r\n");
      out.write("  margin-top: 2px;\r\n");
      out.write("}\r\n");
      out.write(".credit-card-box label {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("/* The old \"center div vertically\" hack */\r\n");
      out.write(".credit-card-box .display-table {\r\n");
      out.write("    display: table;\r\n");
      out.write("}\r\n");
      out.write(".credit-card-box .display-tr {\r\n");
      out.write("    display: table-row;\r\n");
      out.write("}\r\n");
      out.write(".credit-card-box .display-td {\r\n");
      out.write("    display: table-cell;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    width: 50%;\r\n");
      out.write("}\r\n");
      out.write("/* Just looks nicer */\r\n");
      out.write(".credit-card-box .panel-heading img {\r\n");
      out.write("    min-width: 180px;\r\n");
      out.write("}\r\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
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
      out.write("  \r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
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
      out.write("<!-- Finish adding tags -->\r\n");
      out.write("  \r\n");
      out.write("<title>VanuShopping-Payment Portal</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#footer{background:#336; padding-top:30px; padding-bottom:30px; text-align:center; border-top:solid 4px #303}\r\n");
      out.write("#footer p{padding:10px; color:#fff}\r\n");
      out.write(".dont-remove{color:#fff !important; text-decoration:none !important; font-weight:700}\r\n");
      out.write(".rights{display:inline-block; border-top:solid 1px rgba(103, 58, 183, 0.3)}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url('http://crunchify.com/bg.png');\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">&nbsp;</div>\r\n");
      out.write("<div class=\"container\">&nbsp;</div>\r\n");
      out.write("<div class=\"container\">&nbsp;</div>\r\n");
      out.write("<div class=\"container\">&nbsp;</div>\r\n");
      out.write("<div class=\"container\">&nbsp;</div>\r\n");
      out.write("<div class=\"container\">&nbsp;</div>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.payment/1.2.3/jquery.payment.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- If you're using Stripe for payments -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://js.stripe.com/v2/\"></script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <!-- You can make it whatever width you want. I'm making it full width\r\n");
      out.write("             on <= small devices and 4/12 page width on >= medium devices -->\r\n");
      out.write("        <div class=\"col-xs-12 col-md-4\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("            <!-- CREDIT CARD FORM STARTS HERE -->\r\n");
      out.write("            <div class=\"panel panel-default credit-card-box\">\r\n");
      out.write("                <div class=\"panel-heading display-table\" >\r\n");
      out.write("                    <div class=\"row display-tr\" >\r\n");
      out.write("                        <h3 class=\"panel-title display-td\" >Payment Details</h3>\r\n");
      out.write("                        <div class=\"display-td\" >                            \r\n");
      out.write("                            <img class=\"img-responsive pull-right\" src=\"http://i76.imgup.net/accepted_c22e0.png\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <form role=\"form\" id=\"payment-form\" method=\"POST\" action=\"javascript:void(0);\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xs-12\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"cardNumber\">CARD NUMBER</label>\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <input \r\n");
      out.write("                                            type=\"tel\"\r\n");
      out.write("                                            class=\"form-control\"\r\n");
      out.write("                                            name=\"cardNumber\"\r\n");
      out.write("                                            placeholder=\"Valid Card Number\"\r\n");
      out.write("                                            autocomplete=\"cc-number\"\r\n");
      out.write("                                            required autofocus \r\n");
      out.write("                                        />\r\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"fa fa-credit-card\"></i></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>                            \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xs-7 col-md-7\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"cardExpiry\"><span class=\"hidden-xs\">EXPIRATION</span><span class=\"visible-xs-inline\">EXP</span> DATE</label>\r\n");
      out.write("                                    <input \r\n");
      out.write("                                        type=\"tel\" \r\n");
      out.write("                                        class=\"form-control\" \r\n");
      out.write("                                        name=\"cardExpiry\"\r\n");
      out.write("                                        placeholder=\"MM / YY\"\r\n");
      out.write("                                        autocomplete=\"cc-exp\"\r\n");
      out.write("                                        required \r\n");
      out.write("                                    />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xs-5 col-md-5 pull-right\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"cardCVC\">CV CODE</label>\r\n");
      out.write("                                    <input \r\n");
      out.write("                                        type=\"tel\" \r\n");
      out.write("                                        class=\"form-control\"\r\n");
      out.write("                                        name=\"cardCVC\"\r\n");
      out.write("                                        placeholder=\"CVC\"\r\n");
      out.write("                                        autocomplete=\"cc-csc\"\r\n");
      out.write("                                        required\r\n");
      out.write("                                    />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xs-12\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"couponCode\">COUPON CODE</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"couponCode\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xs-12\">\r\n");
      out.write("                                <h3><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/index\">Pay Amount</a></h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\" style=\"display:none;\">\r\n");
      out.write("                            <div class=\"col-xs-12\">\r\n");
      out.write("                                <p class=\"payment-errors\"></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>            \r\n");
      out.write("            <!-- CREDIT CARD FORM ENDS HERE -->\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>            \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"col-xs-12 col-md-8\" style=\"font-size: 12pt; line-height: 2em;\">\r\n");
      out.write("            <p><h1>Features:</h1>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Low service charge</li>\r\n");
      out.write("                    <li>Secure payment portal</li>\r\n");
      out.write("                    <li>Card details stored for future preferences</li>\r\n");
      out.write("                    <li>Instant Payment</li>\r\n");
      out.write("                    <li>No Cash On delivery</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t/*\r\n");
      out.write("\r\n");
      out.write("*/\r\n");
      out.write("var $form = $('#payment-form');\r\n");
      out.write("$form.find('.subscribe').on('click', payWithStripe);\r\n");
      out.write("\r\n");
      out.write("/* If you're using Stripe for payments */\r\n");
      out.write("function payWithStripe(e) {\r\n");
      out.write("    e.preventDefault();\r\n");
      out.write("    \r\n");
      out.write("    /* Abort if invalid form data */\r\n");
      out.write("    if (!validator.form()) {\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Visual feedback */\r\n");
      out.write("    $form.find('.subscribe').html('Validating <i class=\"fa fa-spinner fa-pulse\"></i>').prop('disabled', true);\r\n");
      out.write("\r\n");
      out.write("    var PublishableKey = 'pk_test_6pRNASCoBOKtIshFeQd4XMUh'; // Replace with your API publishable key\r\n");
      out.write("    Stripe.setPublishableKey(PublishableKey);\r\n");
      out.write("    \r\n");
      out.write("    /* Create token */\r\n");
      out.write("    var expiry = $form.find('[name=cardExpiry]').payment('cardExpiryVal');\r\n");
      out.write("    var ccData = {\r\n");
      out.write("        number: $form.find('[name=cardNumber]').val().replace(/\\s/g,''),\r\n");
      out.write("        cvc: $form.find('[name=cardCVC]').val(),\r\n");
      out.write("        exp_month: expiry.month, \r\n");
      out.write("        exp_year: expiry.year\r\n");
      out.write("    };\r\n");
      out.write("    \r\n");
      out.write("    Stripe.card.createToken(ccData, function stripeResponseHandler(status, response) {\r\n");
      out.write("        if (response.error) {\r\n");
      out.write("            /* Visual feedback */\r\n");
      out.write("            $form.find('.subscribe').html('Try again').prop('disabled', false);\r\n");
      out.write("            /* Show Stripe errors on the form */\r\n");
      out.write("            $form.find('.payment-errors').text(response.error.message);\r\n");
      out.write("            $form.find('.payment-errors').closest('.row').show();\r\n");
      out.write("        } else {\r\n");
      out.write("            /* Visual feedback */\r\n");
      out.write("            $form.find('.subscribe').html('Processing <i class=\"fa fa-spinner fa-pulse\"></i>');\r\n");
      out.write("            /* Hide Stripe errors on the form */\r\n");
      out.write("            $form.find('.payment-errors').closest('.row').hide();\r\n");
      out.write("            $form.find('.payment-errors').text(\"\");\r\n");
      out.write("            // response contains id and card, which contains additional card details            \r\n");
      out.write("            console.log(response.id);\r\n");
      out.write("            console.log(response.card);\r\n");
      out.write("            var token = response.id;\r\n");
      out.write("            // AJAX - you would send 'token' to your server here.\r\n");
      out.write("            $.post('/account/stripe_card_token', {\r\n");
      out.write("                    token: token\r\n");
      out.write("                })\r\n");
      out.write("                // Assign handlers immediately after making the request,\r\n");
      out.write("                .done(function(data, textStatus, jqXHR) {\r\n");
      out.write("                    $form.find('.subscribe').html('Payment successful <i class=\"fa fa-check\"></i>');\r\n");
      out.write("                })\r\n");
      out.write("                .fail(function(jqXHR, textStatus, errorThrown) {\r\n");
      out.write("                    $form.find('.subscribe').html('There was a problem').removeClass('success').addClass('error');\r\n");
      out.write("                    /* Show Stripe errors on the form */\r\n");
      out.write("                    $form.find('.payment-errors').text('Try refreshing the page and trying again.');\r\n");
      out.write("                    $form.find('.payment-errors').closest('.row').show();\r\n");
      out.write("                });\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("/* Fancy restrictive input formatting via jQuery.payment library*/\r\n");
      out.write("$('input[name=cardNumber]').payment('formatCardNumber');\r\n");
      out.write("$('input[name=cardCVC]').payment('formatCardCVC');\r\n");
      out.write("$('input[name=cardExpiry').payment('formatCardExpiry');\r\n");
      out.write("\r\n");
      out.write("/* Form validation using Stripe client-side validation helpers */\r\n");
      out.write("jQuery.validator.addMethod(\"cardNumber\", function(value, element) {\r\n");
      out.write("    return this.optional(element) || Stripe.card.validateCardNumber(value);\r\n");
      out.write("}, \"Please specify a valid credit card number.\");\r\n");
      out.write("\r\n");
      out.write("jQuery.validator.addMethod(\"cardExpiry\", function(value, element) {    \r\n");
      out.write("    /* Parsing month/year uses jQuery.payment library */\r\n");
      out.write("    value = $.payment.cardExpiryVal(value);\r\n");
      out.write("    return this.optional(element) || Stripe.card.validateExpiry(value.month, value.year);\r\n");
      out.write("}, \"Invalid expiration date.\");\r\n");
      out.write("\r\n");
      out.write("jQuery.validator.addMethod(\"cardCVC\", function(value, element) {\r\n");
      out.write("    return this.optional(element) || Stripe.card.validateCVC(value);\r\n");
      out.write("}, \"Invalid CVC.\");\r\n");
      out.write("\r\n");
      out.write("validator = $form.validate({\r\n");
      out.write("    rules: {\r\n");
      out.write("        cardNumber: {\r\n");
      out.write("            required: true,\r\n");
      out.write("            cardNumber: true            \r\n");
      out.write("        },\r\n");
      out.write("        cardExpiry: {\r\n");
      out.write("            required: true,\r\n");
      out.write("            cardExpiry: true\r\n");
      out.write("        },\r\n");
      out.write("        cardCVC: {\r\n");
      out.write("            required: true,\r\n");
      out.write("            cardCVC: true\r\n");
      out.write("        }\r\n");
      out.write("    },\r\n");
      out.write("    highlight: function(element) {\r\n");
      out.write("        $(element).closest('.form-control').removeClass('success').addClass('error');\r\n");
      out.write("    },\r\n");
      out.write("    unhighlight: function(element) {\r\n");
      out.write("        $(element).closest('.form-control').removeClass('error').addClass('success');\r\n");
      out.write("    },\r\n");
      out.write("    errorPlacement: function(error, element) {\r\n");
      out.write("        $(element).closest('.form-group').append(error);\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("paymentFormReady = function() {\r\n");
      out.write("    if ($form.find('[name=cardNumber]').hasClass(\"success\") &&\r\n");
      out.write("        $form.find('[name=cardExpiry]').hasClass(\"success\") &&\r\n");
      out.write("        $form.find('[name=cardCVC]').val().length > 1) {\r\n");
      out.write("        return true;\r\n");
      out.write("    } else {\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$form.find('.subscribe').prop('disabled', true);\r\n");
      out.write("var readyInterval = setInterval(function() {\r\n");
      out.write("    if (paymentFormReady()) {\r\n");
      out.write("        $form.find('.subscribe').prop('disabled', false);\r\n");
      out.write("        clearInterval(readyInterval);\r\n");
      out.write("    }\r\n");
      out.write("}, 250);\r\n");
      out.write("\t</script>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
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