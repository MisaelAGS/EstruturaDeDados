package Primeira_Lista_Exercicios;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int[qtd_elementos];
        System.out.printf("Digite %d elementos para o vetor: ", qtd_elementos);
        for (int i = 0; i < qtd_elementos; i++){
            vetor[i] = sc.nextInt();
        }
        System.out.print("Os elementos pares são: ");
        for (int i = 0; i < qtd_elementos; i++){
            if (vetor[i] % 2 == 0){
                System.out.printf("%d ", vetor[i]);
            }
        }
        System.out.print("\nOs elementos ímpares são: ");
        for (int i = 0; i < qtd_elementos; i++){
            if (vetor[i] % 2 != 0){
                System.out.printf("%d ", vetor[i]);
            }
        }
    }
}
