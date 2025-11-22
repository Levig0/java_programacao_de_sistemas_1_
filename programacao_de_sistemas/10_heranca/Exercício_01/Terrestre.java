public class Terrestre extends Veiculo {
    int qtdeRodas;

    public Terrestre() {}

    public Terrestre(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }

    public void acelerar() {
        System.out.println("O veículo terrestre está acelerando.");
    }

    public void frear() {
        System.out.println("O veículo terrestre está freando.");
    }
}