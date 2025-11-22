import java.util.ArrayList;
public class Pessoa{
    private String nome;
    private ArrayList<Endereco> enderecos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.enderecos = new ArrayList<>();
    }

    public void addEndereco(Endereco endereco) {enderecos.add(endereco);}
    public void removeEndeco(Endereco endereco) {enderecos.remove(endereco);}

    public void listarEnderecos() {
        System.out.println("Endereços - " + nome);
        for(Endereco i: enderecos){
            System.out.println(i.getTipo() + ": " + i.getLogradouro() + ", " + i.getNumero() + " - " + i.getCidade() + "/" + i.getEstado());
        }
        System.out.println();
    }
}