public class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    public Estagiario(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    @Override
    public String toString() {
        return "Estagiario";
    }
}
