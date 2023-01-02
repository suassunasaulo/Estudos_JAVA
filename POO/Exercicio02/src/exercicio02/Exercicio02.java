/*
 Crie uma classe para implementar uma Conta Corrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package exercicio02;
import java.util.Scanner;

public class Exercicio02 {

    
    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        ContaCorrente titular = new ContaCorrente(123456789, "Saulo", 100.0f);
        
        titular.ImprimirDados();
        
        System.out.println("--------------------");
        while(opcao!=4){
            
            System.out.println("MENU DE OPÇÕES:");
            System.out.println("1-DEPOSITAR");
            System.out.println("2-SACAR");
            System.out.println("3-ALTERAR NOME DO TITULAR");
            System.out.println("4-ENCERRAR");
            
            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
            opcao = ler.nextInt();
            
            if(opcao == 1){
                titular.Depositar();
            } else
                if(opcao == 2){
                    titular.Sacar();
                } else
                    if(opcao == 3){
                      titular.AlterarNome();
                }
            
        }
        titular.ImprimirDados();
        
        
        
    }
    
}
