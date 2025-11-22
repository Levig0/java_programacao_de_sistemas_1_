import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Digite seu telefone: ");
        int telefone = sc.nextInt();

        System.out.println("+----------------------------+");
        System.out.println("| Nome:\t " + nome + "         |");
        System.out.println("| Cargo:\t " + cargo + "       |");
        System.out.println("| Telefone:\t " + telefone + " |");
        System.out.println("+----------------------------+");

        System.out.println("Mensagem: \"Prazer em conhecer!\"");

        sc.close();
    } 
}