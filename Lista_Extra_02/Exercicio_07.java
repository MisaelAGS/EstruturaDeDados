package Lista_Extra_02;

import java.util.Scanner;
import java.util.Random;

public class Exercicio_07{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int [][] matriz = new int[10][20];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                //System.out.printf("Digite o %dº elemento da %dº linha: ", j + 1, i + 1);
                matriz[i][j] = random.nextInt(1000);
            }
        }

        int aux;

        for(int linha = 0; linha < 10; linha++){
            for(int coluna = 0; coluna < 20; coluna++){
                int col = coluna;
                for(int i = linha; i < 10; i++){
                    for(int j = col + 1; j < matriz[i].length; j++){
                        if (matriz[linha][coluna] > matriz[i][j]){
                            aux = matriz[linha][coluna];
                            matriz[linha][coluna] = matriz[i][j];
                            matriz[i][j] = aux;
                        }
                    }
                    col = -1;
                }
            }
        }

        System.out.println("Matriz ordenada:");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}