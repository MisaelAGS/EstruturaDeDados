package Exercicio_04;

import java.util.Scanner;

public class Professor {

    Scanner sc = new Scanner(System.in);

    private String nome;
    private String departamento;
    private String titulacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Professor() {
        System.out.print("Nome professor: ");
        this.nome = sc.nextLine();
        System.out.print("Departamento: ");
        this.departamento = sc.nextLine();
        System.out.print("Titulação: ");
        this.titulacao = sc.nextLine();
    }

    public void ImprimirProfessor(){
        System.out.printf("Nome professor: %s\n", getNome());
        System.out.printf("Departamento: %s\n", getDepartamento());
        System.out.printf("Titulação: %s\n", getTitulacao());
    }
}
