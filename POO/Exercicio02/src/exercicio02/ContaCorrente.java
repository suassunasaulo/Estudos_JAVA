
package exercicio02;
import java.util.Scanner;
public class ContaCorrente {
    
   private int NumeroDaConta;
   private String NomeDoCorrentista, NovoNome;
   private float Saldo, Deposito, Saque;
   Scanner ler = new Scanner(System.in);
    public ContaCorrente(int NumeroDaConta, String NomeDoCorrentista, float Saldo) {
        this.NumeroDaConta = NumeroDaConta;
        this.NomeDoCorrentista = NomeDoCorrentista;
        this.Saldo = Saldo;
    }
   
   
    public void ImprimirDados() {
        System.out.println("Nome do titular: " + NomeDoCorrentista);
        System.out.println("Número da conta " + NumeroDaConta);
        System.out.println("Saldo: " + Saldo);
    }
   public String AlterarNome(){
       System.out.println("Digite o nome para qual deseja alterar: ");
       NovoNome = ler.next();
        this.NomeDoCorrentista = NovoNome;
       
       return NomeDoCorrentista;
   }
   
   public float Depositar(){
       System.out.println("Qual a quantia que deseja depositar?");
       Deposito = ler.nextFloat();
       
       Saldo = Saldo + Deposito;
       
       System.out.println("SALDO ATUAL: " + Saldo);
       return Saldo;
   }
   
   public float Sacar(){
       System.out.println("Qual o valor que deseja sacar?");
       Saque = ler.nextFloat();
       
       Saldo = Saldo - Saque;
       
       System.out.println("SALDO ATUAL: " + Saldo);
       return Saldo;
   }

    public int getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void setNumeroDaConta(int NumeroDaConta) {
        this.NumeroDaConta = NumeroDaConta;
    }

    public String getNomeDoCorrentista() {
        return NomeDoCorrentista;
    }

    public void setNomeDoCorrentista(String NomeDoCorrentista) {
        this.NomeDoCorrentista = NomeDoCorrentista;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
   
   
   
   
   
}
