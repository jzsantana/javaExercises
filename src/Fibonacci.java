import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int fibonacci [] = new int[20];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println(Arrays.toString(fibonacci));
    }

}