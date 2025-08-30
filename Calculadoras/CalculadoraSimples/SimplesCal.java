package Calculadoras.CalculadoraSimples;

import java.util.Scanner;

public class SimplesCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero01;
        double numero02;
        String operacao;
        String continuar;

        System.out.println("🔢 Bem-vindo(a) à Calculadora do Soa!");
        do {
            System.out.print("\nInforme o primeiro número: ");
            numero01 = sc.nextDouble();

            System.out.print("Informe o segundo número: ");
            numero02 = sc.nextDouble();

            System.out.print("Informe a operação desejada (+, -, *, /): ");
            operacao = sc.next();

            switch (operacao) {
                case "+":
                    System.out.printf("Resultado da soma: %.2f%n", numero01 + numero02);
                    break;
                case "-":
                    System.out.printf("Resultado da subtração: %.2f%n", numero01 - numero02);
                    break;
                case "*":
                    System.out.printf("Resultado da multiplicação: %.2f%n", numero01 * numero02);
                    break;
                case "/":
                    if (numero02 == 0) {
                        System.out.println("⚠️ Erro: não é possível dividir por zero.");
                    } else {
                        System.out.printf("Resultado da divisão: %.2f%n", numero01 / numero02);
                    }
                    break;
                default:
                    System.out.println("⚠️ Operação inválida! Digite apenas (+, -, *, /).");
            }

            System.out.print("\nDeseja realizar outro cálculo? (Sim/Não): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("Sim"));

        System.out.println("\n✅ Encerrando a calculadora... Obrigado por usar!");
        sc.close();
    }
}