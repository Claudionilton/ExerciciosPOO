import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento,double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }
    public Integer getIdade () {
        String dataNascimentoString = dataNascimento;

        // Formato da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Convertendo a string para LocalDate
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);

        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calculando a diferença de anos, meses e dias
        Period periodo = Period.between(dataNascimento, dataAtual);

        // Obtendo os valores individuais
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Exibindo a idade
        System.out.println("Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias");
        return anos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
