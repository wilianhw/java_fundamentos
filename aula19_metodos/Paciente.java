public class Paciente {
    String nome;
    int idade;

    IMC isObeso(Double peso, Double altura) {
        IMC imc = new IMC();
        if (peso/(altura*altura) > 30) {
            imc.grau = "Severo";
            imc.obeso = true;
        } else {
            imc.grau = "Normal";
            imc.obeso = false;
        }

        return imc;
    }
}