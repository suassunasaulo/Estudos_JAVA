
package exercicio03;
import java.util.Scanner;

public class BombaCombustivel {
    private String TipoCombustivel;
    private float ValorPorLitro,NovoValordoLitro, ValorDesejadoDinheiro;
    private float QuantidadeCombustivel,CombustivelAbastecido; 
    private float ValorDesejadoLitros, NovaQuantidade;
    Scanner ler = new Scanner(System.in);

    public BombaCombustivel(float ValorPorLitro, float QuantidadeCombustivel) {
        this.ValorPorLitro = ValorPorLitro;
        this.QuantidadeCombustivel = QuantidadeCombustivel;
    }
    
    
    public float AbastecerPorValor(){
        System.out.println("Insira o valor a ser abastecido: ");
        ValorDesejadoDinheiro = ler.nextFloat();
        CombustivelAbastecido = ValorDesejadoDinheiro/ValorPorLitro;
        QuantidadeCombustivel = QuantidadeCombustivel - CombustivelAbastecido;
        
        System.out.println("Foi abastecido "  +  CombustivelAbastecido +  "LITROS");
        System.out.println("QUANTIDADE DE COMBUSTÍVEL DISPONÍVEL NA BOMBA: ");
        System.out.println(QuantidadeCombustivel);
        
        return CombustivelAbastecido;
    }
    
    public float AbastecerPorLitro(){
        System.out.println("Insira quantos litros deseja abastecer: ");
        ValorDesejadoLitros = ler.nextFloat();
        CombustivelAbastecido = ValorDesejadoLitros * ValorPorLitro;
        QuantidadeCombustivel = QuantidadeCombustivel - ValorDesejadoLitros;
        
        System.out.println("Valor a pagar é: "  +  CombustivelAbastecido +  "Reais");
        System.out.println("QUANTIDADE DE COMBUSTÍVEL DISPONÍVEL NA BOMBA: ");
        System.out.println(QuantidadeCombustivel);
        
        return CombustivelAbastecido;
    }
    
    public float AlterarValor(){
        System.out.println("Qual o novo valor do litro? ");
        NovoValordoLitro = ler.nextFloat();
        this.ValorPorLitro = NovoValordoLitro;
        
        System.out.println("VALOR ALTERADO PARA: " + ValorPorLitro);
        return ValorPorLitro;
    }
    
    public float AlterarQuantidadeCombustivel(){
        System.out.println("Qual a nova quantidade de combustível disponível?");
        NovaQuantidade = ler.nextFloat();
        this.QuantidadeCombustivel = NovaQuantidade;
        
        return QuantidadeCombustivel;
    }

    public float getQuantidadeCombustivel() {
        return QuantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float QuantidadeCombustivel) {
        this.QuantidadeCombustivel = QuantidadeCombustivel;
    }
    

    public float getValorPorLitro() {
        return ValorPorLitro;
    }

    public void setValorPorLitro(float ValorPorLitro) {
        this.ValorPorLitro = ValorPorLitro;
    }
    
    
}
