import java.util.Scanner;

public class CaixaLapis extends Produto {
    private int quantidade;
    private boolean colorido;
    private String graduacao;

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    public boolean isColorido() {return colorido;}
    public void setColorido(boolean colorido) {this.colorido = colorido;}
    public String getGraduacao() {return graduacao;}
    public void setGraduacao(String graduacao) {this.graduacao = graduacao;}

    public CaixaLapis(int quantidade, boolean colorido, String graduacao, String marca, float valor) {
        super(marca, valor);
        this.quantidade = quantidade;
        this.colorido = colorido;
        this.graduacao = graduacao;
    }

    
    @Override
    public void cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());

        System.out.println("Digite o valor: ");
        setValor(sc.nextFloat());

        System.out.println("Digite a quantidade: ");
        setQuantidade(sc.nextInt());

        System.out.println("É colorido?(true/false): ");
        setColorido(sc.nextBoolean());

        System.out.println("Digite a graduação: ");
        setGraduacao(sc.nextLine());
    }

    @Override
    public String consulta() {
        return "--- CAIXA DE LAPIS ---"  + "\n" +
        "Marca: "      + getMarca()      + "\n" +
        "Valor: "      + getValor()      + "\n" +
        "Quantidade: " + getQuantidade() + "\n" +
        "Colorido: "   + isColorido()    + "\n" +
        "Graduação: "  + getGraduacao()  + "\n" +
        "-------------------------------------";
    }
}
