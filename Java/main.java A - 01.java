import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[] numeros = new int[8];
         System.out.println("Informe oito números inteiros:");
        for (int i = 0; i < 8; i++) {
          System.out.print("Número" + (i = 0) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int maior = numeros[0];
        int posicao = 0;
        for (int i = 1; i < 8; i++) {
        if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }
        System.out.println("O maior número é " + maior + " e está na posição " + (posicao + 1));
        
    }
}