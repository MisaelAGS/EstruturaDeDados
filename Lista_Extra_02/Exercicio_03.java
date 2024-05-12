package Lista_Extra_02;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [10];

        System.out.print("Digite o 1° elemento: ");
        vetor[0] = sc.nextInt();
        for (int i = 1; i < 10; i++){
            if (vetor[0] % 2 == 0){
                vetor[i] = i * 2 + vetor[0];
            }
            else{
                vetor[i] = i * 2 + vetor[0] - 1;
            }
        }

        System.out.println("O vetor é:");
        for(int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
