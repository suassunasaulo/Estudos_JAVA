/*
 Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo
de cada produto, o valor 
de venda de cada produto, a média de preço de custo e do preço de venda.
 */
package exercicios;
import java.util.Scanner;

public class Exercicio22 {

       public static void main(String[] args) {
      String nomeproduto;
      double pcusto, pvenda;
      double mediacusto = 0, mediavenda = 0;
      double totalcusto=0, totalvenda=0;
        Scanner ler = new Scanner(System.in);   
          int i = 0;
          for(; i <40; i++){
              System.out.println("DIGITE O NOME DO PRODUTO");
             nomeproduto = ler.next();
              System.out.println("DIGITE O PREÇO DE CUSTO");
              pcusto = ler.nextDouble();
              System.out.println("DIGITE O PREÇO DE VENDA");
              pvenda = ler.nextDouble();
              
              totalcusto = totalcusto + pcusto;
              totalvenda = totalvenda + pvenda;
              
              if(pvenda>pcusto){
                  System.out.println("O PRODUTO TEVE LUCRO");
              }else
                  if(pvenda<pcusto){
                      System.out.println("O PRODUTO TEVE PREJUÍZO");
                  }else{
                      System.out.println("O PRODUTO TEVE EMPATE");
                  }
              
              System.out.println("PRODUTO: " + nomeproduto);
              System.out.println("PREÇO DE CUSTO: " + pcusto);
              System.out.println("PREÇO DE VENDA: " + pvenda);                           
              System.out.println("---------------------------");
              
          }
           System.out.println("----------------------------");
           System.out.println("----------------------------");
           mediacusto = totalcusto / i;
           mediavenda = totalvenda / i;
           
          System.out.println("media geral de custos: " + mediacusto);
          System.out.println("media geral de vendas: " + mediavenda);
    }
    
}
