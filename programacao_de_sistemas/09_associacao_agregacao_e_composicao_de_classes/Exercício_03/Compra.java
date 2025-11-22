import java.util.ArrayList;

public class Compra {
    private int nf;
    private ArrayList<Item> itens;

    public Compra(int nf) {
        this.nf = nf;
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade, double precoUnitario) {
        Item i = new Item(produto, quantidade, precoUnitario);
        itens.add(i);
    }

    public double totalDaCompra() {
        double valorDaCompra = 0;
        for(Item i: itens){
            valorDaCompra += i.getPrecoUnitario() * i.getQuantidade();
        }
        return valorDaCompra;
    }

    public void apresentaCompra() {
        for(Item i: itens) {
            System.out.println("Qtd: " + i.getQuantidade() + " |Preço Unitário: " + i.getPrecoUnitario());
        }
    }
}
