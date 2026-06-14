import java.util.Scanner;
public class ATIV3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        double media;

        int acimaMedia = 0;
        int abaixoMedia = 0;
        int igualMedia = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = leia.nextDouble();
            soma += notas[i];
        }
        media = soma / 5;
        for (int i = 0; i < 5; i++) {
            if (notas[i] > media) {
                System.out.println("Aluno " + (i + 1) + " tem nota acima da média: " + notas[i]);
                acimaMedia++;
            }else if (notas[i] < media) {
                System.out.println("Aluno " + (i + 1) + " tem nota abaixo da média: " + notas[i]);
                abaixoMedia++;
            } else {
                System.out.println("Aluno " + (i + 1) + " tem nota igual à média: " + notas[i]);
                igualMedia++;
            }
         }
         System.out.println("Média da turma: " + media);
         System.out.println("Quantidade de alunos acima da média: " + acimaMedia);
         System.out.println("Quantidade de alunos abaixo da média: " + abaixoMedia);
         System.out.println("Quantidade de alunos com nota igual à média: " + igualMedia);
        }
    }


