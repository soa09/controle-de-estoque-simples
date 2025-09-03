package ArmazemProdutos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Produtos adicionados com sucesso!");
        } else {
            System.out.println("Erro: quantidade inválida.");
        }
    }

    public void removerProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Produtos removidos com sucesso!");
        } else {
            System.out.println("Erro: quantidade inválida.");
        }
    }

    public void exibirInfo() {
        System.out.printf("\nProduto: %s%nPreço: R$ %.2f%n" +
                        "Quantidade: %d%nTotal: R$ %.2f%n",
                nome, preco, quantidade, valorTotalEmEstoque());
    }
}
