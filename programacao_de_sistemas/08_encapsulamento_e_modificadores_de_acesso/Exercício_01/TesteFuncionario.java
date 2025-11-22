public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f01 = new Funcionario(10740000, 2500, "Analista");

        System.out.println("Cracha: " + f01.getCracha());
        System.out.println("Salario: " + f01.getSalario());
        System.out.println("Cargo: " + f01.getCargo());
        System.out.println();
        //
        f01.calculaAumento(0.1f);
        System.out.println();
        f01.calculaAumento(3);
    }
}
