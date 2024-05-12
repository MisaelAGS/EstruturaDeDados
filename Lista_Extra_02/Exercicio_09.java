package Lista_Extra_02;

import java.util.Scanner;
import java.util.Random;

public class Exercicio_09 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int [][] matriz = new int[12][12];

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        int aux = 5;
        int soma = 0;
        int count = 0;

        for(int i = aux; i >  0; i--){
            for(int j = 0; j < aux; j++){
                soma += matriz[i][j];
                count++;
            }
            aux--;
        }
        aux = 5;
        for(int i = 6; i < 11; i++){
            for(int j = 0; j < aux; j++){
                soma += matriz[i][j];
                count++;
            }
            aux--;
        }

        while (true) {
            System.out.print("Digite S para soma ou M para média: ");
            String escolha = sc.next();
            if(escolha.equals("M")){
                double media = (double) soma/ count;
                System.out.printf("A média dos elementos é: %.2f%n", media);
                break;
            }
            else if(escolha.equals("S")){
                System.out.printf("A soma dos elementos é: %d%n", soma);
                break;
            }
            else{
                System.out.println("Digite uma das opções válidas.");
            }
        }

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
