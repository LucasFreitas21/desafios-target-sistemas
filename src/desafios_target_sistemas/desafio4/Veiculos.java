package desafio4;

public class Veiculos {
    public static void main(String[] args) {
        double distancia = 100.0; // km
        double velocidadeCarro = 110.0; // km/h
        double velocidadeCaminhao = 80.0; // km/h
        double tempoPedagio = 5.0; // minutos

// Converter tempo do pedágio de minutos para horas
        tempoPedagio /= 60;

// Calcular o tempo que os veículos levam para se encontrar
        double tempoEncontro = distancia / (velocidadeCarro + velocidadeCaminhao);

// Calcular a distância percorrida pelo caminhão nesse tempo
        double distanciaCaminhao = velocidadeCaminhao * (tempoEncontro + 2 * tempoPedagio);

// Calcular a distância percorrida pelo carro nesse tempo
        double distanciaCarro = velocidadeCarro * (tempoEncontro);

        if (distanciaCarro > distanciaCaminhao) {
            System.out.println("O caminhão estará mais próximo da cidade de Ribeirão Preto.");
        } else {
            System.out.println("O carro estará mais próximo da cidade de Ribeirão Preto.");
        }
    }
}


/*
EXPLICAÇÃO:
Para verificar quem estava mais proximo de Ribeirão Preto no encontro, calculei a distância percorrida por cada um dos veículos
levando em consideração o pedágio.
O veículo que percorrer uma distãncia menor, estará mais próximo de Ribeirão Preto.
*/