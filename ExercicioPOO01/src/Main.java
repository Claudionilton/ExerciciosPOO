
public class Main {
    public static void main(String[] args) {
        Pessoa user = new Pessoa("Junior", "18/11/1996", 1.90);
        double userAltura = user.getAltura();
        System.out.println("Nome:"+user.getNome());
        System.out.println("Data de Nascimento:"+user.getDataNascimento());
        System.out.println("Idade:"+ user.getIdade());
        System.out.printf("Altura:"+"%.2fM",userAltura);


    }
}