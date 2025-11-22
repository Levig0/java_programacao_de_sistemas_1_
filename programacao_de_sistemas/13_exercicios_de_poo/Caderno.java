import java.util.Scanner;

public class Caderno extends Produto {
    private int qtdefolhas;
    private String tamanho;
    private String tipo;
    private boolean capadura;

    public int getQtdefolhas() {return qtdefolhas;}
    public void setQtdefolhas(int qtdefolhas) {this.qtdefolhas = qtdefolhas;}
    public String getTamanho() {return tamanho;}
    public void setTamanho(String tamanho) {this.tamanho = tamanho;}
    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public boolean isCapadura() {return capadura;}
    public void setCapadura(boolean capadura) {this.capadura = capadura;}

    public Caderno(int qtdefolhas, String tamanho, String tipo, boolean capadura, String marca, float valor) {
        super(marca, valor);
        this.qtdefolhas = qtdefolhas;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.capadura = capadura;
    }

    @Override
    public void cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());

        System.out.println("Digite o valor: ");
        setValor(sc.nextFloat());
        sc.nextLine();

        System.out.println("Digite a quantidade de folhas: ");
        setQtdefolhas(sc.nextInt());
        sc.nextLine();

        System.out.println("Digite o tamanho do caderno: ");
        setTamanho(sc.nextLine());

        System.out.println("Digite o tipo do caderno: ");
        setTipo(sc.nextLine());

        System.out.println("É capa dura? (true/false): ");
        setCapadura(sc.nextBoolean());
    }

    @Override
    public String consulta() {
        return "--- CADERNO ---"     +                   "\n" +
        "Marca: "                    + getMarca()      + "\n" +
        "Valor: "                    + getValor()      + "\n" +
        "Qtd. de Folhas: "           + getQtdefolhas() + "\n" +
        "Tamanho: "                  + getTamanho()    + "\n" +
        "Tipo: "                     + getTipo()       + "\n" +
        "Capa Dura: "                + isCapadura()    + "\n" +
        
        "-------------------------------------";
    }
}
