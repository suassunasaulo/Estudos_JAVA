/*
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;
 * 
 * 
 */
package exercicios;
import java.util.Scanner;
public class Exercicio20 {

  
    public static void main(String[] args) {
        
        float ValorVeiculo = 0.0f, ValorDesconto = 0.0f, ValorFinal = 0.0f;
        int AnoVeiculo = 0, TotalVeiculos = 0, TotalVeiculosSemiNovos = 0;
        char desejarepetir = 's';
        
       Scanner ler = new Scanner(System.in);
       
        System.out.println("CARANGO VELHO");
        
        while(desejarepetir == 's' || desejarepetir == 'S'){
            
            System.out.println("DIGITE O ANO DO VEÍCULO: ");
            AnoVeiculo = ler.nextInt();
            
            System.out.println("DIGITE O VALOR DO VEÍCULO: ");
            ValorVeiculo = ler.nextFloat();
            
            if(AnoVeiculo<=2000){
                //12% de desconto
               ValorDesconto =  0.12f * ValorVeiculo;
               ValorFinal = ValorVeiculo - ValorDesconto;
               
                System.out.println("VALOR DO DESCONTO: " + ValorDesconto);
                System.out.println("VALOR FINAL: " + ValorFinal);
                
                TotalVeiculosSemiNovos++;
            }
            else{
                //7% de desconto
                 ValorDesconto =  0.07f * ValorVeiculo;
                 ValorFinal = ValorVeiculo - ValorDesconto;
                 
                 System.out.println("VALOR DO DESCONTO: " + ValorDesconto);
                 System.out.println("VALOR FINAL: " + ValorFinal);
            }
             TotalVeiculos++;
             
            System.out.println("DESEJA REPETIR?   S-SIM e N-NÃO");
            desejarepetir = ler.next().charAt(0);     
            
        } 
            System.out.println("TOTAL DE VEÍCULOS CADASTRADOS: " + TotalVeiculos);
            System.out.println("TOTAL DE VEÍCULOS ATÉ 2000: " + TotalVeiculosSemiNovos);
    }
    
}
