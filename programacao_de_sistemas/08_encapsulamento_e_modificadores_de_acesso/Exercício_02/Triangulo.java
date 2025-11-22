package Exercício_02;

public class Triangulo {
    double base;
    double altura;

    Triangulo() {}
    Triangulo(double b, double a) {this.base = b; this.altura = a;}

    public double getBase() {return this.base;}
    public double getAltura() {return this.altura;}

    public void setBase(double b) {this.base = b;}
    public void setAltura(double a) {this.altura = a;}

    public void calculaArea() {
        double area = (base*altura)/2;
        System.out.println("Área do triângulo: " + area);
    }

    public void imprimeDados() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
    }
    }

