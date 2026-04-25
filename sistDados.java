import java.util.Random;
import java.util.Scanner;

public class sistDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] d6 = { 1, 2, 3, 4, 5, 6 };
        int[] d10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] d20 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        System.out.println("Sistema de dados");
        System.out.println("Selecione o número de acordo");
        System.out.println("(1) - D6");
        System.out.println("(2) - D10");
        System.out.println("(3) - D20");
        int esc = scanner.nextInt();

        System.out.print("Quantos dados?: ");
        int qnt = scanner.nextInt();
        int escolhaAlt, numEscolhido, total = 0;

        switch (esc) {
            case 1:
                for (int i = 0; i < qnt; i++) {
                    escolhaAlt = random.nextInt(d6.length);
                    numEscolhido = d6[escolhaAlt];

                    System.out.println("Dado " + (i + 1) + ": " + numEscolhido);

                    total += numEscolhido;
                }
                System.out.println("A soma total: " + total);
                break;

            case 2:
                for (int i = 0; i < qnt; i++) {
                    escolhaAlt = random.nextInt(d10.length);
                    numEscolhido = d10[escolhaAlt];

                    System.out.println("Dado " + (i + 1) + ": " + numEscolhido);

                    total += numEscolhido;
                }
                System.out.println("A soma total: " + total);
                break;

            case 3:
                for (int i = 0; i < qnt; i++) {
                    escolhaAlt = random.nextInt(d20.length);
                    numEscolhido = d20[escolhaAlt];

                    System.out.println("Dado " + (i + 1) + ": " + numEscolhido);

                    total += numEscolhido;
                }
                System.out.println("A soma total: " + total);
                break;

            default:
                System.out.println("ERRO!");
                break;
        }
        scanner.close();
    }
}