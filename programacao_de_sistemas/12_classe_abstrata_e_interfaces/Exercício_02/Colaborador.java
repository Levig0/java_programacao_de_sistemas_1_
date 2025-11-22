public abstract class Colaborador {
    private String nome;
    private double salarioBase;

    public String getNome() {return nome;}
    public double getSalarioBase() {return salarioBase;}

    public Colaborador(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}