/*
 Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
 */
package exercicios;
import java.util.Scanner;

public class Exercicio04 {

   
    public static void main(String[] args) {
      String vendedor;
      double salariofixo, vendasmes, percentual, salariofinal;
      Scanner ler = new Scanner(System.in); 
      
        System.out.println("Nome do vendedor: ");
        vendedor = ler.next();
        
        System.out.println("Qual o salário fixo do " + vendedor + "?");
        salariofixo = ler.nextDouble();
        
        System.out.println("Qual o valor total em dinheiro das vendas efetuadas pelo " + vendedor  +  " esse mês? ");
        vendasmes = ler.nextDouble();
        
        percentual = 15.0/100;
        salariofinal = salariofixo + (percentual*vendasmes);
        
        System.out.println("VENDEDOR: "  + vendedor  +  " SALÁRIO FIXO: "  + salariofixo  +  " SALÁRIO FINAL: "  + salariofinal);
    }
    
}
