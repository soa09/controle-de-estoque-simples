package ArmazemProdutos;

import java.util.Locale;
import java.util.Scanner;

public class ProtudoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Seja bem-vindo ao -Armazém do Soa- :)");
        System.out.println("-------------------------------------");

        // Cadastro inicial do produto
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade inicial: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Mostrar informações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade para adicionar: ");
                    int add = sc.nextInt();
                    produto.adicionarProduto(add);
                    break;
                case 2:
                    System.out.print("Quantidade para remover: ");
                    int rem = sc.nextInt();
                    produto.removerProduto(rem);
                    break;
                case 3:
                    produto.exibirInfo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
