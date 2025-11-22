public class Main {
    public static void main(String[] args) {
        Colaborador c1 = new Assistente("Levi", 1500);
        Colaborador c2 = new Vendedor("Bianca", 2000, 5000);

        System.out.println("Salário do Assistente " + c1.getNome() + ": " + c1.calcularSalario());
        System.out.println("Salário da Vendedora " + c2.getNome() + ": " + c2.calcularSalario());
    }
}
