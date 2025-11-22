public class ContaPoupanca extends Conta{
    private double[] saldos = new double[5];

    public ContaPoupanca() {}
    public ContaPoupanca(String titular, int agencia, int numConta, double saldo) {
        super(titular, agencia, numConta, saldo);
    }

    public double[] getSaldos() {return this.saldos;}
    public void setSaldos(double[] saldos) {this.saldos = saldos;}

    public boolean saque(double valor) {
        if(this.saldo > valor && valor > 0) {
            this.saldo -= valor;
            System.out.print("Saque realizado com sucesso.");
            return true;
        }
        else {
            System.out.print("Saldo insuficiente para saque.");
            return false;
        }
    }

    public void deposito(double valor) {
        
    }

    public String extrato() {
        return "Titular: " + this.titular + " |Agência: " + this.agencia + " |Número da Conta: " + this.numConta + " |Saldo: " + this.saldo; 
    }
}