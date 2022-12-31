
package exercicio01;

import java.time.LocalDate;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private String DataNascimento;
    private double altura;
   
   
    
    public void ImprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + DataNascimento);
        System.out.println("Altura: "  +  altura);
    }
    
    public void CalcularIdade(){
        
        Calendar calendario = Calendar.getInstance();
        int anoDataAtual = calendario.get(Calendar.YEAR);
        
        String partesDataNascimento[] = DataNascimento.split ("/");
        int anoNascimento = Integer.parseInt(partesDataNascimento[2]);
      
        int anos = anoDataAtual - anoNascimento;
        System.out.println("A pessoa tem " + anos + " anos.");
    }
     

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     
    
}
