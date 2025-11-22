public abstract class Funcionario implements Geral{
    private String nome;
    private String ctps;

    public Funcionario (String nome, String ctps) {
        this.nome = nome;
        this.ctps = ctps;
    }

    public String getNome() {return nome;}
    public String getCtps() {return ctps;}
    public void setNome(String nome) {}
    public void serCtps(String ctps) {}

    public abstract float calculaSalario();

    @Override
    public void imprimirDados() {}
}