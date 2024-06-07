package Lista_07;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da fila: ");
        Fila fila = new Fila(sc.nextInt());

        while(true){

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

            if(escolha == 6){
                break;
            }

            switch (escolha){
                case 1 -> {
                    System.out.print("Digite o elemento a ser inserido na fila: ");
                    if (fila.adicionarElemento(sc.nextInt())){
                        System.out.println("Elemento inserido com sucesso!");

                    }
                    else {
                        System.out.println("Não foi possível inserir o elemento. A fila está cheia.");
                    }
                }
                case 2 -> {
                    if (fila.removerElemento()){
                        System.out.println("Elemento removido com sucesso!");
                    }
                    else {
                        System.out.println("Não foi possível remover o elemento. A fila está vazia.");
                    }
                }
                case 3 -> {
                    fila.exibirFila();
                }
                case 4 -> {
                    System.out.printf("A quantidade de elementos da fila é: %d.\n", fila.qtdElementos());
                }
                case 5 -> {
                    System.out.print("Digite o elemento a ser localizado na fila: ");
                    if (fila.procurarElemento(sc.nextInt())){
                        System.out.println("O elemento existe na fila!");
                    }
                    else {
                        System.out.println("O elemento não existe na fila!");
                    }
                }
                default -> {
                    System.out.println("Digite uma das opções válidas!");
                }
            }
        }
    }
}
