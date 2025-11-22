import java.util.Scanner;

public class exerc01 {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double x = 10;
        double y = 5;
        double z = 0;

        System.out.println("A soma de " + x + " e " + y + " é " + somar(x, y));
        System.out.println("A subtração de " + x + " e " + y + " é " + subtrair(x, y));
        System.out.println("A multiplicação de " + x + " e " + y + " é " + multiplicar(x, y));
        System.out.println("A divisão de " + x + " por " + y + " é " + dividir(x, y));
        System.out.println("A divisão de " + x + " por " + z + " é " + dividir(x, z)); 
    }
}

//Funfando
