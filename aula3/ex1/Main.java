package ex1;


public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("123456", "João Silva");
        aluno1.setNotas(6.5, 7.0, 5.5, 6.0);
        aluno1.exibirInformacoes();

        Aluno aluno2 = new Aluno("789012", "Maria Oliveira");
        aluno2.setNotas(4.0, 3.5, 5.0, 4.5);
        aluno2.exibirInformacoes();
    }
}

