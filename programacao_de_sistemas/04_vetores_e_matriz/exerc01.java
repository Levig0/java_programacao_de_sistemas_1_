import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] diasSemana = new String[7];

        for(int i=0; i < diasSemana.length;i++) {
            System.out.print("Digite um dia da semana: ");
            diasSemana[i] = leia.nextLine();
        }

        for(int i=0; i < diasSemana.length;i++) {
        System.out.println("Dia: " + diasSemana[i]);
        }
    leia.close();
    }
    
}

//Funfando