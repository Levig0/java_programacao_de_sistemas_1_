
import java.util.Scanner;


public class exerc07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;

        do {
        System.out.print("Digite um número inteiro não negativo: ");
        num = leia.nextInt();
        }
        while(num < 0); 
            int fatorial = 1;
            for(int i=1; i <= num; i++) {
                fatorial *= i;
            }
        System.out.println(num + "! = " + fatorial);

        }
    }

//Tá funfando!!