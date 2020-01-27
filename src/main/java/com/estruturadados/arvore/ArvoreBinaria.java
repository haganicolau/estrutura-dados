package com.estruturadados.arvore;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class ArvoreBinaria {
    private No raiz;
    private int altura;
    
    public ArvoreBinaria(float valor) {
        this.raiz = new No();
        this.raiz.setValor(valor);
        this.altura = 0;
    }
    
    /**
     * @description Método que chama o outro método a partir da raiz para encontrar
     *  o local correto de ser inserido na árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param valor float - valor a ser inserido na árvore.
     */
    public void inserir(float valor) {
        inserir(this.raiz, valor);
    }

    /**
     * @description Método que acontece a sobrecarga de método, e a partir da 
     * raiz navega-se entre os nós de forma recursiva procurando o local exato
     * onde deve ser inserido o valor. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - acesso nó recursivo
     * @param valor float - valor a ser inserido na árvore.
     */    
    private void inserir(No no, float valor) {
        if(valor < no.getValor()) {
            if(no.getEsquerdo() != null) {
                inserir(no.getEsquerdo(), valor);
            } else {
                No novo = new No();
                novo.setValor(valor);
                no.setEsquerdo(novo);
            }
        } else {
            if(no.getDireito() != null) {
                inserir(no.getDireito(), valor);
            } else {
                No novo = new No();
                novo.setValor(valor);
                no.setDireito(novo);
            }
        }
    }
    
    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando os nós. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */    
    public void preOrdem() {
        preOrdem(this.raiz);
    }
    
    /**
     * @description Os nós serão visitados na seguinte ordem: primeiro a raiz,
     * depois a sub-árvore esquerda e por último a sub-árvore direita. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - nó de forma recursiva
     */
    private void preOrdem(No no) {
        if(no != null) {
            System.out.print(no.getValor() + ", ");
            preOrdem(no.getEsquerdo());
            preOrdem(no.getDireito());
        }
    }
    
    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando os nós. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */    
    public void emOrdem() {
        emOrdem(this.raiz);
    }
    
    /**
     * @description Os nós serão visitados primeiro a sub-árvore esquerda, depois 
     * a raiz e por último a sub-árvore direita. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - nó de forma recursiva
     */
    private void emOrdem(No no) {
        if(no != null){
            emOrdem(no.getEsquerdo());
            System.out.print(no.getValor() + ", ");
            emOrdem(no.getDireito());
        }
    }
    
    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando os nós. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */    
    public void posOrdem(){
        posOrdem(this.raiz);
    }
    
    /**
     * @description Os nós serão visitados primeiro a sub-árvore esquerda, depois 
     * a sub-árvore direita e por último a raiz. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - nó de forma recursiva
     */
    private void posOrdem(No no){
        if(no != null) {
            posOrdem(no.getEsquerdo());
            posOrdem(no.getDireito());
            System.out.print(no.getValor() + ", ");
        }
    }
    
    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando todos os nós. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int - valor da altura da árvore
     */
    public int altura() {
        return altura(this.raiz);
    }
    
    /**
     * @description Método recursivo que calcula a altura de cada nó a partir 
     * dos seus filhos 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - nó de forma recursiva
     * @return int - valor altura do nó
     */
    private int altura(No no) {
        if(no == null) {
            return 0;
        }
        else{
            int esq = altura(no.getEsquerdo()) + 1;
            int dir = altura(no.getDireito()) + 1;
            int h = esq > dir ? esq : dir;
            /*se altura maior encontrada, atualiza a altura da árvore*/
            if(h > this.altura)
                this.altura = h;
            
            return h;
        }
    }
        
    /**
     * @description método usado na remoção, objetivo encontrar o maior valor na
     * subárvore, removê-lo e retornar o nó
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - raz da sub-arvore para buscar o maior valor
     * @return No - nó removido
     */
    public No removerMaximo(No no) {
        if(no.getDireito() == null 
                && no.getEsquerdo() == null) {
            return no;
        }
        else if(no.getDireito() != null 
                && no.getDireito().getDireito() == null
                && no.getDireito().getEsquerdo() == null) {
            
            No aux = no.getDireito();
            no.setDireito(null);
            return aux;
        }
        
        else if(no.getDireito() != null
                && no.getDireito().getDireito() == null
                && no.getDireito().getEsquerdo() != null) {
            
            No aux = no.getDireito();
            no.setDireito(no.getDireito().getEsquerdo());
            return aux;
        }
        
        else {
            return removerMaximo(no.getDireito());
        }
    }
    
    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando todos os nós. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param valor float - valor a ser removido
     * @return float - valor a ser removido da árvore
     * @exception Exception - tratamento caso nó não seja encontrado
     */
    public float remover(float valor) throws Exception{
        return remover(this.raiz,valor);
    }
    
    /**
     * @description Método que remove valor em uma arvore binária de busca, 
     * existem três possibiliades para o nó: nó folha (sem filhos), nó com apenas
     * um filho a esquerda ou a direita ou nó com dois filhos (duas sub-arvores)
     * o método navega pela árvore nó a nó, até encontrar o nó desejado, remove-o
     * conforme cada caso, e retorna o valor, caso não encontre o nó solta exceção. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - acesso recursivo
     * @param valor float - valor a ser removido
     * @return float - valor a ser removido da árvore 
     * @exception Exception - tratamento caso nó não seja encontrado
     */
    private float remover(No no, float valor) throws Exception {
        
        /*valor não encontrado*/
        if(no == null) {
            throw new Exception("Valor nao encontrado");
        }
        /*valor maior que o nó, procurar na direita*/
        else if(valor > no.getValor()) {
            float response = remover(no.getDireito(), valor);
            
            if(no.getDireito().getValor() == valor) {
                no.setDireito(null);
            }
            return response;
        }
        /*valor menor que o nó, procurar na esquerda*/
        else if(valor < no.getValor()) {
            float response = remover(no.getEsquerdo(), valor);
            
            if(no.getEsquerdo().getValor() == valor) {
                no.setEsquerdo(null);
            }
            return response;
        }
        /*valor encontrado esquerdo possui um filho*/
        else if (no.getValor() == valor
                && no.getEsquerdo() != null 
                && no.getDireito() == null
        ) {
            No aux = no.getEsquerdo();
            no.setValor(no.getEsquerdo().getValor());
            no.setEsquerdo(null);
            return aux.getValor();
            
        }
        /*valor encontrado direito possui um filho*/
        else if (no.getValor() == valor
                && no.getEsquerdo() == null 
                && no.getDireito() != null
        ) {
            No aux = no.getDireito();
            no.setValor(no.getDireito().getValor());
            no.setDireito(null);
            return aux.getValor();
            
        }
        /*valor encontrado sem filhos*/
        else if (no.getValor() == valor
                && no.getEsquerdo() == null 
                && no.getDireito() == null
        ) {
            return no.getValor();
        }
        /*valor encontrado, e possui dois filhos*/
        else {
            No noAux = removerMaximo(no.getEsquerdo());
            float response = no.getValor();
            no.setValor(noAux.getValor());
            
            if(no.getValor() == no.getEsquerdo().getValor())
                no.setEsquerdo(null);
                
            return response;
        }
    }

    /**
     * @description retorna a altura da árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int - altura 
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @description seta a altura ao atributo
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param altura int - altura da árvore
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
