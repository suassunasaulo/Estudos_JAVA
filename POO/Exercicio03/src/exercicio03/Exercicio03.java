/*Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarCombustivel; //altera o tipo do combustível.
d. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.

Crie uma classe que contenha um método main para testar sua classe BombaCombustível
 *
 */
package exercicio03;
import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        BombaCombustivel gasolinacomum = new BombaCombustivel(4.96f, 1000f);
        BombaCombustivel gasolinaaditivada = new BombaCombustivel(6.90f, 1000f);
        
        int opcaomenu=0, opcaocombustivel=0, opcaoabastecimento=0;
        Scanner ler = new Scanner(System.in);
        
        while(opcaomenu!=4){
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1-ABASTECER");
            System.out.println("2-ALTERAR VALOR DO LITRO DO COMBUSTÍVEL");
            System.out.println("3-ALTERAR QUANTIDADE DE COMBUSTIVEL DISPONÍVEL NA BOMBA");
            System.out.println("4-SAIR");
            
            System.out.println("DIGITE A OPÇÃO DESEJADA:");
            opcaomenu = ler.nextInt();
            
            switch(opcaomenu){
                
                case 1:
                    System.out.println("COMBUSTÍVEIS DISPONÍVEIS:");
                    System.out.println("1-GASOLINA COMUM // 2-GASOLINA ADITIVADA");
                    System.out.println("QUAL COMBUSTÍVEL DESEJA ABASTECER? ");
                    opcaocombustivel=ler.nextInt();
                    
                    if(opcaocombustivel == 1){
                        System.out.println("FORMAS DE ABASTECIMENTO: ");
                        System.out.println("1-POR VALOR // 2-POR LITRO");
                        System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                        opcaoabastecimento=ler.nextInt();
                        
                        switch(opcaoabastecimento){
                            case 1:
                             gasolinacomum.AbastecerPorValor(); 
                             break;
                            
                            case 2:
                             gasolinacomum.AbastecerPorLitro();
                             break;
                            default:
                             System.out.println("OPÇÃO INVÁLIDA");
                        }
                    }else 
                        if(opcaocombustivel == 2){
                        System.out.println("FORMAS DE ABASTECIMENTO: ");
                        System.out.println("1-POR VALOR // 2-POR LITRO");
                        System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                        opcaoabastecimento=ler.nextInt();
                        
                        switch(opcaoabastecimento){
                            case 1:
                             gasolinaaditivada.AbastecerPorValor(); 
                             break;
                            
                            case 2:
                             gasolinaaditivada.AbastecerPorLitro();
                             break;
                            default:
                             System.out.println("OPÇÃO INVÁLIDA");
                            }
                        }
                    break;
                    
                case 2:
                    System.out.println("QUAL O COMBUSTÍVEL VOCÊ DESEJA ALTERAR O VALOR? ");
                    System.out.println("1-GASOLINA COMUM // 2-GASOLINA ADITIVADA");
                    System.out.println("DIGITE A OPÇÃO: ");
                    opcaocombustivel=ler.nextInt();
                    
                    switch(opcaocombustivel){
                        
                        case 1:
                            gasolinacomum.AlterarValor();
                        break;
                        
                        case 2:
                            gasolinaaditivada.AlterarValor();
                            break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");    
                    }                   
                    
                    
                    break;                    
                    
                 case 3:
                    System.out.println("QUAL O COMBUSTÍVEL VOCÊ DESEJA ALTERAR A QUANTIDADE? ");
                    System.out.println("1-GASOLINA COMUM // 2-GASOLINA ADITIVADA");
                    System.out.println("DIGITE A OPÇÃO: ");
                    opcaocombustivel=ler.nextInt();
                    
                    switch(opcaocombustivel){
                        case 1:
                            gasolinacomum.AlterarQuantidadeCombustivel();
                    break;
                        case 2:
                            gasolinaaditivada.AlterarQuantidadeCombustivel();
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA");
                    }
                    break;
                 
            }          
            
        }                            
        
    }
    
}
