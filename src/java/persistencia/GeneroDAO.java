package persistencia;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Genero;

public class GeneroDAO {

    private Connection conexao;

    public GeneroDAO() {
        conexao = ConexaoFactory.getConnection();
    }

    public boolean inserirGenero(Genero g) {

        boolean resultado = false;

        String sql = "INSERT INTO generos (nome, descricao) "
                + " VALUES (?, ?)";

        try {
            conexao.setAutoCommit(false);
            
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, g.getNome());
            stmt.setString(2, g.getDescricao());

            stmt.executeUpdate();

                conexao.commit();
                resultado = true;
         
            
        } catch (SQLException ex) {
            try {
                conexao.rollback();
            } catch (SQLException ex1) {
               JOptionPane.showMessageDialog(null,"Erro ao reverter a operação - " + ex1.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null,"Erro ao inserir o cliente - " + ex.getMessage());
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar conexão - " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        return resultado;
    }

//    public boolean inserirEndereco(Cliente cliente) throws SQLException {
//        //não coloquei try-catch para se der erro, 
//        //o erro será tratado no método inserirCliente;
//        boolean resultado = false;
//        
//        String sql = " INSERT INTO enderecos (rua, bairro, cod_cliente) "
//                + " VALUES (?, ?, ?)";
//
//        PreparedStatement stmt = conexao.prepareStatement(sql);
//        stmt.setString(1, cliente.getEndereco().getRua());
//        stmt.setString(2, cliente.getEndereco().getBairro());
//        stmt.setInt(3, cliente.getCodigo());
//
//        stmt.executeUpdate();
//        resultado = true;
//        
//        stmt.close();                
//        return resultado;
//    }

}
