public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {this.raio = raio;}

    public double getRaio() {return this.raio;}

    @Override
    public double calculaArea() {
        double areaCirculo = Math.PI * raio * raio;
        return areaCirculo;
    }

    @Override 
    public String toString() {
        return "Círculo(raio = " + raio + ")";
    }
}
