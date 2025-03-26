package ex5;

public class Conta {
    private String titular;
    private double saldo;
    private double limite;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public Conta(){}

    public Conta(String titular, double saldo, double limite){
        setTitular(titular);
        setSaldo(saldo);
        setLimite(limite);
    }

    public void exibir(){
        System.out.println("titular: " + titular);
        System.out.println("saldo: " + saldo);
        System.out.println("limite: " + limite);
    }

    public double depositar(double valorDeposito){
        return saldo += valorDeposito;
    }

    public double sacar(double valorSaque){
        if (saldo + limite <= 0){
            return saldo -= valorSaque;
        }

        System.out.println("SALDO INSUFICIENTE");
        return -1;
    }

}
