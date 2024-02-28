package Primeira_Lista_Exercicios;
import java.util.Scanner;
import java.util.Random;
public class Exercicio04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores do vetor: ");
        int qtd_elementos = sc.nextInt();
        Random numero_aleatorio = new Random();
        int [] vetor = new int[qtd_elementos];
        for(int i = 0; i < qtd_elementos; i++){
            vetor[i] = numero_aleatorio.nextInt(1001);
        }
        for(int i = 0; i < qtd_elementos; i++){
            for(int j = 0; j < qtd_elementos - 1; j++){
                if(vetor[j] > vetor[j + 1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for(int i = 0; i < qtd_elementos; i++){
            System.out.println(vetor[i]);
        }
        System.out.print("Dentre os elementos do vetor, digite um para ser localizado: ");
        int num_procurado = sc.nextInt();
        int fim = qtd_elementos - 1;
        int inicio = 0;
        int indice_procurado = (inicio + fim) / 2;
        while (true){
            int num_localizado = vetor[indice_procurado];
            if (num_procurado == num_localizado){
                System.out.printf("O número procurado está na posição %d", indice_procurado);
                break;
            }
            else if (num_procurado > num_localizado) {
                inicio = indice_procurado + 1;
                indice_procurado = (inicio + fim) / 2;

            }
            else {
                fim = indice_procurado - 1;
                indice_procurado = (inicio + fim) / 2;
            }
        }
    }
}
