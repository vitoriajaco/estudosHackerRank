package main.exercicio3;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Exercicio3 {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            /*int N = Integer.parseInt(bufferedReader.readLine().trim());*/
            int i = 0;
            int  N = scanner.nextInt();



            System.out.println("Digite um numero");
            for(i= 1; i <= 10; i++){
                int result = ( N * i);
                System.out.println(N + "*"+ i + "=" + result);


                bufferedReader.close();
        }
    }


}
