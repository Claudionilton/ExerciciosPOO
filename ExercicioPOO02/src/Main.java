public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(9982000,"Claudionilton",3000);

            System.out.println("Esses são os dados atuais da sua conta.");
            System.out.println("Nome:" + conta.getNomeCorrentista());
            System.out.println("Numero da conta:" + conta.getNumeroConta());
            System.out.println("Saldo:" + conta.getSaldo());

            conta.alterarNome("Claudionilton José do Nascimento Júnior");
            conta.saque(2000);
            conta.deposito(10);
            conta.saque(1900);

            System.out.println("Saldo atual:" + conta.getSaldo());

    }
}
