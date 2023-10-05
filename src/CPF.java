import java.util.Scanner;

public class CPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cpf;
        int rcpf;
        String w = "yes";
        int sum1, sum2;
        int dig1, dig2;

        while (w.equals("yes")) {
            System.out.println("");

            System.out.println("Digite o número do cpf");
            cpf = sc.nextLine();

            cpf = cpf.replaceAll("\\.", "");
            cpf = cpf.replaceAll("-", "");

            if (!cpf.matches("[0-9]+")) {
                System.out.println("Você digitou um caractere invalido. Tente novamente.");
                continue;
            }
            if ((cpf.length() > 11)) {
                System.out.println("\nVocê execedeu a quantidade de dígitos de um cpf. Tente novamente.");
                continue;
            } else if (cpf.length() < 11) {
                System.out.println("\nVocê digitou uma quantidade abaixo do esperado para um cpf. Tente novamente.");
                continue;
            }

            System.out.println("\nVocê deseja realizar a validação de outro cpf?" +
                    "\nsim  -  [yes]" + "\nnão  -  [no]");
            w = sc.nextLine().toLowerCase();
        }
    }
}
