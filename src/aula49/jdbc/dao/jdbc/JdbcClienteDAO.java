package aula49.jdbc.dao.jdbc;

import aula49.jdbc.dao.ClienteDAO;
import aula49.jdbc.dao.DAOException;
import aula49.jdbc.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcClienteDAO implements ClienteDAO {

    private Connection connection;

    public JdbcClienteDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void salvar(Cliente cliente) {
        try {
            String sql = "INSERT INTO cliente (nome) VALUES (?)";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new DAOException("Erro salvando cliente", e);
        } finally {
            try {
                this.connection.close();
            } catch (Exception ignored) {
            }
        }
    }

    @Override
    public Cliente buscaPeloCodigo(long codigo) {
        Cliente cliente = null;
        try {
            String sql = String.format("select * from cliente where codigo = %d", codigo);
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                cliente = new Cliente();
                cliente.setCodigo(result.getLong("codigo"));
                cliente.setNome(result.getString(2));
            }
        } catch (SQLException e) {
            throw new DAOException("Erro salvando cliente", e);
        } finally {
            try {
                this.connection.close();
            } catch (Exception ignored) {
            }
        }
        return cliente;
    }

    @Override
    public List<Cliente> buscarTodos() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            String sql = "select * from cliente";

            PreparedStatement ps = this.connection.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(result.getLong("codigo"));
                cliente.setNome(result.getString(2));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            throw new DAOException("Erro salvando cliente", e);
        } finally {
            try {
                this.connection.close();
            } catch (Exception ignored) {
            }
        }
        return clientes;
    }
}
