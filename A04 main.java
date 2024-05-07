import java.util.Scanner;

public class Main { 
    public static void main(String[] args ) {
        Scanner leia = new  Scanner(System.in);
        int media = 0 ;
        int nota1 = 0 ;
        int nota2 = 0 ;
        int nota3 = 0 ;
        
         System.out.println("escreva a primeira nota:");
       int prova1 = leia.nextInt();
       
        System.out.println("escreva a segunda nota:");
       int prova2 = leia.nextInt();
       
       System.out.println("escreva a terceira nota:");
       int prova3 = leia.nextInt();
       
       media = (nota1 + nota2 + nota3)/ 3;
       System.out.println("a media das notas é: " + media);
       
       if (media >= 7) {
       
       System.out.println("Aluno aprovado!");
      
    }
    else { 
         System.out.println("Aluno reprovado");
        
    }
    }
}