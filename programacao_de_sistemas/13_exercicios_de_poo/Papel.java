import java.util.Scanner;
public class Papel extends Produto {
    private String cor;
    private String tipo;
    private float largura;
    private float altura;
    private int gramatura;
    private boolean pautado;

    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}
    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public float getLargura() {return largura;}
    public void setLargura(float largura) {this.largura = largura;}
    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}
    public int getGramatura() {return gramatura;}
    public void setGramatura(int gramatura) {this.gramatura = gramatura;}
    public boolean getPautado() {return pautado;}
    public void setPautado(boolean pautado) {this.pautado = pautado;}

    public Papel(String cor, String tipo, float largura, float altura, int gramatura, boolean pautado, String marca, float valor) {
        super(marca, valor);
        this.cor = cor;
        this.tipo = tipo;
        this.largura = largura;
        this.altura = altura;
        this.gramatura = gramatura;
        this.pautado = pautado;
    }

    @Override
    public void cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());

        System.out.println("Digite o valor: ");
        setValor(sc.nextFloat());

        System.out.println("Digite a cor: ");
        setCor(sc.nextLine());

        System.out.println("Digite o tipo: ");
        setTipo(sc.nextLine());

        System.out.println("Digite a largura: ");
        setLargura(sc.nextFloat());

        System.out.println("Digite a altura: ");
        setAltura(sc.nextFloat());

        System.out.println("Digite a gramatura: ");
        setGramatura(sc.nextInt());

        System.out.println("É pautado?(true/false): ");
        setPautado(sc.nextBoolean());
    }

    @Override
    public String consulta() {
        return "--- PAPEL ---" + "\n" +
        "Marca: "     + getMarca()     + "\n" +
        "Valor: "     + getValor()     + "\n" +
        "Cor: "       + getCor()       + "\n" +
        "Tipo: "      + getTipo()      + "\n" +
        "Largura: "   + getLargura()   + "\n" +
        "Altura: "    + getAltura()    + "\n" +
        "Gramatura: " + getGramatura() + "\n" +
        "Pautado: "   + getPautado()   + "\n" +
        "-------------------------------------";
    }
}
