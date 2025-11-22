public class Mensalista extends Funcionario implements Geral{
    private float salario;
    private int diasfaltosos;

    public Mensalista(String nome, String ctps, float salario, int diasfaltosos) {
        super(nome, ctps);
        this.salario = salario;
        this.diasfaltosos = diasfaltosos;
    }

    public float getSalario() {return salario;}
    public int getDiasfaltosos() {return diasfaltosos;}
    public void setSalario(float salario) {}
    public void setDiasfaltosos(int diasfaltosos) {}

    @Override
    public float calculaSalario() {
        return salario - (salario/30 * diasfaltosos);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Carteira de trabalho: " + getCtps());
        System.out.println("Salário: " + getSalario());
        System.out.println("Quantidade de faltas: " + getDiasfaltosos());
        System.out.println("Salário total: " + calculaSalario());
    }
}
