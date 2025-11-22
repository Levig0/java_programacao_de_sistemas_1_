import java.util.ArrayList;
public class CalculadoraDeAreas {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5.0));
        formas.add(new Retangulo(3, 4));
        formas.add(new Circulo(2));
        formas.add(new Retangulo(5, 10));


        for(Forma forma: formas) {
            System.out.println(forma.toString() + " -> Área: " + forma.calculaArea());
        }
    }
}   