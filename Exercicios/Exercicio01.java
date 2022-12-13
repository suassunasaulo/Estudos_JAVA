//Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

package exercicios;
import java.util.Scanner;

public class Exercicio01 {

    
    public static void main(String[] args) {
       int num1, num2, soma;
       Scanner ler = new Scanner(System.in);
        
        System.out.println("DIGITE UM NÚMERO");
        num1 = ler.nextInt();
        System.out.println("DIGITE UM NÚMERO");
         num2 = ler.nextInt();
         
         soma = num1+num2;
         
         System.out.println("SOMA:"+ soma);
        
    }
    
}
