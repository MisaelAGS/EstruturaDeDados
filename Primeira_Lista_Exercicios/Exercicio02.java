package Primeira_Lista_Exercicios;
import java.util.Random;
public class Exercicio02 {
    public static void main(String[]args){
        int qtd_elementos = 100;
        int [] vetor = new int[qtd_elementos];
        int [] vetor2 = new int[qtd_elementos / 2];
        int menor_valor = 101; // recebe o maior valor que pode ser gerado
        int indice_menor_valor = 0;
        int soma_valores = 0;
        Random numero_aleatorio = new Random();
        for(int i = 0; i < qtd_elementos; i++){
            vetor[i] = numero_aleatorio.nextInt(menor_valor);
        }
        for(int i = 0; i < qtd_elementos; i++){
            if(vetor[i] < menor_valor){
                menor_valor = vetor[i];
                indice_menor_valor = i;
            }
        }
        System.out.println("Primeiro vetor:");
        for(int i = 0; i < qtd_elementos; i++){
            System.out.println(vetor[i]);
            soma_valores += vetor[i];
        }
        for (int i = 0; i < 50; i++){
            vetor2[i] = vetor[i] + vetor[99 - i];
        }
        System.out.printf("A posição do menor valor do vetor é: %d.", indice_menor_valor);
        System.out.printf("A soma dos elementos do vetor é: %d.", soma_valores);
        System.out.println("Segundo vetor:");
        for (int i = 0; i < 50; i++) {
            System.out.println(vetor2[i]);
        }
    }
}
