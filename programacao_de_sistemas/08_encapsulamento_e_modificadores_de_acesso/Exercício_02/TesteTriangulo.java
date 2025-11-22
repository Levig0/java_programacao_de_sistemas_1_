package Exercício_02;
import java.util.Scanner;

public class TesteTriangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangulo t1 = new Triangulo(5, 4);
        Triangulo t2 = new Triangulo();


        
        System.out.print("Digite a base do triângulo 2: ");
        double base = sc.nextDouble();
        t2.setBase(base);
        System.out.print
        ("Digite a altura do triângulo 2: ");
        double altura = sc.nextDouble();
        t2.setAltura(altura);

        t1.imprimeDados();
        t1.calculaArea();
        System.out.println();
        t2.imprimeDados();
        t2.calculaArea();

    }
}
