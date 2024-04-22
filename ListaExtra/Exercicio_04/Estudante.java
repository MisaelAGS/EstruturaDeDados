package Exercicio_04;

import java.util.Scanner;

public class Estudante {

    Scanner sc = new Scanner(System.in);

    private String nome;
    private String curso;
    private String ano_ingresso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAno_ingresso() {
        return ano_ingresso;
    }

    public void setAno_ingresso(String ano_ingresso) {
        this.ano_ingresso = ano_ingresso;
    }

    public Estudante() {
        System.out.print("Nome estudante: ");
        this.nome = sc.nextLine();
        System.out.print("Curso: ");
        this.curso = sc.nextLine();
        System.out.print("Ano de ingresso: ");
        this.ano_ingresso = sc.nextLine();
        sc.close();
    }

    public void ImprimirEstudante(){
        System.out.printf("Nome estudante: %s\n", getNome());
        System.out.printf("Curso: %s\n", getCurso());
        System.out.printf("Ano de ingresso: %s\n", getAno_ingresso());
    }
}
