package Lista_06;

import java.util.IdentityHashMap;

public class Fila {
    private int tamanho;
    private Nodo primeiro;
    private Nodo ultimo;

    public Fila (){
        this.tamanho = 0;
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adicionarElemento(int elemento){
        Nodo nodo = new Nodo(elemento);

        if (this.tamanho == 0){
            this.primeiro.setProximo(nodo);
            this.ultimo.setProximo(nodo);
            this.tamanho++;
        }
        else {
            this.ultimo.getProximo().setProximo(nodo);
            nodo.setAnterior(this.ultimo.getProximo());
            this.ultimo.setProximo(nodo);
            this.tamanho++;
        }
    }

    public void removerElemento(){
        if (this.tamanho == 0){
            System.out.println("Não foi possível remover o elemento. A lista está vazia!");
        }
        else {
            this.primeiro.setProximo(this.primeiro.getProximo().getProximo());
            this.primeiro.getProximo().getAnterior().setElemento(0);
            this.primeiro.getProximo().getAnterior().setProximo(null);
            this.primeiro.getProximo().setAnterior(null);
            this.tamanho--;
            System.out.println("Elemento removido com sucesso!");
        }
    }

    public void exibirFila(){
        if (this.tamanho == 0){
            System.out.println("Não foi possível remover o elemento. A lista está vazia!");
        }
        else {
            Nodo atual = this.primeiro.getProximo();
            for (int i = 0; i < this.tamanho; i++){
                System.out.println(atual.getElemento());
                atual = atual.getProximo();
            }
        }
    }

    public int qtdElementos(){
        return this.tamanho;
    }

    public void procurarElemento(int elemento){
        Nodo atual = this.primeiro.getProximo();
        int localizacao = 0;
        for (int i = 0; i < this.tamanho; i++){
            if (atual.getElemento() == elemento){
                System.out.println("O elemento existe na fila!");
                localizacao = 1;
                break;
            }
        }
        if (localizacao == 0){
            System.out.println("Elemento não localizado na fila!");
        }
    }

}
