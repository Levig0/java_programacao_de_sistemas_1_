public class exerc01c {
    int numero_conta;
    String nome_cliente;
    int senha;
    int chave_pix;

    public static void dadosCliente(String nome_cliente, int numero_conta, int senha, int chave_pix) {
        System.out.println("Nome do cliente: " + nome_cliente);
        System.out.println("Número da conta: " + numero_conta);
        System.out.println("Senha: " + senha);
        System.out.println("Chave Pix: " + chave_pix);
    }
}
