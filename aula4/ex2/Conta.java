package ex2;
import java.util.HashMap;

public class Conta {
    private int numero;
    private String titular;
    private float saldo;
    private float limite;
    private float valor;

    private static HashMap<Integer, Conta> contas = new HashMap<>();

    public Conta(){
        contas.put(this.numero, this);
    }

    public Conta(int numero, String titular, float saldo, float limite){
        setLimite(limite);
        setNumero(numero);
        setSaldo(saldo);
        setTitular(titular);
        contas.put(this.numero, this);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getLimite() {
        return limite;
    }

    public float getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void exibir(){
        System.out.println();
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("\u001B[32mSaldo: \u001B[0m" + saldo);
        System.out.println("\u001B[32mLimite: \u001B[0m" + limite);
        System.out.println();
    }

    public static Conta buscarConta(int numero) {
        return contas.get(numero);
    }

    protected void depositar(int numero, float valor){
        Conta conta = buscarConta(numero);
        conta.saldo += valor;
    }

    protected void sacar(int numero, float valor){
        if(valor < 0){
            throw new IllegalArgumentException("\\u001B[31mO valor deve ser maior que zero.\\u001B[0m");
        }

        Conta conta = buscarConta(numero);

        if (valor > conta.saldo && valor <= conta.saldo + conta.limite){
            conta.limite = conta.limite + (conta.saldo - valor);
            conta.saldo -= valor;
        }
        if (valor <= conta.saldo){
            conta.saldo -= valor;
        }
        else {
            System.out.println("\\u001B[31mO Saldo insuficiente.\\u001B[0m");
        }
    }

    public static void relatorioGeral() {
        for (Conta conta : contas.values()){
            conta.exibir();
        }
    }

    public static void listaContas(){
        for (Conta conta : contas.values()) {
            System.out.println(conta.getTitular());
        }
    }

    public static void contasNegativadas() {
        for (Conta conta : contas.values()) {
            if (conta.getSaldo() < 0){
                conta.exibir();
            }
        }
    }

    public static void contaCliente(String titularBusca) {
        for (Conta conta : contas.values()){
            if(conta.getTitular().equalsIgnoreCase(titularBusca)){
                conta.exibir();
            }
        }
    }

    public static void listar() {
        System.out.println(contas);
    }

    @Override
    public String toString() {
        return titular;
    }
    
}
