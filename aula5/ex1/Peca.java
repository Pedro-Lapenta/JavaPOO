// atributos nome, custo e lucro. Os métodos são os construtores, getters, setters, cálculo de
// preço e um de exibição. O preço da peça é calculado pela soma do custo com o lucro. O método
// exibir é para mostrar os valores dos atributos das peças.

public class Peca {

    private String nome;
    private float custo;
    private float lucro;

    public Peca(){

    }

    public Peca(String nome, float custo, float lucro){
        setCusto(custo);
        setLucro(lucro);
        setNome(nome);
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public float getLucro() {
        return lucro;
    }

    public String getNome() {
        return nome;
    }

    public float calcularPreco(){
        return custo + lucro;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Lucro: " + lucro);
        System.out.println("Preco Final: " + calcularPreco());
    }
}