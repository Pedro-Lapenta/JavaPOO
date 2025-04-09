public class PecaImportada extends Peca{
    private float taxaImportacao;
    private float taxaFrete;

    public PecaImportada(){

    }

    public PecaImportada(String nome, float custo, float lucro,
    float taxaImportacao, float taxaFrete)
    {
        super(nome, custo, lucro);
        setTaxaFrete(taxaFrete);
        setTaxaImportacao(taxaImportacao);
    }

    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    @Override
    public float calcularPreco(){
        return super.calcularPreco() * getTaxaImportacao() * getTaxaFrete();
    }

    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Taxa de Importacao: " + taxaImportacao);
        System.out.println("Taxa de Frete: " + taxaFrete);
    }
}
