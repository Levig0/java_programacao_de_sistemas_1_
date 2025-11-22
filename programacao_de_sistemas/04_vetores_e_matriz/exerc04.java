public class exerc04 {
    public static void main(String[] args) {

       int [][] matriz = new int [3][3]; 
       matriz[0][0] = 0;
       matriz[0][1] = 1;
       matriz[0][2] = 2;
       matriz[1][0] = 1;
       matriz[1][1] = 2;
       matriz[1][2] = 3;
       matriz[2][0] = 2;
       matriz[2][1] = 3;
       matriz[2][2] = 4;

       for(int i=0; i < matriz.length;i++){
        for(int j=0; j < matriz[i].length;j++){
            System.out.println(matriz[i][j]);
        }
       }
    }
}

//funfando