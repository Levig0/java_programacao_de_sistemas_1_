public class Comissionado extends Mensalista implements Geral{
    private float valorComissao;
    

    public Comissionado(String nome, String ctps, float salario, int diasfaltosos, float valorComissao) {
        super(nome, ctps, salario, diasfaltosos);  
        this.valorComissao = valorComissao;
    }

    public float getValorComissao() {return valorComissao;}
    public void setValorComissao(float valorComissao) {}

    @Override
    public float calculaSalario() {
        return valorComissao + super.calculaSalario();
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Carteira de trabalho: " + getCtps());
        System.out.println("Salário: " + getSalario());
        System.out.println("Comissão: " + getValorComissao());
        System.out.println("Salário total: " + calculaSalario());
    }
}
