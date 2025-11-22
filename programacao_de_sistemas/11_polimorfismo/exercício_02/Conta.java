public class Conta {
    String titular;
    int agencia;
    int numConta;
    double saldo;

    public Conta() {}

    public Conta(String titular, int agencia, int numConta, double saldo){
        this.titular = titular;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getTitular() {return this.titular;}
    public int getAgencia() {return this.agencia;}
    public int getNumConta() {return this.numConta;}
    public double getSaldo() {return this.saldo;}

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }

        else {
            System.out.print("Valor negativo é inválido!");
        }
    }

    public String extrato() {
        return "Titular: " + this.titular + " |Agência: " + this.agencia + " |Número da Conta: " + this.numConta + " |Saldo: " + this.saldo; 
    }
}