package Primeira_Lista_Exercicios;

import java.util.Random;

public class Exercicio05b {
    public static void main(String[]args){
        int qtd_elementos = 100;
        int [] vetor = new int [qtd_elementos];
        int qtd_trocas = 0;
        Random numero_aleatorio = new Random();
        for(int i = 0; i < qtd_elementos; i++){
            vetor[i] = numero_aleatorio.nextInt(101);
        }
        for(int i = 0; i < qtd_elementos; i++){
            for(int j = 0; j < qtd_elementos - 1; j++){
                if(vetor[j] < vetor[j + 1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    qtd_trocas++;
                }
            }
        }
        for (int i = 0; i < qtd_elementos; i++) {
            System.out.printf("%d\n", vetor[i]);
        }
        System.out.printf("Quantidade de trocas: %d", qtd_trocas);
    }
}
