package exe0;

public class Conta {

    public int NumeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {

        this.NumeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if (status == true) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Conta Inativa.");
        }
    }

    public void sacar(float valor){
        if (status == false) {
            System.out.println("Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void encerrarConta(){
        if (saldo == 0) {
            status = false;
            System.out.println("Conta encerrada!");
        } else {
            System.out.println("Saque o dinheiro antes de encerrar.");
        }
    }

    public String toString(){
        return "Conta: " + NumeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo: " + saldo +
                "\nStatus: " + status;
    }
}