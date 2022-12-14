/*
 Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
total percorrida pelo automóvel e o total de combustível gasto;

 */
package exercicios;
import java.util.Scanner;
public class Exercicio03 {

    
    public static void main(String[] args) {
        double distancia, combustivel,consmedio;
      Scanner ler = new Scanner(System.in);  
      
        System.out.println("Insira a distância percorrida: ");
        distancia = ler.nextDouble();
        
        System.out.println("Insira o total do combustivel gasto: ");
        combustivel = ler.nextDouble();
        
        consmedio = distancia/combustivel;
        System.out.println("Consumo médio: " + consmedio);
    }
    
}
