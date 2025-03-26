// 2) Uma academia mantem registro de seus alunos armazenando nome, idade, peso e altura. A
// academia faz um desconto especial para menores de idade, portanto, é necessário saber
// distinguir entre um aluno maior e menor. Além disso, a academia também tem interesse em
// acompanhar o desempenho de seus alunos, por isso, ela também necessita conhecer o índice
// de massa corporal (IMC) deles, sendo que o IMC = peso / altura ^ 2.

package ex2;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setMedidas(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public double imc(){
        return (peso / (altura * altura));
    }

    public void exibirInformacoes(){
        System.out.println("nome: " + nome + ", idade: " + idade);
        System.out.println("peso: " + peso + ", altura: " + altura);
        System.out.println("IMC: " + imc());
    }
}
