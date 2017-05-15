/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;



/**
 *
 * @author sala308b
 */
public class Filmes {
   private int codigo;
   private String titulo;
   private Genero Genero;
   private String sinopse;
   private String diretor;
   private int anoLancamento;
   private String status;
   private Usuario usuarioCadastro;
   private Date datahoraCadastro;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the anoLancamento
     */
    public int getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * @param anoLancamento the anoLancamento to set
     */
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the usuarioCadastro
     */
    

    /**
     * @return the datahoraCadastro
     */
    public Date getDatahoraCadastro() {
        return datahoraCadastro;
    }

    /**
     * @param datahoraCadastro the datahoraCadastro to set
     */
    public void setDatahoraCadastro(Date datahoraCadastro) {
        this.datahoraCadastro = datahoraCadastro;
    }

    /**
     * @return the Genero
     */
    public Genero getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(Genero Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the usuarioCadastro
     */
    public Usuario getUsuarioCadastro() {
        return usuarioCadastro;
    }

    /**
     * @param usuarioCadastro the usuarioCadastro to set
     */
    public void setUsuarioCadastro(Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }
}
