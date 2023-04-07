package aula49.jdbc;

import aula49.jdbc.dao.ClienteDAO;
import aula49.jdbc.dao.DAOFactory;
import aula49.jdbc.model.Cliente;

import javax.swing.*;

public class BuscaPeloCodigo {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

        String codigo = JOptionPane.showInputDialog(
                null,
                "Nome do cliente",
                "Cadastro de cliente",
                JOptionPane.QUESTION_MESSAGE
        );
        Cliente cliente = clienteDAO.buscaPeloCodigo(Long.parseLong(codigo));

        if (cliente != null) {
            System.out.println("-------Cliente---------");
            System.out.println("Código " + cliente.getCodigo());
            System.out.println("Nome " + cliente.getNome());
        } else {
            System.out.println("Não foi encontrado nenhum cliente com esse código");
        }
    }
}
