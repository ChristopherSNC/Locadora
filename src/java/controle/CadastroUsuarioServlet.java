/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.sun.xml.wss.impl.misc.DigestCertSelector;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import org.apache.commons.codec.digest.DigestUtils;
import persistencia.UsuarioDAO;

/**
 *
 * @author sala308b
 */
@WebServlet(name = "CadastroUsuarioServlet", urlPatterns = {"/CadastroUsuario"})
public class CadastroUsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String msgErro = "";
        
        String nome = request.getParameter("txtNome");
        String loginAux = request.getParameter("txtLogin");
        String senhaAux = request.getParameter("txtSenha");
        String perfil = request.getParameter("Perfil");
        String status = request.getParameter("Status");
        
        String login = "";
        String senha = "";
        
        if(nome.equals("")){
            msgErro = "Por favor digite seu nome";
        }else if(loginAux.contains(" ")){
            msgErro = "Não é permitido o uso de espaço para login";
        }else if (senhaAux.contains(" ")){
            msgErro = "Não é permitido o uso de espaço para senha";
        }else if(senhaAux.equals(loginAux)){
            msgErro = "Não é permitido o uso do login como senha";
        }else{
            try{
                login = loginAux;
                senha = DigestUtils.sha512Hex(senhaAux);
            }catch (Exception e){
                msgErro = "Login ou senha inválidos"; 
            }
            if(perfil.equals("Selecione um perfil")){
                msgErro = "Nenhum perfil selecionado";
            }else if(msgErro.isEmpty()){
                Usuario u = new Usuario();
                u.setNome(nome);
                u.setLogin(login);
                u.setSenha(senha);
                u.setPerfil(perfil);
                u.setStatus(status);
            try{
                UsuarioDAO usuarioDao = new UsuarioDAO();
                usuarioDao.inserirUsuario(u);
            }catch(Exception e){
                msgErro = "Falha ao inserir o usuário";
            }
            response.sendRedirect("JSP/CadastroUsuario.jsp");
        
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Algo inesperado aconteceu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Ocorreu um erro: " + msgErro + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
      }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}