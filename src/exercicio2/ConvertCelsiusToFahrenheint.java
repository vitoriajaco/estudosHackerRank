package exercicio2;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char resp = 's';

        while (resp != 'n') {
            System.out.print("Digite a temperatura em Celsius: ");

            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Esta temperatura " + C + "°C em Fahrentheint é de: %.1f%n", F); // %.1f%n corresponde a um valor de ponto flutuante. Sera inserido um valor com 1 casa decimal
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0); //O charAt(0) serve para pegar o primeiro caracter da palavra pois corresponde ao index




        }

        sc.close();
    }
}
