public class Ebook extends ItemBiblioteca {
    private int numeroDePaginas;

    public Ebook(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome do Ebook: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de páginas: " + numeroDePaginas);
    }
}
