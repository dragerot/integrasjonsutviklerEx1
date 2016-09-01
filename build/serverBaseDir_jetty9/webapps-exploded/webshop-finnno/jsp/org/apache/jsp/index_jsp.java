package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import integrasjon.errorcodes.BusinessFaultCodes;
import integrasjon.errorcodes.SystemFaultCodes;
import java.util.Arrays;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>webshop-finnno</h2>\r\n");
      out.write("\r\n");
      out.write("<p>Business Faults</p>\r\n");
      out.write("<table border=1>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>Code</th>\r\n");
      out.write("        <th>Message</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    ");

        List<BusinessFaultCodes> values = Arrays.asList(BusinessFaultCodes.values());
        for (BusinessFaultCodes businessFaultCodes : values){
    
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>");
      out.print( businessFaultCodes.getCode() );
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( businessFaultCodes.getMessage() );
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p>System Faults</p>\r\n");
      out.write("<table border=1>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>Code</th>\r\n");
      out.write("        <th>Message</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    ");

        List<SystemFaultCodes> codeValues = Arrays.asList(SystemFaultCodes.values());
        for (SystemFaultCodes systemFaultCodes : codeValues){
    
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>");
      out.print( systemFaultCodes.getCode() );
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( systemFaultCodes.getMessage() );
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>");
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
