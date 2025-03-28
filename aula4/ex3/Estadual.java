package ex3;

public class Estadual {

    private String descricao;
    private float valor;
    private float imposto = 1.10f;
    
    public Estadual(String descricao, float valor){
        setDescricao(descricao);
        setValor(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public float getImposto() {
        return imposto;
    }

    public float getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValorFinalNacional(){
        return getValor() * getImposto();
    }

    public static Estadual[] criaEstadual(int tamanho) {
        return new Estadual[tamanho];
    }

    public static void exibeEstadual(Estadual[] estaduais){
        System.out.println("----- Produtos Estaduais -----");
        for (Estadual e : estaduais) {
            System.out.println("Descrição: " + e.getDescricao());
            System.out.println("Valor: R$ " + e.getValor());
            System.out.println("Valor Final: R$ " + (e.getValorFinalNacional()));
            System.out.println("---------------------------");
        }
    }
}