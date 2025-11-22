import java.util.ArrayList;
public class FolhaDePagamento {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente(3000, 500));
        funcionarios.add(new Desenvolvedor());
        funcionarios.add(new Estagiario(1000));

        for(Funcionario i: funcionarios){
            System.out.println("Salário do " + i + ": " + i.calcularSalario());
        }
    }
}
