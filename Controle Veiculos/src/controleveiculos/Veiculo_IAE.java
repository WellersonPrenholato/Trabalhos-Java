package controleveiculos;

import controleveiculos.logica.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Veiculo_IAE {

    private Connection conexao;

    public Veiculo_IAE() throws SQLException {
        this.conexao = minhaConexao.getConexao();
    }

    public void inserirVeiculo(Veiculo v1) throws SQLException {
        //Inserçao de Novo Veiculo no Banco de Dados
        String sql = "INSERT INTO Veiculo (placa, modelo, cor)"
                + "VALUES (?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        //SETA OS VALORES
        stmt.setString(1, v1.getPlaca());
        stmt.setString(2, v1.getModelo());
        stmt.setString(3, v1.getCor());

        //EXECUTA O CÓDIGO SQL
        stmt.execute();
        stmt.close();
    }

    public List<Veiculo> getLista(String placa) throws SQLException {
        String sql = "SELECT * FROM Veiculo WHERE placa LIKE ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, placa);
        ResultSet rs = stmt.executeQuery();

        List<Veiculo> minhaLista = new ArrayList<Veiculo>();

        while (rs.next()) {
            Veiculo v1 = new Veiculo();

            v1.setPlaca(rs.getString("placa"));
            v1.setModelo(rs.getString("modelo"));
            v1.setCor(rs.getString("cor"));
            minhaLista.add(v1);
        }
        rs.close();
        stmt.close();
        return minhaLista;
    }

    public void alterar(Veiculo v1) throws SQLException {
        String sql = "UPDATE Veiculo SET placa = ?, modelo = ?, cor = ? WHERE placa = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        //SETA OS VALORES
        stmt.setString(1, v1.getPlaca());
        stmt.setString(2, v1.getModelo());
        stmt.setString(3, v1.getCor());
        stmt.setString(4, v1.getPlaca());

        //EXECUTA O CODIGO SQL
        stmt.execute();
        stmt.close();
    }

    public void excluir(Veiculo v1) throws SQLException {
        String sql = "DELETE FROM Veiculo WHERE placa = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, v1.getPlaca());
        stmt.execute();
        stmt.close();

    }
}

