package Lista_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Fila fila = new Fila();

        while (true) {

            System.out.println("=================== MENU ===================");
            System.out.println("1 - Inserir um elemento na fila.");
            System.out.println("2 - Remover um elemento da fila.");
            System.out.println("3 - Exibir fila.");
            System.out.println("4 - Exibir quantidade de elementos da fila.");
            System.out.println("5 - Procurar elemento na fila.");
            System.out.println("6 - Sair.");
            System.out.println("============================================");

            System.out.print("Escolha uma das opções acima: ");
            int escolha = sc.nextInt();

            if (escolha == 6) {
                break;
            }

            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite o elemento a ser inserido na fila: ");
                    fila.adicionarElemento(sc.nextInt());
                }
                case 2 -> {
                    fila.removerElemento();
                }
                case 3 -> {
                    fila.exibirFila();
                }
                case 4 -> {
                    System.out.printf("Quantidade de elemetos da fila: %d", fila.qtdElementos());
                }
                case 5 -> {
                    System.out.print("Digite o elemento a ser localizado na fila: ");
                    fila.procurarElemento(sc.nextInt());
                }
                default -> {
                    System.out.println("Digite uma opção válida!");
                }

            }
        }
    }
}


