public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario[] funcionarios;
    private int cont;
    private int max;

    public Departamento(String codigo, String nome, int max){
        this.nome = nome;
        this.codigo = codigo;
        this.max = max;
        this.funcionarios = new Funcionario[max];
        this.cont = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCont() {
        return cont;
    }

    public int getMax() {
        return max;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFull(){
        return cont >= max;
    }

    public void addFuncionario(Funcionario f){
        if (!isFull()){
            funcionarios[cont] = f;
            cont++;
        }

        else {
            System.out.println("Nao ha espaco suficiente");
        }
    }

    public float calcularTotalSalarios(){
        float salarioTotal = 0;

        for (int i = 0; i < cont; i++){
            salarioTotal += funcionarios[i].getSalarioFinal();
        }

        return salarioTotal;
    }

    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }

    public void exibirFuncionarios(){
        System.out.println("FUNCIONARIOS: ");
        for (int i = 0; i < cont; i++){
            System.out.print(i + ": ");
            funcionarios[i].exibir();
        }
    }

    public void exibir(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Max: " + max);
        System.out.println("Cont: " + cont);
        exibirFuncionarios();
    }

}