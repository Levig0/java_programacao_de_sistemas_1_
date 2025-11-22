import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ContaBasica cb = new ContaBasica("Levi Guerra", 4510, 111222333, 10000);
        System.out.println("---CONTA BÁSICA---");
        System.out.println(cb.extrato());
        System.out.println(cb.saque(900.0));
        System.out.println("Saldo atual: " + cb.getSaldo());
        System.out.println("");

        ContaEspecial ce = new ContaEspecial("Bianca Toledo", 5410, 333222111, 20000);
        ce.setLimite(2000);
        System.out.println("---CONTA ESPECIAL---");
        System.out.println(ce.extrato());
        System.out.println(ce.saque(15000));
        System.out.println("Saldo atual: " + ce.getSaldo());
        System.out.println("");

        
        ContaPoupanca cp = new ContaPoupanca("Simone Silva", 1540, 222333111, 1000);
        double[] saldos = {100, 300, 200};
        for(double saldo: saldos) {
            System.out.println("---CONTA POUPANÇA---");
            System.out.println(cp.extrato());
            System.out.println(cp.saque(1000));
            System.out.println("");

        }
    }
}
