package aula6.ex1;

public class Pessoa {
    private Contato[] contatos;
    private String nome;
    private int max; //maximo de contatos
    private int cont; //contador de contatos

    public Pessoa(String nome, int max){
        this.nome = nome;
        this.max = max;
        this.cont = 0;
        this.contatos = new Contato[max];
    }

    public int getMax() {
        return max;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarContato(Contato c){
        if (cont < max){
            contatos[cont] = c;
            cont++; 
        }
        else {
            System.out.println("Numero maximo de contatos atingido");
        }

    }

    public Contato[] getContatos(){
        return contatos;
    }

    public Contato[] getContatos(String tipo) {
        Contato[] contatosPorTipo = new Contato[cont];
        int count = 0;
    
        for (int i = 0; i < cont; i++) {
            if (tipo.equals(contatos[i].getTipo())) {
                contatosPorTipo[count] = contatos[i];
                count++;
            }
        }
    
        Contato[] resultado = new Contato[count];
        for (int i = 0; i < count; i++) {
            resultado[i] = contatosPorTipo[i];
        }
    
        return resultado;
    }
    

    public boolean possuiEmail(){
        for (int i = 0; i < cont; i++) {
            if ("email".equals(contatos[i].getTipo())) {
                return true;
            }
        }
        return false;
    }

    public boolean possuiTelefone(){
        for (int i = 0; i < cont; i++) {
            if ("telefone".equals(contatos[i].getTipo())) {
                return true;
            }
        }
        return false;
    }

    public void exibirContatos(){
        Contato[] todosContatos = getContatos();

        for (int i = 0; i < cont; i++){
            System.out.println(todosContatos[i]);
        }
    }

}
