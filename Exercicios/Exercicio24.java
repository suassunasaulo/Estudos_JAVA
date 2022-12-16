/*
  Faça um algoritmo que receba “N” números e mostre positivo, negativo ou
zero para cada número e pergunte ao usuário
se ele deseja testar o número novamente.
 */
package exercicios;
import java.util.Scanner;

public class Exercicio24 {

    
    public static void main(String[] args) {
      int numero; 
      int menu = 0;
        Scanner ler = new Scanner (System.in);   
        
         while(menu!=2){
              
              
              System.out.println("DIGITE UM NÚMERO: ");
              numero = ler.nextInt();
              
              if(numero>0){
                  System.out.println("NÚMERO POSITIVO");
              } else if (numero==0){
                  System.out.println("NÚMERO IGUAL A 0");
              } else if(numero<0){
                  System.out.println("NÚMERO NEGATIVO");
              }
              
           
              System.out.println("Deseja testar novamente?");
              System.out.println("1-SIM e 2-NÃO");
              menu = ler.nextInt();
              
              
             }        
        }
    }
