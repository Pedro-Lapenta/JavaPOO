package aula6.ex1;

public class Email extends Contato{
    private String email;

    public Email(String email){
        super("email");
        this.email = email;
    }

    @Override
    public void exibir(){
        System.out.println(tipo + ": " + email);
    }

    @Override
    public String toString() {
        return "Email: " + email;
    }
}
