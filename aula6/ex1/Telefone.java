package aula6.ex1;

public class Telefone extends Contato{
    private String telefone;

    public Telefone(String telefone){
        super("telefone");
        this.telefone = telefone;
    }

    @Override
    public void exibir(){
        System.out.println(tipo + ": " + telefone);
    }

    @Override
    public String toString() {
        return "Telefone: " + telefone;
    }
}
