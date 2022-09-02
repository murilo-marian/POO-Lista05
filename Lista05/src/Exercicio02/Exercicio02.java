package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 2;
        float caro = 0; float barato = 0;
        float[][] tabela = new float[comp][comp];
        float[] media = new float[comp];
        float[] soma = new float[comp];

        for (int i = 0; i < comp; i++) {
            for (int j = 0; j < comp; j++) {
                System.out.println("Digite o preço do produto " + i + " no super-mercado " + j + ": ");
                tabela[i][j] = entrada.nextFloat();
                media[i] += tabela[i][j];
                soma[j] += tabela[i][j];
            }
        }
        barato = soma[0];

        for (int i = 0; i < comp; i++) {
            if (soma[i] > caro) {
                caro = soma[i];
            } else if (soma[i] < barato) {
                barato = soma[i];
            }
            System.out.println(media[i]/comp);
            System.out.println(soma[i]);
        }
        System.out.println("Caro: " + caro);
        System.out.println("Barato: " + barato);

    }
}
