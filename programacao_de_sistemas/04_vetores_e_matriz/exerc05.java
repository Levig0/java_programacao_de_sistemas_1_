import java.util.Scanner;
public class exerc05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print("Digite o valor da linha " + i + " e coluna " + j + ": ");
                matriz[i][j] = leia.nextInt();

                if(i==j) {
                    somaPrincipal += matriz[i][j];
                }
                else if(i + j == matriz.length - 1) {
                    somaSecundaria += matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        leia.close();
    }
}

//Funfando
