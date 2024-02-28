package Primeira_Lista_Exercicios;

import java.util.Scanner;
import java.util.Locale;
public class Exercicio01 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor_1 = new int[qtd_elementos];
        int [] vetor_2 = new int[qtd_elementos];
        double[] media_vetor = new double[qtd_elementos];
        System.out.println("Digite os elementos do primeiro vetor:");
        for(int i = 0; i < qtd_elementos; i++){
            vetor_1[i] = sc.nextInt();
        }
        System.out.println("Digite os elementos do segundo vetor:");
        for(int i = 0; i < qtd_elementos; i++){
            vetor_2[i] = sc.nextInt();
        }
        for(int i = 0; i < qtd_elementos; i++){
            media_vetor[i] = (double) (vetor_1[i] + vetor_2[i]) / 2;
        }
        System.out.print("Primeiro vetor: ");
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d ", vetor_1[i]);
        }
        System.out.println();
        System.out.print("Segundo vetor: ");
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d ", vetor_2[i]);
        }
        System.out.println();
        System.out.print("Média: ");
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%.1f ", media_vetor[i]);
        }
    }
}
