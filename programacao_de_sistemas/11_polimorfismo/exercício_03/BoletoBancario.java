public class BoletoBancario extends MetodoPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Valor de R$" + valor + " pago em boleto bancário.");
    }
}
