import java.util.Random;
import java.util.Scanner;

public class ppt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean cnt = true;

        System.out.println("Pedra, Papel ou Tesoura!");

        while (cnt) {

            int sorteioPC = random.nextInt(3);

            System.out.println("Digite: \n (0) = Pedra \n (1) = Tesoura \n (2) Papel");
            System.out.println("==============================");
            System.out.print("Qual: ");
            int sorteioHum = scanner.nextInt();
            String result;

            if (sorteioPC == 0) {
                result = "Pedra";
            } else if (sorteioPC == 1) {
                result = "Tesoura";
            } else {
                result = "Papel";
            }

            if (sorteioHum == 0 || sorteioHum == 1 || sorteioHum == 2) {

                if (sorteioHum == sorteioPC) {
                    System.out.println("EMPATE! O Computador tambem escolheu: " + result);
                    System.out.println("==============================");
                } else if ((sorteioHum == 1 && sorteioPC == 2) ||
                           (sorteioHum == 0 && sorteioPC == 1) ||
                           (sorteioHum == 2 && sorteioPC == 0)) {
                    System.out.println("Você ganhou! O Computador escolheu: " + result);
                    System.out.println("==============================");
                } else {
                    System.out.println("Você perdeu! O Computador escolheu: " + result);
                    System.out.println("==============================");
                }
            } else {
                System.out.println("ERRO!");
            }

            System.out.println("Quer tentar outra vez? (s/n)");
            String rep = scanner.next();

            if (rep.equals("s") || rep.equals("S")) {
                System.out.println("\nVamos Novamente!");
                cnt = true;
            } else {
                cnt = false;
                System.out.println("Obrigado!");
            }
        }
        scanner.close();
    }
}
