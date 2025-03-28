package ex3;

public class Nacional {
    //imposto = 10%  -- taxa = 5%

    private String descricao;
    private float valor;
    private float imposto = 1.10f;
    private float taxa = 1.05f;

    public Nacional(String descricao, float valor){
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

    public float getValor() {
        return valor;
    }

    public float getValorFinalNacional(){
        return getValor() * getImposto() * getTaxa();
    }

    public static Nacional[] criaNacional(int tamanho) {
        return new Nacional[tamanho];
    }

    public static void exibeNacional(Nacional[] nacionais){
        System.out.println("----- Produtos Nacionais -----");
        for (Nacional n : nacionais) {
            System.out.println("Descrição: " + n.getDescricao());
            System.out.println("Valor: R$ " + n.getValor());
            System.out.println("Valor Final: R$ " + (n.getValorFinalNacional()));
            System.out.println("---------------------------");
        }
    }

}
