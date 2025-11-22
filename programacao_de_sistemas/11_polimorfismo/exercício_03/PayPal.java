public class PayPal extends MetodoPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Valor de R$" + valor + " pago pelo PayPal.");
    }
}
