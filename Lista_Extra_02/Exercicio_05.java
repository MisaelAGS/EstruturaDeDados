package Lista_Extra_02;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[20];

        for(int i = 0; i < 20; i++){
            System.out.printf("Digite o %d° elemento: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Vetor digitado na ordem inversa:");
        for(int i = 19; i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
}
