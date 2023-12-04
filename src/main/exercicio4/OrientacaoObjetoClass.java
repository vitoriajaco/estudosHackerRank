package main.exercicio4;

//* Deseja-se fazer um programa que leia uma quantidade N, e depois N números
//inteiros. Ao final, imprima esses números de forma organizada conforme
//exemplo. Em seguida, informar qual foi o primeiro valor informado.


import java.util.Scanner;

public class OrientacaoObjetoClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> printService = new PrintService();

        System.out.println("Quantos valores deseja receber? ");
        int n = sc.nextInt();

        System.out.println("Digite os valores ");

        for (int i = 0;i < n ; i++) {
            String valor = sc.next();
            printService.addValue(valor);
        }

        printService.print();
        String x = printService.first();
        System.out.println("O primeiro valor foi: " + x);




    }



}


