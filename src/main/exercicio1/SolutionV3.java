package main.exercicio1;

import java.util.Scanner;

public class SolutionV3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;


        while (continuar) {
            System.out.println("   Digite um numero: ");
            int numeroInteiro = scanner.nextInt();
            if (numeroInteiro >= 1 && numeroInteiro <= 100) {
                if (numeroInteiro % 2 == 0) {

                    if (numeroInteiro >= 2 && numeroInteiro <= 5) {
                        System.out.println("Not Weird");
                        continuar = false;

                    } else if (numeroInteiro >= 6 && numeroInteiro <= 20) {
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