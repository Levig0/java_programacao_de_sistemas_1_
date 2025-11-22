import java.util.ArrayList;
public class CarrinhoDeCompras {
    public static void main(String[] args) {
        ArrayList<MetodoPagamento> formasDePagamento = new ArrayList<>();

        formasDePagamento.add(new CartaoCredito());
        formasDePagamento.add(new PayPal());
        formasDePagamento.add(new BoletoBancario());

        for(MetodoPagamento i: formasDePagamento) {
            i.processarPagamento(1000);
        }
    }
}
