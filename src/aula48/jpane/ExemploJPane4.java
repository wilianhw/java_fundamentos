package aula48.jpane;

import javax.swing.*;

public class ExemploJPane4 {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] possibilites = {"Masculino", "Feminino"};

        System.out.println("Selecione o sexo");

        String sexoSelecionado = (String) JOptionPane.showInputDialog(
                null,
                "Selecione o sexo",
                "Estudos",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilites,
                possibilites[0]
        );

        System.out.println("Sexo selecionado: " + sexoSelecionado);

        System.out.println("Selecione o sexo");

        sexoSelecionado = (String) JOptionPane.showInputDialog(
                null,
                "Selecione o sexo",
                "Estudos",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null
        );

        System.out.println("Sexo selecionado: " + sexoSelecionado);
    }
}
