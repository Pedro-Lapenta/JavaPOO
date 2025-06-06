public class Tecnico extends Funcionario {
    private String nivel;

    public Tecnico(String codigo, String nome, float salario, String nivel){
        super(codigo, nome, salario);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public float calcularSalario(){
        return getSalario();
    }

    @Override
    public void exibir(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Salario" + getSalario());
        System.out.println("Nivel: " + nivel);
    }
}
