public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura () {return this.largura;}
    public double getAltura () {return this.altura;}

    @Override
    public double calculaArea() {
        double areaRetangulo = largura * altura; 
        return areaRetangulo;
    }

    @Override
    public String toString() {
        return "Retângulo (largura - " + largura + " x altura - " + altura + ")";
    }
    
}
