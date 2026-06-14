import java.util.Scanner;
public class ATIV {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

    int[] vetor = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: "+(i+1));
            vetor[i] = leia.nextInt();
            soma += vetor[i];
        }
        double media = (double) soma / 10;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        leia.close();
    }
}