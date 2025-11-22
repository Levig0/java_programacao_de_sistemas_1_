public class Gerente extends Funcionario {
    private double salarioBase;
    private double bonus;

    public Gerente(double salarioBase, double bonus) {
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }  

    @Override
    public String toString() {
        return "Gerente";
    }
}
