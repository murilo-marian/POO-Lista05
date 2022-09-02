package Exercicio01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanho;
        int soma = 0;
        float media;
        int maior = 0;
        int menor = 0;
        int pares = 0; int impares = 0;
        int principal = 0; int secundaria = 0;

        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(3);
        df.setMaximumFractionDigits(3);

        do {
            System.out.print("Digite o tamanho do vetor (ímpar entre 3 e 11): ");
            tamanho = entrada.nextInt();
        } while (tamanho % 2 == 0 || tamanho < 3 || tamanho > 11);

        int[][] valores = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                valores[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                soma += valores[i][j];
                if (i == 0 && j == 0) {
                    maior = soma;
                    menor = soma;
                } else {
                    if (valores[i][j] > maior) {
                        maior = valores[i][j];
                    } else if (valores[i][j] < menor) {
                        menor = valores[i][j];
                    }
                }
                if (valores[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                if (i == j) {
                    principal += valores[i][j];
                }
                if (i + j == tamanho-1) {
                    System.out.println(valores[i][j]);
                    secundaria += valores[i][j];
                }
            }
        }
        df.format(media = (float) soma/tamanho*tamanho);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Soma Principal: " + principal);
        System.out.println("Soma Secundária: " + secundaria);

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println(System.lineSeparator());
        }

    }
}
