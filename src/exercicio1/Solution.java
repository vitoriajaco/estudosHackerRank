package exercicio1;


import java.util.*;


public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int  N = scanner.nextInt();

        while (true) {
            System.out.println("Digite um numero: ");
            if (N >= 1 && N <= 100) {

                if ((N % 2 == 0 && N >= 2 && N <= 5) || N > 20) {
                    System.out.println("Not Weird");
                } else if (N % 2 == 1 || (N % 2 == 0 && N >= 6 && N <= 20)) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Número fora do intervalo permitido (1 a 100).");
                    break;


                }
            }
        }
    }
}