public class Docente extends Funcionario{
    private float adicionalSalario;
    private String titulacao;

    public Docente(String codigo, String nome, float salario, float adicionalSalario, String titulacao){
        super(codigo, nome, salario);
        this.adicionalSalario = adicionalSalario;
        this.titulacao = titulacao;
    }

    public float getAdicionalSalario() {
        return adicionalSalario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setAdicionalSalario(float adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public float calcularSalario(){
        return getSalario() * adicionalSalario;
    }

    @Override
    public void exibir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Salario: " + getSalario());
        System.out.println("Titulacao: " + titulacao);
    }
}
