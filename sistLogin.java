import java.util.Scanner;

public class sistLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] user = { "admin", "user1", "aluno", "usuario" };
        String[] senha = { "admin", "senha123", "aluno", "123" };

        boolean sit1 = false;
        boolean sit2 = false;

        System.out.println("Sistema de login");

        System.out.print("Digite seu username: ");
        String name = scanner.next();
        System.out.print("Digite sua senha: ");
        String pass = scanner.next();

        for (int i = 0; i < 4; i++) {
            if (name.equals(user[i])) {
                sit1 = true;
                break;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (pass.equals(senha[i])) {
                sit2 = true;
                break;
            }
        }

        if (sit1 == true && sit2 == true) {
            System.out.println("Acesso Liberado!");
        } else {
            System.out.println("Username ou Senha Inválidos!");
        }

        scanner.close();
    }
}
