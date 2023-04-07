package aula49.jdbc.dao;

import aula49.jdbc.model.Cliente;

import java.util.List;

public interface ClienteDAO {
    public void salvar(Cliente cliente);

    Cliente buscaPeloCodigo(long codigo);

    List<Cliente> buscarTodos();
}
