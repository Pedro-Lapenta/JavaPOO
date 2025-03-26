package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados do aluno
        System.out.print("Digite o RA do aluno: ");
        String ra = scanner.nextLine();
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Criando o objeto Aluno
        Aluno aluno = new Aluno(ra, nome);

        // Entrada das notas
        System.out.print("Digite a nota do Trabalho 1: ");
        double notaTrabalho1 = scanner.nextDouble();

        System.out.print("Digite a nota do Trabalho 2: ");
        double notaTrabalho2 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 1: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        double notaProva2 = scanner.nextDouble();

        // Definindo as notas no objeto aluno
        aluno.setNotas(notaTrabalho1, notaTrabalho2, notaProva1, notaProva2);

        // Exibindo informações do aluno
        System.out.println("\n=== Resultado ===");
        aluno.exibirInformacoes();

        scanner.close();
    }
}
