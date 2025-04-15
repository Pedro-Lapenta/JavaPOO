public class ProdutoImportado extends Produto {
    private float imposto = 1.10f;
    private float taxa = 1.05f;
    private float taxaImportacao = 1.05f;

    
    public ProdutoImportado (String descricao, float valor) {
        super(descricao, valor);
    }

    @Override
    public float valorFinal(){
        return super.valorFinal() * imposto * taxa * taxaImportacao;
    }

    @Override
    public void relatorio(){
        super.relatorio();
        System.out.println("Imposto: " + imposto + " |||" + " Taxa: " + taxa + " |||" + " Taxa de Importacao: " + taxaImportacao);
        System.out.println("Valor Final: " + valorFinal());
    }
}
