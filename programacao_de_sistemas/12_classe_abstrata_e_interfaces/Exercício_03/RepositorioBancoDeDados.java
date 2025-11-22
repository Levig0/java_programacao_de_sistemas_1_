public class RepositorioBancoDeDados extends Repositorio{
    public void salvar(String dados) {
        System.out.println("Salvando dados no Banco de Dados: " + dados);
    }

    public String ler() {
        return "Lendo dados do Banco de Dados...";
    } 
}
