public class CartaoCredito extends MetodoPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Valor de R$" + valor + " pago no cartão de crédito.");
    } 
}
