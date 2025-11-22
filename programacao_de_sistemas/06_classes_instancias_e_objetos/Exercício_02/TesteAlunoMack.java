import java.util.Scanner;
public class TesteAlunoMack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoMack aluno1 = new AlunoMack();
        AlunoMack aluno2 = new AlunoMack();
        
        aluno1.nome = "Levi Guerra";
        aluno1.ra = 10748088;
        aluno1.curso = "Sistemas de Informação";
        aluno1.numeroEtapa = 2;

        aluno2.nome = "Bianca Toledo";
        aluno2.ra = 10748089;
        aluno2.curso = "Análise e Desenvolvimento de Sistemas";
        aluno2.numeroEtapa = 9;

        AlunoMack.matricular(aluno1.curso);
        AlunoMack.mudarEtapa(aluno1.numeroEtapa);
        AlunoMack.exibirInfo(aluno1.nome, aluno1.ra, aluno1.curso, aluno1.numeroEtapa);
        System.out.println();
        AlunoMack.matricular(aluno2.curso);
        AlunoMack.mudarEtapa(aluno2.numeroEtapa);
        AlunoMack.exibirInfo(aluno2.nome, aluno2.ra, aluno2.curso, aluno2.numeroEtapa);
    }
}       