package Exercício_08;
import java.util.Scanner;
public class exec08 {
    private void main(String[] args) {
        //Criando um leiaeto da classe Scanner(Recebe dados) 
        Scanner leia = new Scanner(System.in);

        int valor_Diaria = 350;
        int desconto_hospede = 50;
        
        System.out.println("Quantidade total de hospedes:");
        int hospedes = leia.nextInt();
        System.out.println("Quantidade de hospedes com primeira estadia: ");
        int prim_est = leia.nextInt();
        System.out.println("Dias de estadia: ");
        int dias = leia.nextInt();
        System.out.println("Consumo do frigobar: ");
        double consumo = leia.nextInt();

        int subtotal_Diaria = dias * valor_Diaria;
        int calculo_Desconto = prim_est * desconto_hospede;
        int taxa_Servico = subtotal_Diaria * 10/100; 
        double total_Bruto = subtotal_Diaria + consumo + taxa_Servico;
        double total_Pagar = subtotal_Diaria + consumo + taxa_Servico - calculo_Desconto; 
        double valor_Pessoa = total_Pagar / hospedes;

        System.out.println("------------------------------------------");
        System.out.println("          " + "DETALHAMENTO DA CONTA" + "          ");
        System.out.println("------------------------------------------");
        System.out.println("Valor da diária:                   R$" + valor_Diaria);
        System.out.println("Noites de estadia:                 " + dias);
        System.out.println("Subtotal das diárias (" + dias + " x R$" + valor_Diaria + ")" + "   " + "R$" + subtotal_Diaria);
        System.out.println();
        System.out.println("Taxa de Serviço(10% sobre diária): R$" + taxa_Servico);
        System.out.println("Consumo do Frigobar:               R$" + consumo);
        System.out.println("------------------------------------------");
        System.out.println("Total Bruto:                       R$" + total_Bruto);
        System.out.println("Desconto de Boas-Vindas:           R$" + calculo_Desconto);
        System.out.println("==========================================");
        System.out.println("TOTAL A PAGAR:                     R$" + total_Pagar);
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Valor por hóspede (" + hospedes + " pessoas):     " + "R$" + valor_Pessoa);
        System.out.println();
        System.out.println(" Obrigado pela preferência e boa viagem!");
        System.out.println("==========================================");
    }
}
