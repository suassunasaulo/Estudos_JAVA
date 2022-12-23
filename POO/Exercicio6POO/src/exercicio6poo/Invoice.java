package exercicio6poo;


public class Invoice {
    
    private int itensFaturados;
    private String descricao;
    private int quantidadeComprada;
    private float precoUnitario;

    public Invoice(int itensFaturados, String descricao, int quantidadeComprada, float precoUnitario) {
        this.setItensFaturados(itensFaturados);
        this.setDescricao(descricao);  
        this.setPrecoUnitario(precoUnitario);
        this.setQuantidadeComprada(quantidadeComprada);
    }
    public double getInvoiceAmount (){
       return quantidadeComprada * precoUnitario;
    }

    public int getItensFaturados() {
        return itensFaturados;
    }

    public void setItensFaturados(int itensFaturados) {
        this.itensFaturados = itensFaturados;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
       if (quantidadeComprada<0){
             this.quantidadeComprada = 0;
        } else{
            this.quantidadeComprada = quantidadeComprada; 
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario<0){
            this.precoUnitario = 0.0f;
        }else{
           this.precoUnitario = precoUnitario; 
        }
    }
    
    
    
    
}
