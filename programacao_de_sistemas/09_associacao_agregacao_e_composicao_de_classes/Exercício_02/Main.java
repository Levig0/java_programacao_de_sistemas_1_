public class Main{
    public static void main(String[] args){
        Pessoa p = new Pessoa("Levi Guerra da Silva");

        Endereco e1 = new Endereco("Rua Pirauba", 190, "Guarulhos", "São Paulo", "Residencial");
        Endereco e2 = new Endereco("Faria Lima", 1060, "Pinheiros", "São Paulo", "Profissional");

        p.addEndereco(e1);
        p.addEndereco(e2);
        p.listarEnderecos();
        p.removeEndeco(e2);
        p.listarEnderecos();
    }
}