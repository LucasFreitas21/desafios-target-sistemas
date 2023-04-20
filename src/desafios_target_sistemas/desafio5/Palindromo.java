package desafio5;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um texto: ");
        String texto = scan.nextLine();

        char[] caracteres = texto.toCharArray();
        char[] invertido = new char[caracteres.length];

        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertido[caracteres.length - i - 1] = caracteres[i];
        }

        String resultado = new String(invertido);
        System.out.println("Texto invertido: " + resultado);
    }

}

