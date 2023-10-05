import java.util.ArrayList;
import java.util.Random;


public class EliminaMetade {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        Random random = new Random();

        listaNomes.add("Byanka"); // 1
        listaNomes.add("Bruno"); // 2
        listaNomes.add("Pedrinho"); // 3
        listaNomes.add("Jão"); // 4
        listaNomes.add("Julia Gabrielle");  // 5
        listaNomes.add("Júlia"); // 6
        listaNomes.add("Keven"); // 7
        listaNomes.add("Kethelyn"); // 8
        listaNomes.add("Aprigio"); // 9
        listaNomes.add("Manu"); // 10
        listaNomes.add("Rafa"); // 11
        listaNomes.add("Felipe"); // 12
        listaNomes.add("Beck"); // 13
        listaNomes.add("Prates"); // 14
        listaNomes.add("Alemão"); // 15
        listaNomes.add("Corsi"); // 16
        listaNomes.add("Torres"); // 17

        int tamLista = listaNomes.size();

        ArrayList<String> listNomesSort = new ArrayList<>();

       if (tamLista % 2 == 0){
           int metade = tamLista/2;
           System.out.println("A lista é par");

           for (int i = 0; i < metade ; i++){
                int index = random.nextInt(tamLista);
                String nomeSort = listaNomes.get(index);
                listNomesSort.add(nomeSort);
           }

           System.out.println(listNomesSort);
       }
       else{
           int metade = (tamLista/2) + 1;
           System.out.println(metade);
           System.out.println("A lista é ímpar");

           for(int i = 0; i < metade; i++){
               int index = random.nextInt(tamLista);
               String nomeSort = listaNomes.get(index);
               listaNomes.remove(nomeSort);
               listNomesSort.add(nomeSort);
           }

           System.out.println(listNomesSort);
       }

    }
}
