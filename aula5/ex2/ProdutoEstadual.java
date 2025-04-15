public class ProdutoEstadual extends Produto {
    private float imposto = 1.10f;
 
    public ProdutoEstadual(String descricao, float valor){
        super(descricao, valor);
    }

    @Override
    public float valorFinal(){
        return super.valorFinal() * imposto;
    }

    @Override
    public void relatorio(){
        super.relatorio();
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor Final: " + valorFinal());
    }
}
