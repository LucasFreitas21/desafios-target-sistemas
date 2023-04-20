package desafio3;

public class Logica {
    public static void main(String[] args) {
        int a = 7;
        int ElementoA = a + 2;
        System.out.println("a) 1, 3, 5, 7, " + ElementoA);

        int b = 64;
        int ElementoB = b * 2;
        System.out.println("b) 2, 4, 8, 16, 32, 64, " + ElementoB);

        int c = 36;
        int ElementoC = c + (int) Math.sqrt(c) * 2 + 1;
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + ElementoC);

        int d = 64;
        int ElementoD = (int) Math.pow((int) Math.sqrt(d) + 2, 2); // 100
        System.out.println("d) 0, 1, 4, 9, 16, 25, 36, " + ElementoD);

        int e1 = 5;
        int e2 = 8;
        int ElementoE = e1 + e2;
        System.out.println("e) 0, 1, 4, 9, 16, 25, 36, " + ElementoE);

        //  F) Não foi possivel identificar a sequência. Apresenta ser números aleatórios.
        // 2,2,4,1,1,1...

    }
}
