import java.util.Scanner;

public class DesafioIcm {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.print("Digite sua altura: ");
        double altura = lerTeclado.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = lerTeclado.nextDouble();

        System.out.print("Digite seu gênero (M para masculino, F para feminino ou N): ");
        char genero = lerTeclado.next().charAt(0);

        double imc = peso / (altura * altura);

        String classificacao;

        if (genero == 'M') {
            if (imc > 40) {
                classificacao = "Obesidade Mórbida";
            } else if (imc >= 30 && imc <= 39.9) {
                classificacao = "Obesidade Moderada";
            } else if (imc >= 25 && imc <= 29.9) {
                classificacao = "Obesidade Leve";
            } else if (imc >= 20 && imc <= 24.9) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
        } else {
            if (imc > 39) {
                classificacao = "Obesidade Mórbida";
            } else if (imc >= 29 && imc <= 38.9) {
                classificacao = "Obesidade Moderada";
            } else if (imc >= 24 && imc <= 28.9) {
                classificacao = "Obesidade Leve";
            } else if (imc >= 19 && imc <= 23.9) {
                classificacao = "Normal";
            } else {
                classificacao = "Abaixo do Normal";
            }
        }

        System.out.printf("Nome: %s\nIMC: %.2f\nClassificação: %s\n", nome, imc, classificacao);

        lerTeclado.close();
    }
}