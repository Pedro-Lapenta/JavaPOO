public abstract class Funcionario {
    private String codigo;
    private String nome;
    private float salario;

    public Funcionario(String codigo, String nome, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public float getSalario() {
        return salario;
    }

    public float getSalarioFinal(){
        return calcularSalario();
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float calcularSalario();

    public abstract void exibir();
}