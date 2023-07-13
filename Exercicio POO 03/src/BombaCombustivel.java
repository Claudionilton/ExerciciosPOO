public class BombaCombustivel {

    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeDeCombustivel;

    public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeDeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public void abastecerPorValor(double valorAbastecido){
       double litrosAbastecidos = valorAbastecido / valorLitro;
       if(litrosAbastecidos <= quantidadeDeCombustivel){
           quantidadeDeCombustivel -= litrosAbastecidos;
           System.out.printf("\nAbastecimento realizado! Foram abastecidos: " +"%.2fL",litrosAbastecidos);
       } else {
           System.out.println("\nNão temos combustivel suficiente na bomba. ");
       }
    };

    public void abastecerPorLitro(double litrosAbastecidos){
       double valorAPagar = litrosAbastecidos * valorLitro;
       if(litrosAbastecidos <= quantidadeDeCombustivel){
           quantidadeDeCombustivel -= litrosAbastecidos;
           System.out.printf("\nAbastecimento realizado! Valor a pagar R$: "+"%.2f",valorAPagar);
       } else {
           System.out.println("\nNão temos combustivel suficiente na bomba. ");
       }
    }

    public void alterarValor(double novoValor){
        valorLitro = novoValor;
    }
    public void alterarCombustivel(String novoTipoCombustivel){
        tipoCombustivel = novoTipoCombustivel;
    }
    public void alterarQuantidadeCombustivel(double novaQuantidadeDeCombustivel){
        quantidadeDeCombustivel = novaQuantidadeDeCombustivel;
    }



    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorPorLitro() {
        return valorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorLitro = valorPorLitro;
    }

    public double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(float quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }
}
