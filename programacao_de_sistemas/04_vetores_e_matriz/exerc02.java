import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] v1 = new int[8];
        int[] v2 = new int[8];

        for(int i = 0; i < v1.length;i++) {
            System.out.print("Digite um número inteiro até o laço finalizar: ");
            v1[i] = leia.nextInt();
        }

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        for(int i = 0; i < v1.length;i++) {
            System.out.println("v1 " + i + ": " + v1[i]);
        }

        for(int i = 0; i < v1.length;i++) {
            System.out.println("v2 " + i + ": " + v2[i]);
        }
    leia.close();
    }
}

//Funfando
