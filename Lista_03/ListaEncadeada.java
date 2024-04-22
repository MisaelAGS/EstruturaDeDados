package Lista_03;

public class ListaEncadeada {

    public Nodo primeiro;
    public Nodo ultimo;
    public int tamanho;

    // Criação de uma lista vazia
    public ListaEncadeada(){
        this.tamanho = 0;
        this.primeiro = null;
        this.ultimo = null;
    }

    // Inserção de um elemento no início da lista
    public void InserirInicio(int elemento) {
        if (this.tamanho == 0) {
            Nodo nodo = new Nodo(elemento);
            this.primeiro = nodo;
            this.tamanho++;
            this.ultimo = nodo;
        }
        else {
            Nodo nodo = new Nodo(elemento);
            nodo.setProximo(this.primeiro);
            this.primeiro = nodo;
            this.tamanho++;
        }
    }

    // Inserção de um elemento no final da lista
    public void InserirFinal(int elemento) {
        Nodo nodo = new Nodo(elemento);
        if (this.tamanho == 0) {
            this.primeiro = nodo;
            this.tamanho++;
            this.ultimo = nodo;
        } else {
            this.ultimo.setProximo(nodo);
            this.ultimo = nodo;
            this.tamanho++;
        }
    }

    // Remoção de um elemento no inicio da lista
    public void RemoverInicio() {
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;
    }

    // Remoção de um elemento do final da lista
    public void RemoverFinal() {
        Nodo atual = this.primeiro;
        for (int i = 0; i < this.tamanho - 1; i++){
            if (atual.getProximo().getProximo() == null){
                atual.setProximo(null);
                break;
            }
            atual = atual.getProximo();
            this.tamanho--;
        }
    }

    // Exibir elementos da lista
    public void ExibirElementos(){
        if(this.tamanho > 0){
            Nodo atual = this.primeiro;
            for (int i = 0; i < this.tamanho; i++){
                System.out.println(atual.getValor());
                atual = atual.getProximo();

            }
        }
    }

    // Pesquisar elemento específico da lista
    public void PesquisarElemento(int elemento){
        if (this.tamanho > 0){
            int count = -1;
            Nodo atual = this.primeiro;
            for (int i = 0; i < this.tamanho; i++){
                count++;
                if (atual.getValor() == elemento){
                    System.out.printf("Elemento %d localizado na posição %d%n", elemento, count);
                    break;
                }
                atual = atual.getProximo();
            }

        }
        else{
            System.out.println("A lista está vazia!");
        }
    }

    // Pesquisar a quantidade de elementos da lista
    public void PesquisarQuantidade(){
        System.out.printf("Quantidade de elementos da lista: %d%n", this.tamanho);
    }

}
