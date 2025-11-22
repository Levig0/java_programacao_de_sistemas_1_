public class exerc02 {
    public static void gerarTabuada(int num) {
        for(int i=1; i<=10; i++) {
           int resultado = num * i;
           System.out.println(num + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        int numero5 = 5;
        int numero9 = 9;
        System.out.println("Tabuada do " + numero5 + ":");
        gerarTabuada(numero5);
        System.out.println("Tabuada do " + numero9 + ":");
        gerarTabuada(numero9);
    }
}
