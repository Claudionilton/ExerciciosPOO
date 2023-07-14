public class Main {
    public static void main(String[] args) {


        Elevador elevador1 = new Elevador(2,12,5,3);

        elevador1.desce(2);
        elevador1.entra(0);
        elevador1.sai(10);
        elevador1.sobe(12);
        elevador1.inicializa(0);
    }
}