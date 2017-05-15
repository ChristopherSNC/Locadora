package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro de Usuários</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastrar Usuario</h1>\n");
      out.write("        <hr>\n");
      out.write("        <a href=\"javascript:history.back()\">Voltar</a><br><br>\n");
      out.write("        <form action=\"CadastroUsuario\">\n");
      out.write("            <label>Nome:</label>\n");
      out.write("            <input type=\"text\" name=\"txtNome\"><br><br>\n");
      out.write("            <label>Login:</label>\n");
      out.write("            <input type=\"text\" minlength=\"5\" name=\"txtLogin\"><br><br>\n");
      out.write("            <label>Senha:</label>\n");
      out.write("            <input type=\"password\" minlength=\"6\" maxlength=\"6\" name=\"txtSenha\"><br><br>\n");
      out.write("            <label>Perfil:</label><br>\n");
      out.write("            <select name=\"Perfil\">\n");
      out.write("                <option value=\"Select\">Selecione um perfil</option>>\n");
      out.write("                <option value=\"ADM\">Administrador</option>\n");
      out.write("                <option value=\"FUNC\">Funcionário</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            <label>Status:</label><br>\n");
      out.write("            <input type=\"radio\" name=\"Status\" value=\"Ativo\" checked=\"checked\" />Ativo\n");
      out.write("            <input type=\"radio\" name=\"Status\" value=\"Inativo\" />Inativo<br><br>\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\"><br>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
