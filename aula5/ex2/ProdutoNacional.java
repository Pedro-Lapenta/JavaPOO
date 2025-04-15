public class ProdutoNacional extends Produto {
    private float imposto = 1.10f;
    private float taxa = 1.05f;

    public ProdutoNacional(String descricao, float valor){
        super(descricao, valor);
    }

    @Override
    public float valorFinal(){
        return super.valorFinal() * imposto * taxa;
    }

    @Override
    public void relatorio(){
        super.relatorio();
        System.out.println("Imposto: " + imposto + " |||" + " Taxa: " + taxa);
        System.out.println("Valor Final: " + valorFinal());
    }
}
