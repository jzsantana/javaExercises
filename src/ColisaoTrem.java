import java.util.InputMismatchException;
import java.util.Scanner;
public class ColisaoTrem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "yes";
        double posA = -1, posB = -1;
        double velA = -1, velB = 1;
        // velA sempre positiva
        // velB sempre negativa
        // maximo 300km

        while(a.equalsIgnoreCase("yes")){
            try{
                while (posA <= 0 || posA >= 10000) {
                    System.out.println("Insira a posição do Trem A: ");
                    posA = scan.nextDouble();
                }
                while (velA < 0 || velA > 300) {
                    System.out.println("Agora, insira a velocidade do Trem A: ");
                    velA = scan.nextDouble();
                }
                while (posB < 0 || posB >= 10000) {
                    System.out.println("Insira a posição do Trem B: ");
                    posB = scan.nextDouble();
                }

                while (velB > 0 || velB < 300) {
                    System.out.println("Agora, insira a velocidade do Trem B: ");
                    velB = scan.nextDouble();
                }

                double tempo = (posA - posB) / (velB - velA);
                double posicaoFinal = posB + velB * tempo;

                int tempoFinal;
                tempoFinal = (int) tempo * 3600;
                tempoFinal = tempoFinal * (-1);

                if (tempoFinal != 0){
                    System.out.println("Colidiu aqui: " + posicaoFinal);
                    System.out.println("No tempo: " + tempoFinal);
                }else{

                }

            }catch(InputMismatchException e){
                System.out.println("Digite novamente!");
            }

            System.out.println("Deseja calcular novamente?");
            a = scan.nextLine();
        }
    }
}
