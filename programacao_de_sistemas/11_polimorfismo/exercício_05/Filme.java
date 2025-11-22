public class Filme extends ItemBiblioteca {
    private String genero;

    public Filme(String titulo, String diretor, String genero) {
        super(titulo, diretor);
        this.genero = genero;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Diretor: " + autor);
        System.out.println("Gênero: " + genero);
    }
}
