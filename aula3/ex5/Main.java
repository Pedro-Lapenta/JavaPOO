package ex5;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Pedro", 200, 100);
        conta1.exibir();
        conta1.depositar(100);
        conta1.exibir();
        conta1.sacar(400);

        Conta conta2 = new Conta("Corinthians", 100, 200);
        conta2.exibir();
        conta2.depositar(50);
        conta2.exibir();
        conta2.sacar(500);
    }
}
