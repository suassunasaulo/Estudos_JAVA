/*
Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de 

conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		float temperatura = 0.0f;
		float conversao = 0.0f;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Graus Celsius");
		temperatura = ler.nextFloat();
		
		conversao = (9*temperatura+160)/5;
		
		System.out.println("A temperatura em Fahrenheit é: " + conversao);
	}
}