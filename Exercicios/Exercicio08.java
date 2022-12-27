/*
Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares 
disponíveis com ousuário;
*/


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	float	ValorDolar = 0.0f, cotacao = 0.0f, conversao = 0.0f;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor em Dólar: ");
		ValorDolar = ler.nextFloat();
		
		System.out.println("Digite o valor da cotação do Dólar: ");
		cotacao= ler.nextFloat();
		
		conversao = ValorDolar*cotacao;
		
		System.out.println("VALOR EM REAL: " + conversao);
	}
}