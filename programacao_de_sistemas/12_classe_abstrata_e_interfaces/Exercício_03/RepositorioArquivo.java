public class RepositorioArquivo extends Repositorio{
    public void salvar(String dados) {
        System.out.println("Salvando dados no arquivo: " + dados);
    }

    public String ler() {
        return "Lendo dados do arquivo...";
    }
}
