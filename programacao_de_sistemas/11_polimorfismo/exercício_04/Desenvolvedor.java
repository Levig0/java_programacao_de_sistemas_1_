public class Desenvolvedor extends Funcionario {
    private double salarioFixo = 2000;

    @Override
    public double calcularSalario() {
        return salarioFixo;} 

    @Override
    public String toString() {
        return "Desenvolvedor";
    }
}
