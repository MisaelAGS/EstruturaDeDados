package Lista_07;

public class Fila {

    private int fila[];
    private int tamanho;
    private int ultimoElemento;
    private int primeiroElemento;
    private int posicao_max;

    public Fila(int qtd_posicoes){
        this.fila = new int[qtd_posicoes];
        this.tamanho = 0;
        this.ultimoElemento = -1;
        this.primeiroElemento = -1;
        this.posicao_max = qtd_posicoes - 1;
    }

    public boolean adicionarElemento(int elemento){
        if (this.tamanho == 0) {
            this.fila[ultimoElemento + 1] = elemento;
            this.ultimoElemento++;
            this.tamanho++;
            this.primeiroElemento++;
            return true;
        } else if (this.ultimoElemento < this.primeiroElemento && this.primeiroElemento - this.ultimoElemento > 1) {
            this.fila[ultimoElemento + 1] = elemento;
            this.ultimoElemento++;
            this.tamanho++;
            return true;
        } else if (this.primeiroElemento <= this.ultimoElemento && this.ultimoElemento < this.posicao_max){
            this.fila[ultimoElemento + 1] = elemento;
            this.ultimoElemento++;
            this.tamanho++;
            return true;
        } else if (this.primeiroElemento > 0 && this.tamanho < this.posicao_max + 1) {
            this.fila[0] = elemento;
            this.ultimoElemento = 0;
            this.tamanho++;
            return true;
        } else {
            return false;
        }

    }

    public boolean removerElemento(){
        if (this.tamanho == 0){
            return false;
        }
        else if (this.tamanho == 1){
            this.fila[primeiroElemento] = 0;
            this.tamanho--;
            return true;
        }
        else if (this.primeiroElemento < this.posicao_max) {
            this.fila[primeiroElemento] = 0;
            this.primeiroElemento ++;
            this.tamanho --;
            return true;
        }
        else if (this.primeiroElemento == this.posicao_max) {
            this.fila[primeiroElemento] = 0;
            this.primeiroElemento = 0;
            this.tamanho--;
            return true;
        }
        else{
            return false;
        }
    }

    public void exibirFila(){
        if (this.tamanho == 0){
            System.out.println("Não foi possível exibir os elementos. A fila está vazia.");
        }
        else if (this.primeiroElemento <= this.ultimoElemento) {
            for(int i = this.primeiroElemento; i <= this.ultimoElemento; i++){
                System.out.printf("%d ", this.fila[i]);
            }
            System.out.println();
        }
        else {
            for(int i = this.primeiroElemento; i <= this.posicao_max; i++){
                System.out.printf("%d ", this.fila[i]);
            }
            for(int j = 0; j <= this.ultimoElemento; j++){
                System.out.printf("%d ", this.fila[j]);
            }
            System.out.println();
        }
    }

    public int qtdElementos(){
        if (this.tamanho == 0){
            return 0;
        }
        else{
            return this.tamanho;
        }
    }

    public boolean procurarElemento(int elemento){
        int localizacao = 0;
        if (this.tamanho == 0){
            return false;
        }
        else if (this.primeiroElemento <= this.ultimoElemento){
            for(int i = this.primeiroElemento; i <= this.ultimoElemento; i++) {
                if (fila[i] == elemento){
                    localizacao = 1;
                    break;
                }
            }
            return localizacao != 0;
        }
        else {
            for(int i = this.primeiroElemento; i <= this.posicao_max; i++){
                if (fila[i] == elemento){
                    localizacao = 1;
                    break;
                }
            }
            for(int j = 0; j <= this.ultimoElemento; j++){
                if (fila[j] == elemento) {
                    localizacao = 1;
                    break;
                }
            }
            return localizacao != 0;
        }
    }

}
