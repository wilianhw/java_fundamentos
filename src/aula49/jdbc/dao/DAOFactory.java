package aula49.jdbc.dao;

import aula49.jdbc.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {
    public static DAOFactory getDAOFactory() {
        return new JdbcDAOFactory();
    }

    public abstract ClienteDAO getClienteDAO();
}
