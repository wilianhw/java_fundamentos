package aula48.jpane;

import javax.swing.*;

public class ExemploJPane3 {
    public static void main(String[] args) {
        Object[] options = {"Sim", "Não", "Sim com email"};

        int selectedOption = JOptionPane.showOptionDialog(
                null,
                "Você gostária de finalizar o cadastro?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]
        );

        System.out.println("Opção selecionado: " + selectedOption);
    }
}
