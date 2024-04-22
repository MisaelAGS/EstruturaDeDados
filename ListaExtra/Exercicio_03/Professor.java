package Exercicio_03;

public class Professor {

    public String nome;
    public double salario;

    public Professor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setAumentarSalario(double percentual){
        this.salario += this.salario * percentual / 100;
        System.out.println("Alterado!");
    }

    public void imprimirNomeSalario(){
        System.out.printf("Nome: %s\nSalário: %.2f\n", getNome(), getSalario());
    }
}
