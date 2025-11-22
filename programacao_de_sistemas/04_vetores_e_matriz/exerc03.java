import java.util.Random;

public class exerc03 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vet = new int[10];

        for(int i=0; i<vet.length;i++) {
            vet[i] = aleatorio.nextInt(100) + 1;
        }

        int maior = vet[0];
        int menor = vet[0];

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] > maior) {
                maior = vet[i];
            }

            else if(vet[i] < menor) {
                menor = vet[i];
            }
        }
    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    }
}

//Funfando