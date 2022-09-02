package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int alunos = entrada.nextInt();
        String[] nomes = new String[alunos];

        float[][] notas = new float[alunos][2];
        float[] media = new float[alunos];
        float mediaGeral = 0;
        float menor = 0; int piorAluno = 0;
        float maior = 0; int melhorAluno = 0;
        float menorMedia = 0;
        float maiorMedia = 0;

        for (int i = 0; i < alunos; i++) {
            entrada.nextLine();
            System.out.print("Nome: ");
            nomes[i] = entrada.nextLine();
            for (int j = 0; j < 2; j++) {
                System.out.print("Nota " + j + ": ");
                notas[i][j] = entrada.nextFloat();
                media[i] += notas[i][j];
                if (i == 0) {
                    maior = notas[i][j];
                    menor = notas[i][j];
                    piorAluno = i;
                    melhorAluno = i;
                } else {
                    if (notas[i][j] > maior) {
                        maior = notas[i][j];
                        melhorAluno = i;
                    } else if (notas[i][j] < menor) {
                        menor = notas[i][j];
                        piorAluno = i;
                    }
                }
            }
        }

        for (int i = 0; i < alunos; i++) {
            media[i] = media[i] / 2;
            if (i == 0) {
                maiorMedia = media[i];
                menorMedia = media[i];
            } else {
                if (media[i] > maiorMedia) {
                    maiorMedia = media[i];
                } else if (media[i] < menorMedia) {
                    menorMedia = media[i];
                }
            }
            mediaGeral += media[i];
        }
        mediaGeral = mediaGeral / alunos;

        System.out.println("Media Geral: " + mediaGeral);
        for (int i = 0; i < alunos; i++) {
            System.out.println("Media do aluno " + nomes[i] + ": " + media[i]);
        }

        for (int i = 0; i < alunos; i++) {
            if (media[i] < mediaGeral) {
                System.out.println(nomes[i]);
            }
        }

        for (int i = 0; i < alunos; i++) {
            if (media[i] == maiorMedia) {
                System.out.println("Aluno " + nomes[i] + " tirou a maior media: " + maiorMedia);
            } else if (media[i] == menorMedia) {
                System.out.println("Aluno " + nomes[i] + " tirou a menor media: " + menorMedia);
            }
        }
        System.out.println("Aluno " + nomes[piorAluno] + " tirou a pior nota: " + menor);
        System.out.println("Aluno " + nomes[melhorAluno] + " tirou a melhor nota: " + maior);
    }
}
