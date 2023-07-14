public class Elevador {
    private int andar = 0;
    private int totalAndar;
    private int qtdMaxPessoas;
    private int qtdPessoas;

    public Elevador(int andar, int totalAndar, int qtdMaxPessoas, int qtdPessoas) {
        this.andar = andar;
        this.totalAndar = totalAndar;
        this.qtdMaxPessoas = qtdMaxPessoas;
        this.qtdPessoas = qtdPessoas;
    }

    //Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    public void inicializa(int andar){
        if(andar == 0 && qtdPessoas >0){
            System.out.println("O elevador etá no terreo e está vazio.");
        } else {
            System.out.println("Não é possivel iniciar");
        }

    }

    //Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    public void entra(int entrarElevador){
        if((entrarElevador+qtdPessoas) <= qtdMaxPessoas){
            qtdPessoas+=entrarElevador;
            System.out.println("Entrou no elevador o total de: "+entrarElevador + "e agora tem: "+qtdPessoas+" dentro do elevador.");
        } else {
            System.out.println("Quantidade maxima de pessoas exedita.");
        }
    }

    //Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    public void sai(int saiElevador){
        if(qtdPessoas ==0){
            System.out.println("Não tem nenhuma pessoa dentro do elevador.");
        } else if (qtdPessoas >= saiElevador){
            qtdPessoas -= saiElevador;
            System.out.println("Saiu do elevador o total de: "+saiElevador + "e agora tem: "+qtdPessoas+" dentro do elevador.");
        }
    }

    //Sobe: para subir um andar (não deve subir se já estiver no último andar);
    public void sobe(int sobeAndar){
        if((andar + sobeAndar) <= totalAndar){
            andar += sobeAndar;
            System.out.println("O elevador subiu "+sobeAndar+" e agora está no andar: " +andar);
        } else{
            System.out.println("Você já está no ultimo andar.");
        }
    }

    //Desce: para descer um andar (não deve descer se já estiver no térreo);
    public void desce(int desceAndar){
        if ((andar - desceAndar) >= 0){
            andar -= desceAndar;
            System.out.println("Voce chegou no "+andar+" andar");
        } else {
            System.out.println("Você já está no terreo, não pode mais descer.");
        }
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public int getQtdMaxPessoas() {
        return qtdMaxPessoas;
    }

    public void setQtdMaxPessoas(int qtdMaxPessoas) {
        this.qtdMaxPessoas = qtdMaxPessoas;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
}
