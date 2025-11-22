public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    Funcionario() {
        this.cargo = "Assistente";
    }

    Funcionario(int c, float s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }

    public void calculaAumento(float porcentagem) {
        float aumentoSalario = this.salario * porcentagem;
        float newSalario = this.salario + aumentoSalario;
        float porcInt = porcentagem * 100;
        System.out.println("Aumento  de salário com " + porcInt + "% de aumento: R$" + aumentoSalario);
        System.out.println("Novo salário: R$" + newSalario);
    }

    public void calculaAumento(int tempo) {
        float aumentoPorTemopo = 150 * tempo;
        float novoSalario = this.salario + aumentoPorTemopo;
        System.out.println("Aumento de salário por tempo de serviço(" + tempo + "): R$" + aumentoPorTemopo);
        System.out.println("Novo salário: R$" + novoSalario);
    }

    public int getCracha() {return this.cracha;}
    public float getSalario() {return this.salario;}
    public String getCargo() {return this.cargo;}

    public void setCracha(int c) {this.cracha = c;}
    public void setSalario(float s) {this.salario = s;}
    public void setCargo(String car) {this.cargo = car;}
}   