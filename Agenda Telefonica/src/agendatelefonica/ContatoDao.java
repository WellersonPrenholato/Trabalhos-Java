package agendatelefonica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    private Connection conexao;

    public ContatoDao() throws SQLException {
        this.conexao = minhaConexao.getConexao();
    }
    
    public void inserirContato(Contato c1) throws SQLException {
        
        //Inserçao de Novo Contato no Banco de Dados
        String sql = "INSERT INTO Clientes (nome, cpf, numero, email, endereco, telefone, bairro)"
                + "VALUES (?,?,?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        //SETA OS VALORES
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getCpf());
        stmt.setString(3, c1.getNumero());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getEndereco());
        stmt.setString(6, c1.getTelefone());
        stmt.setString(7, c1.getBairro());

        //EXECUTA O CÓDIGO SQL
        stmt.execute();
        stmt.close();
    }
    
    public List<Contato>getLista(String nome)throws SQLException{
        String sql = "SELECT * FROM Clientes WHERE nome LIKE ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        
        List<Contato> minhaLista = new ArrayList<>();
        
        while (rs.next()){
            Contato c1 = new Contato();
            c1.setId(Long.valueOf(rs.getString("Id")));
            c1.setNome(rs.getString("nome"));
            c1.setCpf(rs.getString("cpf"));
            c1.setEndereco(rs.getString("endereco"));
            c1.setNumero(rs.getString("numero"));
            c1.setEmail(rs.getString("email"));
            c1.setTelefone(rs.getString("telefone"));
            c1.setBairro(rs.getString("bairro"));
            minhaLista.add(c1);
        }
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public List<Contato>listarContatos(String nome) throws SQLException{
        List<Contato> contatos = new ArrayList();
        
        String sql = "SELECT * FROM Clientes WHERE Nome LIKE ?";
        PreparedStatement pstm = this.conexao.prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery();
        
        while (rs.next()){
            Contato c1 = new Contato();
            c1.setNome(rs.getString("nome"));
            c1.setCpf(rs.getString("cpf"));
            c1.setEndereco(rs.getString("endereco"));
            c1.setNumero(rs.getString("numero"));
            c1.setEmail(rs.getString("email"));
            c1.setTelefone(rs.getString("telefone"));
            c1.setBairro(rs.getString("bairro"));
            contatos.add(c1);
        }
        rs.close();
        pstm.close();
        return contatos;
    }
    
    public void alterar (Contato c1) throws SQLException{
        String sql = "UPDATE Clientes SET Nome= ?, Cpf= ?, Endereco= ?," + 
                "Numero= ?, Email= ?, Telefone= ?, Bairro=? WHERE ID= ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getCpf());
        stmt.setString(3, c1.getEndereco());
        stmt.setString(4, c1.getNumero());
        stmt.setString(5, c1.getEmail());
        stmt.setString(6, c1.getTelefone());
        stmt.setString(7, c1.getBairro());
        
        stmt.execute();
        stmt.close();
    }
    
    public void remover (Contato c1) throws SQLException {
        String sql = "DELETE FROM Clientes WHERE ID = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1, c1.getId());
        stmt.execute();
        stmt.close();       
    }
}
