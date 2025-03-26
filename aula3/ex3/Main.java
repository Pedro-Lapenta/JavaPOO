package ex3;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Pedro", 18052005);
        conta1.setSaldo(-100);
        conta1.exibirInformacoes();

        Conta conta2 = new Conta("Gepeto", 123345665);
        conta2.setSaldo(200);
        conta2.exibirInformacoes();
    }
}
