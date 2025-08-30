package ConvertorDeMoedas;

import java.util.Scanner;

public class Moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao convertor de moedas do Soa! :)");

        do {
            System.out.printf("Você quer converter de reais para dólares ou de dólares para reais? (Reais/Dolar)");

            Convertor.resposta = sc.next();

            if (Convertor.resposta.equalsIgnoreCase("Dolar")) {
                System.out.printf("Digite o valor que você possui em dólar: ");
                Convertor.dollar = sc.nextDouble();
                System.out.printf("Resultado convertido: %.2f%n", Convertor.DolarPaReais());

            } else if (Convertor.resposta.equalsIgnoreCase("Reais")) {
                System.out.printf("Digite o valor que você possui em reais: ");
                Convertor.reais = sc.nextDouble();
                System.out.printf("Resultado convertido: %.2f%n", Convertor.ReaisPaDollar());
            } else {
                System.out.printf("Erro: Comando errado, tente novamente%n");
            }
            System.out.printf("Deseja refazer a operção de novo? (Sim/Não) ");
            Convertor.conti = sc.next();
        } while (Convertor.conti.equalsIgnoreCase("Sim"));

        System.out.printf("Encerrando programa...");

        sc.close();
    }
}
