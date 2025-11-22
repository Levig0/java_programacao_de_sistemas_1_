public class ContaBasica extends Conta{
    public ContaBasica() {}

    public ContaBasica(String titular, int agencia, int numConta, double saldo) {
        super(titular, agencia, numConta, saldo);
    }

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
}
