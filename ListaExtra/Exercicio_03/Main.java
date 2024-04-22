package Exercicio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor("Jose", 1000.00);
        while(true){
            professor.imprimirNomeSalario();
            System.out.printf("Deseja aumentar o salário do %s? (s/n) ", professor.getNome());
            String resposta = sc.next();
            if (resposta.equals("s")){
                System.out.print("Percentual de aumento: ");
                professor.setAumentarSalario(sc.nextDouble());
            } else if (resposta.equals("n")) {
                break;
            }
        }

    }
}
