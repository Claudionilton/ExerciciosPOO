public class ContaCorrente {

    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    //Saldo obrigatorio
    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    //Saldo não é obrigatorio porem tem o valor default=0 (zero)
    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos para alterar nome, adicionar deposito e realizar saque

    public void alterarNome(String novoNome){
        nomeCorrentista = novoNome;
        System.out.println("Olá "+novoNome+", A alteração do nome foi realizada com sucesso!");
    }

    public void deposito(double valor){
        saldo += valor;
        System.out.println("Deposito realizado no valor R$:"+valor);
        System.out.println("Saldo atual apos o deposito:"+saldo);
    }

    public void saque(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado no valor de R$:"+valor);
            System.out.println("Saldo atual apos o saque:"+saldo);
        } else {
            System.out.println("O saque de R$:"+valor+" falhou!");
            System.out.println("Saldo insuficiente!");
        }
    }
}
