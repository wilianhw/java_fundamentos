package aula49.jdbc.dao;

public class DAOException extends RuntimeException {
    public DAOException(String message, Throwable t) {
        super(message, t);
    }
}
