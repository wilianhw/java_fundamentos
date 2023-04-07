package aula49.jdbc.dao.jdbc;

import aula49.jdbc.dao.ClienteDAO;
import aula49.jdbc.dao.DAOFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDAOFactory extends DAOFactory {

    private Connection connection;

    public JdbcDAOFactory() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cadastro_cliente", "postgres", "postgres");
        } catch (Exception e) {
            throw new RuntimeException("Tentando recuperar conecção com o banco");
        }
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return new JdbcClienteDAO(this.connection);
    }
}
