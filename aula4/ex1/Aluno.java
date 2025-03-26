package ex1;
import java.util.ArrayList;


public class Aluno {
    private int ID;
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    private static ArrayList<Aluno> alunos = new ArrayList<>();
    
    public Aluno(int ID, String nome) {
        setID(ID);
        setNome(nome);
        alunos.add(this);
    }

    public Aluno(){
        alunos.add(this);
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public int getID() {
        return ID;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public void exibir(){
        System.out.println("ID: " + ID);
        System.out.println("Nome: " + nome);
        System.out.println("idade" + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularIMC());
        System.out.println("---------------------------");
    }

    public float calcularIMC(){
        return altura != 0 ? (peso / (altura * altura)) : -1;
    }

    public static void exibirTodos() {
        System.out.println("---------------------------");
        System.out.println("Lista de alunos: ");
        System.out.println("---------------------------");
        for (Aluno alunos : alunos) {
            alunos.exibir();
        }
    }

    public static void exibirNomes(){
        System.out.println("---------------------------");
        System.out.println("Lista de nomes: ");
        System.out.println("---------------------------");
        for (Aluno alunos : alunos) {
            System.out.println(alunos.getNome());
        }
    }

}