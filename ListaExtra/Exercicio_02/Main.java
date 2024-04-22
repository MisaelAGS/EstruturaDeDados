package Exercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Contato contato = new Contato();
        System.out.print("Digite o nome da pessoa: ");
        contato.nome = sc.nextLine();
        System.out.print("Digite o número da pessoa: ");
        contato.telefone = sc.nextLine();
        while(true){
            System.out.printf("Nome: %s\n", contato.getNome());
            System.out.printf("Telefone: %s\n", contato.getTelefone());
            System.out.print("Deseja alterar? (s/n) ");
            String resposta = sc.nextLine();
            if (resposta.equals("s")){
                System.out.print("Digite o nome da pessoa: ");
                contato.setNome(sc.nextLine());
                System.out.print("Digite o número da pessoa: ");
                contato.setTelefone(sc.nextLine());
            } else if (resposta.equals("n")) {
                break;
            }
        }
    }
}
