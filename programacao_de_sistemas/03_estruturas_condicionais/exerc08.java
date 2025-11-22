import java.util.Scanner;

public class exerc08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int nota = -1;

        while(nota < 0 || nota > 10) {
            System.out.print("Digite um número válido(0-10): ");
            
            nota = leia.nextInt();
            }

        System.out.println("-> " + nota + " é um valor válido!");
        }
    }

//Tá funfando!