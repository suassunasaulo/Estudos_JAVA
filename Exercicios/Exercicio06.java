/*
Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a 
possuir o valor da variável B e a variável B passe a possuir o valor da variável A.Apresentar os valores 
trocados;
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int variavelA=0, variavelB=0, variavelC=0;
		
	Scanner ler = new Scanner(System.in);
	
		System.out.println("Digite o valor de A: ");
		variavelA = ler.nextInt();
		
		System.out.println ("Digite o valor de B: ");	variavelB = ler.nextInt();
			
		
		variavelC = variavelA;
		variavelA= variavelB;
		variavelB= variavelC;
		
		System.out.println("Variável A: " + variavelA);
		System.out.println("Variável B: " + variavelB);
		
		
	}
}