package exercicio1;

import java.util.Scanner;

public class SolutionV2 {
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            while (true) {
                System.out.println("   Digite um numero: ");
                int N = scanner.nextInt();
                if (N >= 1 && N <= 100) {

                    if (N % 2 == 0 && N >= 2 && N <= 5) {
                        System.out.println("Not Weird");
                        System.out.println("___________________");
                        System.out.println("Programa finalizado");
                        break;
                    } else if ((N % 2 == 0 && N >= 6 && N <= 20) || (N % 2 == 1)) {
                        System.out.println("Weird");
                        System.out.println("___________________");
                        System.out.println("Programa finalizado");
                        break;
                    } else {
                        System.out.println("Not Weird");
                        break;

                    }
                }
                System.out.println("Numero fora do intervalo de 0 a 100, Jogue Novamente!");
            }
        }
}




