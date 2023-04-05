package aula48.jpane;

import javax.swing.*;
import java.net.URL;

public class ExemploJPane2 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null, "Seu cadastro foi Realizado com sucesso!");

        JOptionPane.showMessageDialog(null, "Atenção email não informado", "Atenção", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Favor informar o nome", "Erro", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

        URL url = ExemploJPane2.class.getResource("rick.jpeg");

        Icon icon = new ImageIcon(url);

        JOptionPane.showMessageDialog(
                null,
                "Obrigado",
                "Obrigado",
                JOptionPane.INFORMATION_MESSAGE, icon
        );
    }
}
