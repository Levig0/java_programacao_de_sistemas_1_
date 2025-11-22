public class Assistente extends Colaborador{
    public Assistente(String nome, double salarioBase) {super(nome, salarioBase);}

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}
