public class Main {
    public static void main(String[] args) {
        Repositorio r1 = new RepositorioArquivo();
        Repositorio r2 = new RepositorioBancoDeDados();

        r1.salvar("atividade_01");
        System.out.println(r1.ler());

        r2.salvar("arquivo/atividade_01/");
        System.out.println(r2.ler());
    }
}
