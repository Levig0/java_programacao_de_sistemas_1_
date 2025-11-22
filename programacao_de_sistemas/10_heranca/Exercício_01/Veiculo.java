public class Veiculo {
    String descrição;

    public Veiculo() {}

    public Veiculo(String descrição) {
        this.descrição = descrição;
    }

    public void locomover() {
        System.out.println("O veículo está se movendo.");
    }
}
