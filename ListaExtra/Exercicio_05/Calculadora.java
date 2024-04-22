package Exercicio_05;

public class Calculadora {

    public float valor1;
    public float valor2;
    public float resultado;

    public Calculadora() {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void Adicao(){
        this.resultado = valor1 + valor2;
    }

    public void Subtracao(){
        this.resultado = valor1 - valor2;
    }

    public void Multiplicacao(){
        this.resultado = valor1 * valor2;
    }

    public void Divisao(){

        if (valor2 != 0) {
            this.resultado = valor1 / valor2;
        }
        else {
            System.out.println("Não existe divisão por 0!");
        }
    }
}
