package aula49.jdbc;

import aula49.jdbc.dao.ClienteDAO;
import aula49.jdbc.dao.DAOFactory;
import aula49.jdbc.model.Cliente;

import java.util.List;

public class BuscaTodosClientes {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

        List<Cliente> clientes = clienteDAO.buscarTodos();

        for (Cliente cliente : clientes) {
            System.out.println("Cliente");
            System.out.println("Código " + cliente.getCodigo());
            System.out.println("Nome " + cliente.getNome());
        }
    }
}
