import java.util.ArrayList;
public class MinhaBibliotecaDigital {
    public static void main(String[] args) {
        ArrayList<ItemBiblioteca> itens = new ArrayList<>();

        itens.add(new Musica("We Are the Champions", "Queen", 3));
        itens.add(new Musica("Bohemian Rhapsody", "Queen", 6));
        itens.add(new Filme("O Resgate do Soldado Ryan", "Steven Spielberg", "Guerra"));
        itens.add(new Ebook("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 264));

        int totalSeg = 0;
        for(ItemBiblioteca i: itens) {
            i.exibirDetalhes();
            System.out.println();
            if(i instanceof Musica) {
                Musica m = (Musica) i;
                totalSeg += m.getDuracaoEmSegundos() * 60;
            }
        }
        System.out.println("Total em segundos das músicas da sua biblioteca: " + totalSeg);
    }
}
