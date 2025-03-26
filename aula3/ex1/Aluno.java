package ex1;
// Os alunos da disciplina de Programação Orientada a Objetos da FCT/Unesp desenvolverão
// dois trabalhos e duas provas ao longo do semestre. Considere que, nesse caso, a média final é
// calculada pela média aritmética simples de todas as notas e que o aluno é aprovado somente
// se obtiver média maior ou igual a cinco.
// O Aluno possui como informação o RA, Nome e as notas – a média é calculada a partir das
// notas e não precisa ser armazenada.

public class Aluno {
    private String nome;
    private String ra;
    private double notaTrabalho1;
    private double notaTrabalho2;
    private double notaProva1;
    private double notaProva2;

    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public void setNotas(double notaTrabalho1, double notaTrabalho2, double notaProva1, double notaProva2){
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho1 = notaTrabalho1;
        this.notaTrabalho2 = notaTrabalho2;
    }  

    public double calcularMedia() {
        return ((notaProva1 + notaProva2 + notaTrabalho1 + notaTrabalho2) / 4);
    }

    public boolean estaAprovado(){
        return calcularMedia() >= 5.0;
    }
    public void exibirInformacoes() {
        System.out.println("RA: " + ra + ", Nome: " + nome);
        System.out.println("Média Final: " + calcularMedia());
        System.out.println(estaAprovado() ? "Status: Aprovado" : "Status: Reprovado");
    }
}
