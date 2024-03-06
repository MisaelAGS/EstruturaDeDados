package Primeira_Lista_Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio07 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int[qtd_elementos];
        for (int i = 0; i < qtd_elementos; i++){
            vetor[i] = sc.nextInt();
        }
        int numerador = 0;
        int denominador = 0;
        for (int i = 0; i < qtd_elementos; i++){
            numerador += vetor[i] * i;
            denominador += i;
        }
        double media;
        media = (double) numerador / denominador;
        System.out.printf("Média ponderada: %.2f", media);
    }
}
