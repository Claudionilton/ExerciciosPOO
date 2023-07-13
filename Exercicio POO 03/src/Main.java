public class Main {
    public static void main(String[] args) {

        BombaCombustivel bomba = new BombaCombustivel("Gasolina",
                5.4f,5000);

        bomba.abastecerPorLitro(4999);
        bomba.abastecerPorValor(5.4);
    }
}