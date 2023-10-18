import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioTrem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double posA, posB, velA, velB, tempoCalculado;
        double time;
        String w = "yes";
        double posA = -1, posB = -1;
        double velA = -1, velB = 1;

        while (w.equals("yes")) {

            try {
                while (posA <= 0 || posA >= 10000) {
                    System.out.println("Insira a posição do Trem A: ");
                    posA = scanner.nextDouble();
                }
                while (velA < 0 || velA > 300) {
                    System.out.println("Agora, insira a velocidade do Trem A: ");
                    velA = scanner.nextDouble();
                }
                while (posB < 0 || posB >= 10000) {
                    System.out.println("Insira a posição do Trem B: ");
                    posB = scanner.nextDouble();
                }

                while (velB < 0 || velB > 300) {
                    System.out.println("Agora, insira a velocidade do Trem B: ");
                    velB = scanner.nextDouble();
                }

                double time = ((posA - posB) / (velB - velA));
                double finalPositionA =

            } catch (InputMismatchException e) {
                System.out.println("Você digitou errado");
            }

            System.out.println("Digite a posição inicial do trem A: ");
            double posicaoA = scanner.nextDouble();
            System.out.println("Digite a posição inicial do trem B: ");
            double posicaoB = scanner.nextDouble();

            if (posA < 0 || posA > 10000) {
                System.out.println("\nA posição do Trem A é inválida");
                System.out.println("Digite a posição do Trem A novamente: \n");
                posA = scanner.nextDouble();
            }
            if (posB < 0 || posB > 10000) {
                System.out.println("\nA posição do Trem B é inválida");
                System.out.println("Digite a posição do Trem B novamente: \n");
                posB = scanner.nextDouble();
            }

            System.out.println("Digite a velocidade do trem A: ");
            double velA = scanner.nextDouble();
            System.out.println("Digite a velocidade do trem B: ");
            double velB = scanner.nextDouble();

            if (velA > 300) {
                System.out.println("A velocidade do Trem A é inválida");
                System.out.println("Digite a velocidade novamente: ");
                velA = scanner.nextDouble();
            }

            if (velB > 0) {
                System.out.println("A velocidade do Trem B é inválida");
                System.out.println("Digite a velocidade novamente: ");
                velB = scanner.nextDouble();
            }

            double tempo = ((posA - posB) / (velB - velA));
            System.out.println("O tempo é: " + tempo);
        }
           }catch(InputMismatchException e){
               System.out.println("Voce digitou errado");
           }

           System.out.println("Deseja fazer o cálculo novamente? [s/n]");
           String opcao = scanner.nextLine();
           if (opcao.equals("s")){
               continue;
           }else{
               break;
           }
        }
    }
}