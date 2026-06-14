import java.util.Scanner;
public class ATIV2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = new int[15];
        int par = 0, impar = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um número: "+(i+1));
            vetor[i] = leia.nextInt();
            if (vetor[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
        leia.close();
    }
}