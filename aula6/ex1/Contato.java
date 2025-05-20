package aula6.ex1;

public abstract class Contato {
    protected String tipo;

    public Contato(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void exibir();

    public abstract String toString();
    
}
