package desafio2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        int a = 0;
        int b = 1;

        while (b < numero) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        if (b == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scan.close();

    }
}
