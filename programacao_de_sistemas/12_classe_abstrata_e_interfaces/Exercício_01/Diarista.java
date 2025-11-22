public class Diarista extends Funcionario implements Geral{
    private float valordia;
    private int qtdedias;

    public Diarista(String nome, String ctps, float valordia, int qtdedias) {
        super(nome, ctps);
        this.valordia = valordia;
        this.qtdedias = qtdedias;
    }

    public float getValordia() {return valordia;}
    public int getQtdedias() {return qtdedias;}
    public void setValordia(float valor) {}
    public void setQtdedias(int qtdedias) {}

    @Override
    public float calculaSalario() {
        return valordia * qtdedias;
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Carteira de trabalho: " + getCtps());
        System.out.println("Valor da diária: " + getValordia());
        System.out.println("Dias trabalhados: " + getQtdedias());
        System.out.println("Salário total: " + calculaSalario());
    }
}
