package GeradorDeSenhas;

import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorSenhasPersonalizado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()_+";

        StringBuilder caracteres = new StringBuilder();

        System.out.print("Incluir letras? (Sim/Não): ");
        if (sc.next().equalsIgnoreCase("Sim")) caracteres.append(letras);

        System.out.print("Incluir números? (Sim/Não): ");
        if (sc.next().equalsIgnoreCase("Sim")) caracteres.append(numeros);

        System.out.print("Incluir símbolos? (Sim/Não): ");
        if (sc.next().equalsIgnoreCase("Sim")) caracteres.append(simbolos);

        if (caracteres.length() == 0) {
            System.out.println("Nenhuma opção escolhida! Gerando apenas letras...");
            caracteres.append(letras);
        }

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = sc.nextInt();

        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        System.out.println("Senha gerada: " + senha);
        sc.close();
    }
}
