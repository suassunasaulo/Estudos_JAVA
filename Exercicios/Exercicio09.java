/*
Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês.Considere fixo o juro da poupança em 0,07% a. m
 */
package exercicios;

import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        double ValorDepositado, rendimento;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor a ser depositado: ");
        ValorDepositado = ler.nextFloat();
        
        rendimento = ValorDepositado * 0.07 /100 + ValorDepositado;
        
        System.out.println("RENDIMENTO APÓS UM MÊS: " + rendimento);
    }
    
}
