import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Produto {
    protected String descricao;
    protected float valor;

    // HashMap para armazenar listas de produtos separados por tipo
    private static HashMap<String, List<Produto>> produtosPorTipo = new HashMap<>();

    public Produto() {}

    public Produto(String descricao, float valor) {
        setDescricao(descricao);
        setValor(valor);
        adicionarProduto(this); // Adiciona o produto ao HashMap
    }

    private void adicionarProduto(Produto produto) {
        String tipo = produto.getClass().getSimpleName(); // Obtém o nome da classe como identificador
        produtosPorTipo.putIfAbsent(tipo, new ArrayList<>()); // Cria a lista se não existir
        produtosPorTipo.get(tipo).add(produto); // Adiciona o produto à lista correspondente
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public float valorFinal() {
        return valor;
    }

    public void relatorio() {
        System.out.println("Descricao: " + this.getDescricao() + " ||||" + " Valor antes das tributacoes: " + this.getValor());
    }

    // Método para acessar o HashMap de produtos por tipo
    public static HashMap<String, List<Produto>> getProdutosPorTipo() {
        return produtosPorTipo;
    }

    // Método para imprimir produtos de um tipo específico
    public static void imprimirProdutosPorTipo(String tipo) {
        List<Produto> produtos = produtosPorTipo.get(tipo);
        if (produtos != null && !produtos.isEmpty()) {
            System.out.println("Produtos do tipo: " + tipo);
            for (Produto produto : produtos) {
                produto.relatorio();
            }
        } else {
            System.out.println("Nenhum produto do tipo " + tipo + " encontrado.");
        }
    }
}