public class Vendedor extends Colaborador{
    private double totalVendas;

    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (0.1 * totalVendas);
    }
}
