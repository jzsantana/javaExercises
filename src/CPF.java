import java.util.Scanner;

public class CPF {
    public static boolean isCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += (11 - i) * Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        int digito2 = 11 - (soma2 % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        if (cpf.charAt(9) - '0' != digito1 || cpf.charAt(10) - '0' != digito2) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String cpf;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um cpf para ver se é  verdadeiro: ");
        cpf = scan.next();
        System.out.println(isCPF(cpf));

    }
}