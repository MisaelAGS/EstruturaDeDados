package Lista_Extra_02;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[100];

        for(int i = 0; i < 100; i++){
            System.out.printf("Digite o %d° elemento: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Posições dos valores entre 10 e 30:");
        for(int i = 0; i < 100; i++){
            if(vetor[i] > 10 && vetor[i] < 30){
                System.out.printf("Posição: %d - Valor: %d\n", i, vetor[i]);
            }
        }

        sc.close();
    }
}
