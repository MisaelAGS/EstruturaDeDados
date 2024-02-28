package Primeira_Lista_Exercicios;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int[] vetor = new int[qtd_elementos];
        int [] vetor_par = new int[qtd_elementos];
        int [] vetor_impar = new int[qtd_elementos];
        for (int i = 0; i < qtd_elementos; i++){
            vetor[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++){
            if(vetor[i] % 2 == 0){
                vetor_par[i] = vetor[i];
            }
        }
        System.out.print("Os valores pares são: ");
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d ", vetor_par[i]);
        }
        System.out.println();
        System.out.print("Os valores impares são: ");
        for (int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d ", vetor_impar[i]);
        }
    }
}
