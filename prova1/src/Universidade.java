public class Universidade {
    private String codigo;
    private String nome;
    private Departamento[] departamentos;
    private int contDep;
    private int MAXDep;

    public Universidade(String codigo, String nome, int MAXDep){
        this.codigo = codigo;
        this.nome = nome;
        this.MAXDep = MAXDep;
        this.departamentos = new Departamento[MAXDep];
        this.contDep = 0;
    }

    public boolean isFull(){
        return contDep >= MAXDep;
    }

    public void addDepartamento(Departamento d){
        if (!isFull()){
            departamentos[contDep] = d;
            contDep++;
        } else {
            System.out.println("ERRO: Dep cheio");
        }
    }

    public Departamento buscaDepartamento(String codDep){
        for (int i = 0; i < contDep; i++){
            if (departamentos[i].getCodigo().equals(codDep)){
                return departamentos[i];
            }
        }
        return null;
    }

    public void addDocente(String codDep, String cod, String nome, float salario, float adicional, String titulacao){
        Funcionario f = new Docente(cod, nome, salario, adicional, titulacao);

        buscaDepartamento(codDep).addFuncionario(f);
    }

    public void addTecnico(String codDep, String cod, String nome, float salario, String nivel){
        Funcionario f = new Tecnico(cod, nome, salario, nivel);

        buscaDepartamento(codDep).addFuncionario(f);
    }

    public void exibirDepartamentos(){
        for (int i = 0; i < contDep; i++){
            departamentos[i].exibir();
        }
    }

    public void exibirDocentes(){
        for (int i = 0; i < contDep; i++){
            for (int j = 0; j < departamentos[i].getCont(); j++){
                Funcionario f = departamentos[i].getFuncionarios()[j];
                if (f instanceof Docente){
                    f.exibir();
                }
            }
        }
    }

    public Docente buscaDocente(String codigo){ //melhor pois evita conflitos (na prova eh sugerida busca por String nome)
        for (int i = 0; i < contDep; i++){
            for (int j = 0; j < departamentos[i].getCont(); j++){
                Funcionario f = departamentos[i].getFuncionarios()[j];
                if (f instanceof Docente){
                    if (f.getCodigo().equals(codigo)){
                        return (Docente) f; // Cast para docente
                    }
                }
            }
        }
        return null;
    }

    public void exibirDepartamentoComGastoEntre(float ini, float fin){
        System.out.println("Deps com gastos entre: ");
        for (int i = 0; i < contDep; i++){
            if (departamentos[i].calcularTotalSalarios() >= ini && departamentos[i].calcularTotalSalarios() <= fin){
                System.out.println("Nome: " + departamentos[i].getNome());
                System.out.println("Gastos Totais: " + departamentos[i].calcularTotalSalarios());
            }
        }
    }


}
