package aula49.jdbc;

import aula49.jdbc.dao.ClienteDAO;
import aula49.jdbc.dao.DAOFactory;
import aula49.jdbc.model.Cliente;

import javax.swing.*;

public class SalvaCliente {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Cliente cliente = new Cliente();
        String nome = JOptionPane.showInputDialog(
                null,
                "Nome do cliente",
                "Cadastro de cliente",
                JOptionPane.QUESTION_MESSAGE
        );
        cliente.setNome(nome);

        ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
        clienteDAO.salvar(cliente);
        System.out.println("Cliente salvo com sucesso!!!");
    }
}
