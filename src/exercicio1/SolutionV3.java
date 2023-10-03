package exercicio1;

import java.util.Scanner;

public class SolutionV3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("   Digite um numero: ");
            int N = scanner.nextInt();
            if (N >= 1 && N <= 100) {
                if (N % 2 == 0) {

                    if (N >= 2 && N <= 5) {
                        System.out.println("Not Weird");
                        continuar = false;

                    } else if (N >= 6 && N <= 20) {
                        System.out.println("Weird");
                        continuar = false;

                    } else {
                        System.out.println("Not Weird");
                        continuar = false;
                    }

                } else {
                    System.out.println("Not Weird");

                }
                break;
            }

            System.out.println("Numero fora do intervalo de 1 a 100, Jogue Novamente!");
        }
    }
}