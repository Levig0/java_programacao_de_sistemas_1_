public class Aluno {
    int tia;
    String nome;
    float n1;
    float n2;


    Aluno(int tia, String nome) {
        this.tia = tia;
        this.nome = nome;
    }

    Aluno(int tia, String nome, float n1) {
        this.tia = tia;
        this.nome = nome;
        this.n1 = n1;
    }

    Aluno(int tia, String nome, float n1, float n2) {
        this.tia = tia;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public static float calculaMedia(float n1, float n2, float partic) {
        float media = ((n1 + n2) / 2) + partic;
        return media;
    }
}