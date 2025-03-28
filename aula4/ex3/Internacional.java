package ex3;

public class Internacional {
    private String descricao;
    private float valor;
    private float imposto = 1.10f;
    private float taxa = 1.05f;
    private float taxaImportacao = 1.05f;

    public Internacional(String descricao, float valor){
        setDescricao(descricao);
        setValor(valor);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getImposto() {
        return imposto;
    }

    public float getTaxa() {
        return taxa;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public float getValor() {
        return valor;
    }

    public float getValorFinalInternacional(){
        return getValor() * getImposto() * getTaxa() * getTaxaImportacao();
    }

    public static Internacional[] criaInternacional(int tamanho){
        return new Internacional[tamanho];
    }

    public static void exibeInternacional(Internacional[] internacionais){
        System.out.println("----- Produtos Internacionais -----");
        for (Internacional i : internacionais){
            System.out.println("Descrição: " + i.getDescricao());
            System.out.println("Valor: R$ " + i.getValor());
            System.out.println("Valor Final: R$ " + (i.getValorFinalInternacional()));
            System.out.println("---------------------------");
        }
    }
}
