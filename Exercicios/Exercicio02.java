//Faça um algoritmo que receba dois números inteiros e ao final mostre a soma, subtração, multiplicação e a divisão 
//dos dois números lidos.

package exercicios;
import java.util.Scanner;
public class Exercicio02 {


    public static void main(String[] args) {
        int num1, num2;
        double soma, subtracao, multiplicacao, divisao;
        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE UM NÚMERO");
        num1 = ler.nextInt();
        System.out.println("DIGITE UM NÚMERO");
        num2 = ler.nextInt();

        soma = num1 + num2;
        subtracao = num1-num2;
        multiplicacao = num1*num2;
        divisao = num1/num2;
        

        System.out.println("SOMA:" + soma);
        System.out.println("SUBTRAÇÃO:" + subtracao);
        System.out.println("MULTIPLICAÇÃO:" + multiplicacao);
        System.out.println("DIVISÃO:" + divisao);
    }
    
}
