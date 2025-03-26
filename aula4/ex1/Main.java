package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar novo aluno");
            System.out.println("2. Exibir todos os alunos");
            System.out.println("3. Exibir nomes dos alunos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            
            switch (opcao) {
                case 1:
                    adicionarAluno(scanner);
                    break;
                case 2:
                    Aluno.exibirTodos();
                    break;
                case 3:
                    Aluno.exibirNomes();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void adicionarAluno(Scanner scanner) {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Peso (kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Altura (m): ");
        float altura = scanner.nextFloat();

        // Criando e adicionando o aluno
        Aluno novoAluno = new Aluno(id, nome);
        novoAluno.setIdade(idade);
        novoAluno.setPeso(peso);
        novoAluno.setAltura(altura);

        System.out.println("Aluno adicionado com sucesso!");
    }
}
