package aula6.ex1;

public class Agenda {
    private String proprietario; //dono da agenda
    private Pessoa[] pessoas; //vetor de pessoas
    private int max;
    private int cont;

    public Agenda(String proprietario, int max){
        this.proprietario = proprietario;
        this.max = max;
        this.cont = 0;
        this.pessoas = new Pessoa[max];
    }

    public void addPessoa(Pessoa p){
        if (cont < max){
            pessoas[cont] = p;
            cont++;
        }
        else {
            System.out.println("Numero de pessoas chegou ao limite");
        }
    }

    public Pessoa buscarPessoa(String nome){
        for (int i = 0; i < max; i++){
            if (pessoas[i].getNome().equals(nome)){
                return pessoas[i];
            }
        }

        return null;
    }

    public void addContato(String nome, Contato c){
        if (buscarPessoa(nome) != null){
            buscarPessoa(nome).adicionarContato(c);
        }
        else {
            System.out.println("Pessoa nao encontrada");
        }

    }

    public void exibirTodasPessoas(){

        for (int i = 0; i < cont; i++){
            int j = 0;

            System.out.println("Nome: " + pessoas[i].getNome());
            System.out.println("Contatos: ");
            exibirContatosPessoa(pessoas[i].getNome());
        }
    }

    public void exibirContatosPessoa(String nome){
        int i = 0;

        if (buscarPessoa(nome) != null){
            while(buscarPessoa(nome).getContatos()[i] != null){
                System.out.println(buscarPessoa(nome).getContatos()[i]);
                i++;
            }
        }
        else {
            System.out.println("Pessoa nao encontrada");
        }
    }

    public void exibirPessoasComEmail(){
        for (int i = 0; i < cont; i++){
            if (pessoas[i].possuiEmail()){
                System.out.println(pessoas[i].getNome());
            }
        }
    }

    public void recuperarPessoaPorEmail(String email) {
        for (int i = 0; i < cont; i++) {
            Contato[] contatos = pessoas[i].getContatos();
            for (Contato contato : contatos) {
                if (contato instanceof Email && ((Email) contato).toString().contains(email)) {
                    System.out.println("Pessoa encontrada: " + pessoas[i].getNome());
                    return;
                }
            }
        }
        System.out.println("Nenhuma pessoa encontrada com o email: " + email);
    }

    public void recuperarPessoaPorTelefone(String telefone) {
        for (int i = 0; i < cont; i++) {
            Contato[] contatos = pessoas[i].getContatos();
            for(Contato contato : contatos) {
                if(contato instanceof Telefone && ((Telefone) contato).toString().contains(telefone)) {
                    System.out.println("Pessoa encontrada: " + pessoas[i].getNome());
                    return;
                }
            }
        }
        System.out.println("Nenhuma pessoa encontrada com o telefone: " + telefone);
    }
}
