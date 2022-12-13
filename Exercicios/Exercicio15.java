
package exercicios;
import java.util.Scanner;

//Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200 .

public class Exercicios {

    
    public static void main(String[] args) {
    
        int num;    
        Scanner ler = new Scanner(System.in); 
        
        System.out.println("DIGITE UM NÚMERO");
        num = ler.nextInt();
        
        if((num>=100) && (num<=200)){
            System.out.println("VERDADEIRO");
            
        
        }else{
            System.out.println("FALSO");
        }
        
    }
    
}
