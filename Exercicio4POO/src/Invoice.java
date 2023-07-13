


public class Invoice {
    private int codigoItem;
    private String descicao;
    private int quantidade;
    private float precoUnitario;


    public Invoice(int codigoItem, String descicao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescicao(descicao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);



    }

    public double getInvoiceAmount() {
      return quantidade * precoUnitario;
    };

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }

    }


}
