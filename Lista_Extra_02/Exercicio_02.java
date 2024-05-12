package Lista_Extra_02;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [10];

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite o %d° elemento: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        int aux;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 9; j++){
                if (vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado de forma crescente:");
        for(int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }

        sc.close();

    }
}
