// MENU
// 1 – Cadastrar Nova Conta
// 2 – Saque
// 3 – Depósito
// 4 – Listar Contas (posição do vetor e nome dos clientes)
// 5 – Relatório Geral (todas as contas)
// 6 – Relatório de Contas cujo saldo está abaixo de zero
// 7 – Relatório da Conta de um determinado cliente
// 9 – Sair

package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar Nova Conta");
            System.out.println("2. Saque");
            System.out.println("3. Depósito");
            System.out.println("4. Listar Contas");
            System.out.println("5. Relatório Geral");
            System.out.println("6. Relatório de Contas Negativadas");
            System.out.println("7. Relatório da Conta de um determinado cliente");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== CADASTRO DE NOVA CONTA ===");
                    System.out.print("Número da conta: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do titular: ");
                    String titular = scanner.nextLine();

                    System.out.print("Saldo inicial: ");
                    float saldo = scanner.nextFloat();

                    System.out.print("Limite: ");
                    float limite = scanner.nextFloat();

                    Conta novaConta = new Conta(numero, titular, saldo, limite);
                    break;
                case 2:
                    System.out.println("\n=== SAQUE ===");
                    System.out.print("Número da conta: ");
                    int numConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Valor: ");
                    float valor = scanner.nextFloat();
                    
                    Conta contaSaque = Conta.buscarConta(numConta);

                    contaSaque.sacar(numConta, valor);
                    break;
                case 3:
                    System.out.println("\n=== DEPÓSITO ===");
                    System.out.print("Número da conta: ");
                    numConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Valor: ");
                    valor = scanner.nextFloat();

                    Conta contaDeposito = Conta.buscarConta(numConta);
                    
                    contaDeposito.depositar(numConta, valor);
                    break;
                case 4:
                    System.out.println("\n=== LISTAR CONTAS ===");
                    Conta.listar();
                    break;
                case 5:
                    System.out.println("\n=== RELATÓRIO GERAL ===");
                    Conta.relatorioGeral();
                    break;
                case 6:
                    System.out.println("\n=== RELATÓRIO DE CONTAS NEGATIVADAS ===");
                    Conta.contasNegativadas();
                    break;
                case 7:
                    System.out.println("\n=== RELATÓRIO DA CONTA DE UM DETERMINADO CLIENTE ===");
                    System.out.print("Nome do titular: ");
                    titular = scanner.nextLine();
                    Conta.contaCliente(titular);
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (opcao != 8);

        scanner.close(); 
    }
}
