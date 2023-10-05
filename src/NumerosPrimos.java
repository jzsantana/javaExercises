import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        String m = "sim";
        ArrayList<Integer> notPrimos = new ArrayList();
        ArrayList<Integer> listaPrimos = new ArrayList();

        while (m.equalsIgnoreCase("sim")) {
            listaPrimos.clear();
            notPrimos.clear();
            System.out.println("Digite o número: ");
            num = sc.nextInt();
            boolean n = Primo(num);

            if (num < 0 || num > 10000) {
                System.out.println("Você digitou um número inválido. Por favor, tente novamente. ");
                continue;
            }

            if (n == true) {
                System.out.println("O número " + num + " é primo!");
            } else {
                System.out.println("O número " + num + " não é primo!");
            }

            for (int i = 0; i <= num; i++) {
                if (Primo(i)) {
                    listaPrimos.add(i);
                } else {
                    notPrimos.add(i);
                }
            }

            System.out.println("+" + "-".repeat(43) +"+" + "\n" +
                    "| Ver lista de números primos      -  [ 1 ] |\n" +
                    "| Ver lista de números não primos  -  [ 2 ] |\n"+
                    "| Não ver lista                    -  [ 3 ] |");
            System.out.println("+" + "-".repeat(43) +"+" + "\n");

            int menu;
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Lista de números primos: " + listaPrimos);
                    break;

                case 2:
                    System.out.println("Lista de números não primos:" + notPrimos);
                    break;
                case 3:
                    break;
            }

            System.out.println("Deseja certificar se outro número é ou não primo?: ");
            m = sc.next();
        }
    }


    //    o j vai percorrer até o numero anterior ao numero digitado, ou seja, não vai incluir o propio número
    private static boolean Primo(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}