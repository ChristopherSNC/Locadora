/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author sala304b
 */
@WebFilter(filterName = "Permissao", urlPatterns = {"/CadastroUsuario.jsp"})

public class Permissao implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        Usuario usuario = (Usuario) req.getSession().getAttribute("usuarioAutenticado");
        if(usuario.getPerfil().equals("FUNC")){
            res.sendRedirect("JSP/PainelUsuario.jps");
        }else{
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        
    }
    
}
