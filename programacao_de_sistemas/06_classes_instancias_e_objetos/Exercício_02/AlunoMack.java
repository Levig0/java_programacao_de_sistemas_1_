public class AlunoMack {
    String nome;
    int ra;
    String curso;
    int numeroEtapa;

    public static void matricular(String curso)  {
        System.out.println("Matrícula realizada no curso de " + curso);
    }

    public static void mudarEtapa(int numeroEtapa) {
        System.out.println("Mudança para a etapa " + numeroEtapa + " realizada com sucesso.");
    }

    public static void exibirInfo(String nome, int ra, String curso, int numeroEtapa) {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
        System.out.println("Número da Etapa: " + numeroEtapa);
    }
     
}
