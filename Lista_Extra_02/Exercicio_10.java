package Lista_Extra_02;

import java.util.Random;

public class Exercicio_10 {
    public static void main(String[]args){
        Random random = new Random();
        int [][] matriz = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = random.nextInt(100);
            }
        }

        int valoMaior = 0;
        int linha = 0;
        int coluna = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(matriz[i][j] > valoMaior){
                    valoMaior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.printf("O maior elemento da matriz é %d, que está na posição (%d, %d).\n", valoMaior, linha, coluna);
        System.out.println("Matriz:");

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

}
