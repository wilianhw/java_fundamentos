public class Principal {
    public static void main(String args[]) {
        Paciente paciente = new Paciente();
        paciente.nome = "João";
        paciente.idade = 28;

        IMC imc = paciente.isObeso(114.0, 1.90);

        System.out.println(imc.grau);
        System.out.println(imc.obeso);
    }
}