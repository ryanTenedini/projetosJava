import java.util.Scanner;
import java.lang.Math;

public class calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");
        boolean rep = true;
        while (rep) {

            System.out.println("Escolha uma operação:");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO ");
            System.out.println("5 - POTÊNCIA");
            System.out.println("6 - RAIZ QUADRADA");
            System.out.println("7 - BHASKARA");
            double a, b, c, exp, bs;

            System.out.print("Digite o número correspondente: ");
            int op = scanner.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Digite o primeiro número: ");
                    a = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("O resultado é: " + (a + b));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    a = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("O resultado é: " + (a - b));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    a = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("O resultado é: " + (a * b));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    a = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = scanner.nextInt();
                    if (b != 0) {
                        System.out.println("O resultado é: " + (a / b));
                    } else {
                        System.out.println("ERRO! Multiplicação por 0!");
                    }
                    
                    break;

                case 5:
                    System.out.print("Digite a base: ");
                    bs = scanner.nextInt();
                    System.out.print("Digite o expoente: ");
                    exp = scanner.nextInt();
                    System.out.println("O resultado é: " + (Math.pow(bs, exp)));
                    break;

                case 6:
                    System.out.print("Digite a base: ");
                    bs = scanner.nextInt();
                    System.out.println("O resultado é: " + (Math.sqrt(bs)));
                    break;

                case 7:
                    System.out.println("Calculadora de Bhaskara");
                    System.out.print("Digite o a: ");
                    a = scanner.nextDouble();
                    System.out.print("Digite o b: ");
                    b = scanner.nextDouble();
                    System.out.print("Digite o c: ");
                    c = scanner.nextDouble();

                    double delta = Math.pow(b, 2) - 4 * a * c;

                    if (delta < 0) {
                        System.out.println("Delta é igual a zero, não possui raizes reais");
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        
                        System.out.println("Delta da equação: " + delta);
                        System.out.println("X1 da equação: " + x1);
                        System.out.println("X2 da equação: " + x2);
                    }
                    break;

                default:
                    System.out.println("ERRO!");
                    break;
            }

            System.out.println("Deseja repetir? (s/n)");
            String sn = scanner.next();

            if (sn.equals("s") || sn.equals("S")) {
                rep = true;
            } else {
                rep = false;
                System.out.println("Obrigado!");
            }

        }
        scanner.close();
    }

}