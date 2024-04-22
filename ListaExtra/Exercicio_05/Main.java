package Exercicio_05;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while(true){
            System.out.println("Menu");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("Escolha uma opção de 1 a 4: ");
            int escolha = sc.nextInt();
            System.out.println("Digite o primeiro valor:");
            calculadora.valor1 = sc.nextInt();
            System.out.println("Digite o segundo valor:");
            calculadora.valor2 = sc.nextInt();
            switch (escolha) {
                case 1:
                    calculadora.Adicao();
                    System.out.println(calculadora.resultado);
                    break;
                case 2:
                    calculadora.Subtracao();
                    System.out.println(calculadora.resultado);
                    break;
                case 3:
                    calculadora.Multiplicacao();
                    System.out.println(calculadora.resultado);
                    break;
                case 4:
                    calculadora.Divisao();
                    System.out.println(calculadora.resultado);
                    break;
                default:
                    System.out.println("Essa não é uma opção válida!");
            }
            System.out.println("Desejar sair? (s/n)");
            String opcao = sc.next();
            if (opcao.equals("s")){
                break;
            }
        }
    }
}
