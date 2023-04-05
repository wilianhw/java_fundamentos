package aula48.jpane;

import javax.swing.*;

public class ExemploJPane1 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        JOptionPane.showMessageDialog(null, "Seu cadastro foi Realizado com sucesso!");
    }
}
