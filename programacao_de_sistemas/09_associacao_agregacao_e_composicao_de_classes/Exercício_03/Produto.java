public class Produto {
    private int codigo;
    private String descricao;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {return codigo;}
    public String getDescricao() {return descricao;}
}