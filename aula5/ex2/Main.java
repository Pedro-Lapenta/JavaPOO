import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar Produto Estadual");
            System.out.println("2 - Cadastrar Produto Nacional");
            System.out.println("3 - Cadastrar Produto Importado");
            System.out.println("4 - Exibir Produtos Estaduais");
            System.out.println("5 - Exibir Produtos Nacionais");
            System.out.println("6 - Exibir Produtos Importados");
            System.out.println("7 - Exibir Todos Produtos");
            System.out.println("8 - SAIR");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto Estadual");
                    System.out.print("Digite a descricao do produto: ");
                    String descricaoEstadual = scanner.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    float valorEstadual = scanner.nextFloat();
                    scanner.nextLine(); // Consumir a quebra de linha

                    new ProdutoEstadual(descricaoEstadual, valorEstadual);

                    break;
                case 2:
                    System.out.println("Cadastrar Produto Nacional");
                    System.out.println("Digite a descricao do produto: ");
                    String descricaoNacional = scanner.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    float valorNacional = scanner.nextFloat();
                    scanner.nextLine();

                    new ProdutoNacional(descricaoNacional, valorNacional);

                    break;
                case 3:
                    System.out.println("Cadastrar Produto Importado");
                    System.out.println("Digite a descricao do produto: ");
                    String descricaoImportado = scanner.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    float valorImportado = scanner.nextFloat();
                    scanner.nextLine();

                    new ProdutoImportado(descricaoImportado, valorImportado);

                    break;
                case 4:
                    System.out.println("Exibir Produtos Estaduais");
                    // Lógica para exibir Produtos Estaduais
                    Produto.imprimirProdutosPorTipo("ProdutoEstadual");
                    break;
                case 5:
                    System.out.println("Exibir Produtos Nacionais");
                    // Lógica para exibir Produtos Nacionais
                    Produto.imprimirProdutosPorTipo("ProdutoNacional");
                    break;
                case 6:
                    System.out.println("Exibir Produtos Importados");
                    // Lógica para exibir Produtos Importados
                    Produto.imprimirProdutosPorTipo("ProdutoImportado");
                    break;
                case 7:
                    System.out.println("Exibir Todos Produtos");
                    Produto.getProdutosPorTipo().values().forEach(lista -> {
                        lista.forEach(produto -> produto.relatorio());
                    });
                    break;
                case 8:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }
}