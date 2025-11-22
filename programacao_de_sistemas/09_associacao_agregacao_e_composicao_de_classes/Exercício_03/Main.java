public class Main {
    public static void main(String[] args){
        Compra c = new Compra(123456789);

        Produto p1 = new Produto(01, "Bolacha");
        Produto p2 = new Produto(02, "Sabonete");
        Produto p3 = new Produto(03, "Papel Higiênico");

        c.adicionarProduto(p1, 3, 2);
        c.adicionarProduto(p2, 2, 1.5);
        c.adicionarProduto(p3, 1, 10); 

        p1.descricaoProduto();
        c
    }
}
