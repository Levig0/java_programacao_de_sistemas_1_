public class Main {
    public static void main(String[] args) {
        Funcionario d1 = new Diarista("Bianca", "123A", 250, 24);
        Funcionario m1 = new Mensalista("Levi", "123B", 3000, 2);
        Funcionario c1 = new Comissionado("Igor", "123C", ((Mensalista) m1).getSalario(), 0, 1000);

        d1.imprimirDados();
        System.out.println("");
        m1.imprimirDados();
        System.out.println("");
        c1.imprimirDados();
    }
}
