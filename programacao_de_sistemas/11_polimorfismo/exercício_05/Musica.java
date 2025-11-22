public class Musica extends ItemBiblioteca {
    private int duracaoEmSegundos;

    public Musica(String titulo, String artista, int duracaoEmSegundos) {
        super(titulo, artista);
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getDuracaoEmSegundos() {return duracaoEmSegundos;}

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista: " + autor);
        System.out.println("Duração da música: " + 60*duracaoEmSegundos + " segundos");
    }
}

  