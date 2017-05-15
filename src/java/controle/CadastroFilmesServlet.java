/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Filmes;
import modelo.Genero;
import modelo.Usuario;
import persistencia.FilmesDAO;
import utilidades.PersonalizarMsgErro;

/**
 *
 * @author sala308b
 */
@WebServlet(name = "CadastroFilmesServlet", urlPatterns = {"/CadastroFilmes"})
public class CadastroFilmesServlet extends HttpServlet {

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
        
        String titulo = request.getParameter("txtTitulo");
        String codGenero = request.getParameter("Genero");
        String sinopse = request.getParameter("txtSinopse");
        String diretor = request.getParameter("txtDiretor");
        String anoLancamento = request.getParameter("txtAnoLancamento");
        String status = request.getParameter("Status");
        
        if(codGenero.equals("")){
            msgErro = "Um filme não pode ser cadastrado sem um Gênero";
        }else{
        Genero g = new Genero(Integer.parseInt(codGenero));
        Usuario u = new Usuario("admin");
        
        Filmes f = new Filmes();
        f.setTitulo(titulo);
        f.setGenero(g);
        f.setSinopse(sinopse);
        f.setDiretor(diretor);
        f.setAnoLancamento(0);
        f.setStatus(status);
        f.setUsuarioCadastro(u);
        f.setDatahoraCadastro(new Date());
        
        
      
        
        try{
            FilmesDAO filmesDao = new FilmesDAO();
            filmesDao.inserirFilmes(f);
        }catch (Exception e){
            msgErro = PersonalizarMsgErro.getMensagem(e.getMessage());
        }
        }
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroFilmesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroFilmesServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
