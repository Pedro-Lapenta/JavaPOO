package aula6.ex1;

public class Main {
    public static void main(String[] args) {
        // Criando uma agenda com capacidade para 3 pessoas
        Agenda agenda = new Agenda("Pedro", 3);

        // Criando pessoas
        Pessoa pessoa1 = new Pessoa("João", 5);
        Pessoa pessoa2 = new Pessoa("Maria", 5);
        Pessoa pessoa3 = new Pessoa("Ana", 5);

        // Adicionando pessoas à agenda
        agenda.addPessoa(pessoa1);
        agenda.addPessoa(pessoa2);
        agenda.addPessoa(pessoa3);

        // Criando contatos
        Contato telefone1 = new Telefone("1234-5678");
        Contato telefone2 = new Telefone("9876-5432");
        Contato email1 = new Email("joao@example.com");
        Contato email2 = new Email("maria@example.com");
        Contato email3 = new Email("ana@example.com");

        // Adicionando contatos às pessoas
        agenda.addContato("João", telefone1);
        agenda.addContato("João", email1);
        agenda.addContato("Maria", telefone2);
        agenda.addContato("Maria", email2);
        agenda.addContato("Ana", email3);

        // Exibindo todas as pessoas na agenda
        System.out.println("Exibindo todas as pessoas na agenda:");
        agenda.exibirTodasPessoas();

        // Exibindo contatos de uma pessoa específica
        System.out.println("\nExibindo contatos de João:");
        agenda.exibirContatosPessoa("João");

        // Exibindo pessoas que possuem email
        System.out.println("\nExibindo pessoas com email:");
        agenda.exibirPessoasComEmail();

        // Recuperando pessoa por email
        System.out.println("\nRecuperando pessoa por email 'maria@example.com':");
        agenda.recuperarPessoaPorEmail("maria@example.com");

        // Recuperando pessoa por telefone
        System.out.println("\nRecuperando pessoa por telefone '1234-5678':");
        agenda.recuperarPessoaPorTelefone("1234-5678");
    }
}
