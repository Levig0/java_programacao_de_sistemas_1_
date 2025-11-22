public class Alunoteste {
    public static void main(String[] args) {
        Aluno j = new Aluno(123, "João Paulo");
        Aluno a = new Aluno(456, "Ana Maria", 10, 7);

        float mediaAna = Aluno.calculaMedia(a.n1, a.n2, 1);

        System.out.println("Informações do João");
        System.out.println("Tia = " + j.tia);
        System.out.println("Nome = " + j.nome);
        System.out.println();
        System.out.println("Informações da Ana");
        System.out.println("Tia = " + a.tia);
        System.out.println("Nome = " + a.nome);
        System.out.println("Média = " + mediaAna);
    }
}
