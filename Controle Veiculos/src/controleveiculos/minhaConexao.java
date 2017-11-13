package controleveiculos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class minhaConexao {

    public static Connection getConexao() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/Veiculo_BD";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao Banco");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Veiculo_BD", "root", "");

        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
