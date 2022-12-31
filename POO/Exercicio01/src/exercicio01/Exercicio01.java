/*
 Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir 
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa. 
 */
package exercicio01;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01 {


    public static void main(String[] args) {
        Pessoa humano = new Pessoa();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        humano.setNome(ler.next());
        
        System.out.println("Digite sua data de nascimento: ");
        humano.setDataNascimento(ler.next());
        
        System.out.println("Digite sua altura: ");
        humano.setAltura(ler.nextDouble());
        
        humano.ImprimirDados();
        humano.CalcularIdade();
        
       
        
        
        
       
    }
    
}
