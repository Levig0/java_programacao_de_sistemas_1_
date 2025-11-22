public class exerc01a {
    String marca;
    String modelo;
    Integer tamanho;
    Boolean Smart;
}

    public static void verificarSmartTV(Boolean Smart) {
        if (Smart == true) {
            System.out.println("A TV é Smart");
        } else {
            System.out.println("A TV não é Smart");
        }
        
    }
}
