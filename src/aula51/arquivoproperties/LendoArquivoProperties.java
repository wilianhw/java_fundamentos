package aula51.arquivoproperties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LendoArquivoProperties {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./config/config.properties"));

        String url = prop.getProperty("banco.dados.url");
        String usuario = prop.getProperty("banco.dados.usuario");
        String senha = prop.getProperty("banco.dados.senha");

        System.out.printf("Conectando ao banco de dados com url: %s e usuário %s\n", url, usuario);

        try {
            int x = 5/0;
        } catch (Exception e) {
            String email = prop.getProperty("email.administrador");
            System.out.printf("Enviando email informando o erro que aconteceu para %s", email);
        }
    }
}
