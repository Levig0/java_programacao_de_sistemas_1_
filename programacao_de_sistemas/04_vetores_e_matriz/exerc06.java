import java.util.Random;
import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {
        Random numAleatorio = new Random();
        Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        boolean encontrado = false;

        for(int i=0; i<matriz.length; i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = numAleatorio.nextInt(100) + 1;
            }
        }

        System.out.print("Verifique se o número contém na matriz: ");
        int num = leia.nextInt();
        for(int i=0; i<matriz.length; i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j] == num) {
                    System.out.print("Número contido! Linha " + i + " e coluna " + j + ".");
                    encontrado = true;
                }
            }
        
        }

        if(!encontrado){
            System.out.println("Valor não encontrado!");
        }
        leia.close();
    }
}

//Funfando