public class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, int numero, String cidade, String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {return logradouro;}
    public int getNumero() {return numero;}
    public String getCidade() {return cidade;}
    public String getEstado() {return estado;}
}

