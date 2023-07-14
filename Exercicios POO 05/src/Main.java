public class Main {
    public static void main(String[] args) {

        Aluno infoAluno = new Aluno(98839, "Junior", 5, 4, 3.5);

        double media = infoAluno.media(infoAluno.getPrimeiraNota(), infoAluno.getSegundaNota(), infoAluno.getNotaTrabalho());
        double mediaFinal1 = infoAluno.mediaFinal();
        System.out.printf("%.2f",media);
        System.out.printf("\n%.2f",mediaFinal1);

    }
}