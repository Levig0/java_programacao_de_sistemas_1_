import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------" );
            System.out.println("|        <<<<|MENU|>>>>       |" );
            System.out.println("-------------------------------" );
            System.out.println("|(1) Cadastrar Pedido         |" );
            System.out.println("|(2) Consultar Pedido         |" );
            System.out.println("|(3) Encerrar                 |" );
            System.out.println("-------------------------------" );
            System.out.print  ("Escolha uma opção: "             );
            int opcao = sc.nextInt();
            sc.nextLine(); 

            if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                break;
            }

            switch (opcao) {
                case 1:
                    Pedido pedido = new Pedido();
                    pedido.cadastro();
                    pedidos.add(pedido);
                    break;

                case 2:
                    System.out.println("Pedidos cadastrados:");
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println("Pedido " + (i + 1));
                    }

                    System.out.println("Pedido que deseja consultar: ");
                    int num = sc.nextInt();

                    if (num >= 1 && num <= pedidos.size()) {
                        System.out.println(pedidos.get(num - 1).consulta());
                        pedidos.get(num - 1).calculaTotalPedido();
                    } else {
                        System.out.println("Número inválido. Tente novamente.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
