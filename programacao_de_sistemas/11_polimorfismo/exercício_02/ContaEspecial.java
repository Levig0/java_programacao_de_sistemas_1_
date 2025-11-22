public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial() {} 
    public ContaEspecial(String titular, int agencia, int numConta, double saldo) {
        super(titular, agencia, numConta, saldo);
    } 

    public double getLimite() {return this.limite;}
    public void setLimite(double limite) {this.limite = limite;}

    public boolean saque(double valor) {
        if(this.saldo > valor && valor > 0) {
            this.saldo -= valor;
            System.out.print("Saque realizado - ");
            return true;
        }
        else {
            System.out.print("Saque realizado - ");
            return false;
        }
    }

    @Override
    public String extrato() {
        return "Titular: " + this.titular + " |Agência: " + this.agencia + " |Número da Conta: " + this.numConta + " |Saldo: " + this.saldo + " |Limite: " + this.limite; 
    }
}
