public class Item {
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public Item(Produto produto, int quantidade, double precoUnitario) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.produto = produto;
    }

    public int getQuantidade() {return quantidade;}
    public double getPrecoUnitario() {return precoUnitario;}

    public void descricaoProduto() {
        System.out.println(getDescricao() + " - " + codigo);
    }
}
