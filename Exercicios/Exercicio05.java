/*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 

No final informar o nome do aluno e a sua média (aritmética);

*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String nome;
		double nota1=0, nota2=0, nota3=0, media=0;		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		nome = ler.next( );
		
		System.out.println("Digite a primeira nota: ");
		nota1= ler.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2= ler.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3= ler.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println(nome  +  " sua média é: " +  media);
		
	}
}