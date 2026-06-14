import java.util.Scanner;
public class ATIV4 {
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int[] numeros = new int[8];
    int maior, menor;
    int posMaior = 0, posMenor = 0;
    for (int i = 0; i < 8; i++) {
        System.out.println("Digite um número: "+(i+1));
        numeros[i] = leia.nextInt();
        
       }
       maior = numeros[0];
       menor = numeros[0];
       for (int i = 1; i < 8; i++) {
           if (numeros[i] > maior) {
               maior = numeros[i];
               posMaior = i;
           }
           if (numeros[i] < menor) {
               menor = numeros[i];
               posMenor = i;
           }
       }
       System.out.println("Maior número: " + maior + " na posição " + (posMaior + 1));
       System.out.println("Menor número: " + menor + " na posição " + (posMenor + 1));
       leia.close();
    }
  }
