package Exercicio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        Ponto cood_um = new Ponto();
        System.out.println("Digite o valor x do ponto: ");
        cood_um.cood_x = sc.nextInt();
        System.out.println("Digite o valor y do ponto: ");
        cood_um.ccod_y = sc.nextInt();
        while (true){
            System.out.printf("A coordenada do ponto é: (%d, %d)%n", cood_um.getCood_x(), cood_um.getCcod_y());
            System.out.print("Deseja alterar o ponto? (s/n) ");
            String resposta = sc.next();
            if (resposta.equals("n")) {
                break;
            } else if (resposta.equals("s")) {
                System.out.println("Digite o valor x do ponto: ");
                cood_um.setCood_x(sc.nextInt());
                System.out.println("Digite o valor y do ponto: ");
                cood_um.setCcod_y(sc.nextInt());
            }
        }
    }
}
