public class Aluno {
    private int matricula;
    private String nome;
    private double primeiraNota;
    private double segundaNota;
    private double notaTrabalho;



    public double media(double primeiraNota, double segundaNota, double notaTrabalho){
        double media = (primeiraNota*2.5f+segundaNota*2.5f+notaTrabalho*2)/7;
        return media;
    }
    public double mediaFinal() {
        double media = media(primeiraNota,segundaNota,notaTrabalho);
        if (media <6) {
            return 12 - media;
        } else {
            return 0;
        }
    }


    public Aluno(int matricula, String nome, double primeiraNota, double segundaNota, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.notaTrabalho = notaTrabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}
