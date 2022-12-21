
// Exercício desenvolvido por meio de POO.

package classes0;
import java.util.Scanner;

public class Classes0 {

    public static void main(String[] args) {

        Pessoas pessoa1 = new Pessoas();        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        pessoa1.setPeso(ler.nextFloat());
        System.out.println("Digite sua altura: ");
        pessoa1.setAltura(ler.nextFloat());
        
        System.out.println("SEU IMC É: " + pessoa1.calcularIMC());
    }
    
}
