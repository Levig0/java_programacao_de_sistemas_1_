public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Levi Guerra");
        Endereco e = new Endereco("Rua pirauba", 190, "Guarulhos", "São Paulo");

        p.setEndereco(e);

        System.out.println("Nome: "       + p.getNome()                    );
        System.out.println("Logradouro: " + p.getEndereco().getLogradouro());
        System.out.println("Número: "     + p.getEndereco().getNumero()    );
        System.out.println("Cidade: "     + p.getEndereco().getCidade()    );
        System.out.println("Estado: "     + p.getEndereco().getEstado()    );
    }
}
