package com.estruturadados.arvore;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class ArvoreAVL {
    private No raiz;
    private int fb;
    private int altura;
    
    public ArvoreAVL(float valor) {
        this.raiz = new No();
        this.raiz.setValor(valor);
        this.fb = 0;
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
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando todos os nós. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */
    public void calcularFB() {
        calcularFB(this.raiz);
    }
    
    /**
     * @description Método que calcula o fator de balanceamento de cada nó, a partir
     * do valor da altura.
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - nó de forma recursiva
     */
    private void calcularFB(No no) {
        if(no != null) {
            int esq = altura(no.getEsquerdo());
            int dir = altura(no.getDireito());
            int fb = dir - esq;
            
            if(Math.abs(fb) > this.fb)
                this.fb = fb;
            
            no.setFb(fb);
            calcularFB(no.getEsquerdo());
            calcularFB(no.getDireito());
        }
    }
    
    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando todos os nós. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */
    public void balancear() {
        this.raiz = balancear(this.raiz);
    }
    
    /**
     * @description Métoo que efetua o balanceamento conforme as regras da AVL
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param no No - nó de forma recursiva
     */
    private No balancear(No no) {
        if(no == null) {
            return null;
        }
        else {
            /*navegar nó a nó de forma recursiva validando se precisa de 
             * balanceamento
             */
            no.setEsquerdo(balancear(no.getEsquerdo()));
            no.setDireito(balancear(no.getDireito()));
            calcularFB(no);
            
            No raiz = no;
            /*No desbalanceado tendendo para esquerda por isto o fator de  
            * balanceamento é menor que -1. Rotações para Direita
            */
            if(no.getFb() < -1) {
                No B = no.getEsquerdo();
                /*se o filho é menor que 0, está no mesmo sentido que o pai, por isto
                * deve-se usar a rotação simples
                */
                if(B.getFb() < 0) {
                    raiz = rotacaoSimplesDireita(no);
                }
                
                /*se o filho é maior que 0, está no sentido inverso ao pai, por isto
                * deve-se usar a rotação dupla
                */
                if(B.getFb() > 0) {
                    raiz = rotacaoDuplaDireita(no);
                }
            }
            
            /*No desbalanceado tendendo para direita por isto o fator de  
            * balanceamento é maior que 1. Rotações para esquerda
            */
            if(no.getFb() > 1) {
                No B = no.getDireito();
                
                /*se o filho é maior que 0, está no mesmo sentido que o pai, por isto
                * deve-se usar a rotação simples
                */
                if(B.getFb() > 0) {
                    raiz = rotacaoSimplesEsquerda(no);
                }
                
                /*se o filho é menor que 0, está no sentido inverso ao pai, por isto
                * deve-se usar a rotação dupla
                */
                if(B.getFb() < 0) {
                    raiz = rotacaoDuplaEsquerda(no);
                }
                
            }
            return raiz;
        }
    }
    
    /**
     * @description rotação simples a esquera, B se torna pai de A e C, e retorna
     * para ser encaixado na árvore novamente.
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No rotacaoSimplesEsquerda(No A){
        No D = A.getEsquerdo();
        No B = A.getDireito();
        No E = B.getEsquerdo();
        B.setDireito(B.getDireito());
        A.setEsquerdo(D);
        A.setDireito(E);
        B.setEsquerdo(A);
        return B;
    }
    
    /**
     * @description rotação simples a direita, B se torna pai de A e C, e retorna
     * para ser encaixado na árvore novamente.
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No rotacaoSimplesDireita(No A){
        No D = A.getDireito();
        No B = A.getEsquerdo();
        No E = B.getDireito();
        B.setEsquerdo(B.getEsquerdo());
        A.setDireito(D);
        A.setEsquerdo(E);
        B.setDireito(A);
        return B;
    }
    
    /**
     * @description rotação dupla a esquerda, neste primeiro passo B e C são
     * trocados de lugar, para ficarem no mesmo sentido, então é chamado a
     * rotação simples a esquerda para finalizar o processo de balanceamento
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No rotacaoDuplaEsquerda(No A){
        No B = A.getDireito();
        No C = B.getEsquerdo();
        No D = C.getDireito();
        No E = B.getDireito();
        A.setDireito(C);
        C.setDireito(B);
        B.setEsquerdo(D);
        B.setDireito(E);
        return rotacaoSimplesEsquerda(A);
    }
    
    /**
     * @description rotação dupla a direita, neste primeiro passo B e C são
     * trocados de lugar, para ficarem no mesmo sentido, então é chamado a
     * rotação simples a direita para finalizar o processo de balanceamento
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No rotacaoDuplaDireita(No A){
        No B = A.getEsquerdo();
        No C = B.getDireito();
        No D = C.getEsquerdo();
        No E = B.getDireito();
        A.setEsquerdo(C);
        C.setEsquerdo(B);
        B.setDireito(D);
        B.setEsquerdo(E);
        return rotacaoSimplesDireita(A);
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
     * @description retorna o faltor de balanceamento da árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int - fator de balanceamento 
     */
    public int getFb() {
        return fb;
    }

    /**
     * @description seta o fator de balanceamento ao atributo
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param fb int - fator de balanceamento 
     */
    public void setFb(int fb) {
        this.fb = fb;
    }
    
    public boolean estritamenteBinaria() {
        return estritamenteBinaria(this.raiz);
    }
    
    private boolean estritamenteBinaria(No no) {
//        No noE = no.getEsquerdo();
//        No noD = no.getDireito();
//        
//        if(noE != null && noD != null) {
//            return estritamenteBinaria(noE) && 
//                    estritamenteBinaria(noD);
//        }
//        return noE == null
//                && noD == null;
        if(
            (no.getEsquerdo() == null && no.getDireito() != null) ||
            (no.getDireito() == null && no.getEsquerdo() != null)
        ) {
            return false;
        }
        estritamenteBinaria(no.getEsquerdo());
        estritamenteBinaria(no.getDireito());
        return true;
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
