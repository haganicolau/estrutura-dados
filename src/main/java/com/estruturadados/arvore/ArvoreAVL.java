package com.estruturadados.arvore;

import com.estruturadados.arvore.No.No;
import com.estruturadados.arvore.No.Valor;

public class ArvoreAVL <T extends Comparable<T>> extends ArvoreAbstract {

    private int fb;

    public ArvoreAVL(Valor<T> valor) {
        super(valor);
        this.fb = 0;
    }

    /**
     * @description Método que chama o outro método a partir da raiz para encontrar
     *  o local correto de ser inserido na árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param valor float - valor a ser inserido na árvore.
     */
    @Override
    public void inserir(Valor valor) {
        inserir(this.raiz, valor);
        System.out.println("Inserindo o valor: " + valor);
        balancear();
    }

    @Override
    public Valor<T> remover(Valor valor) throws Exception {
        return this.remover(this.raiz, valor);
    }

    public int altura() {
        return altura(this.raiz);
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
    public void calcularFB(No no) {
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
     * @description Métoo que efetua o balanceamento conforme as regras da AVL
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
//     * @param no No - nó de forma recursiva
     */
    public void balancear() {
        this.raiz = balancear(this.raiz);
    }

    public No<T> balancear(No<T> no) {

        if(no != null) {

            /**
             * navegar nó a nó de forma recursiva validando se precisa de balanceamento
             */
            no.setEsquerdo(balancear(no.getEsquerdo()));
            no.setDireito(balancear(no.getDireito()));
            calcularFB(no);

            No<T> raiz = no;

            /**
             * No  desbalanceado tendendo para esquerda por isto o fator de desbalanceamento é menor que -1 
             *  devemos fazer uma rotação para a direita
             */
            if(no.getFb() < -1) {
                System.out.println("No " + no.getValor() + " desbalanceado para a esquerda");

                No<T> B = no.getEsquerdo();
                
                /**
                 * Se o filho for na mesma direção do pai executar rotação simples a direita
                 */
                if(B.getFb() < 0) {
                    System.out.println("No " + B.getValor() + " filho na mesma direção, rotação simples a direita");
                    raiz = rotacaoSimplesDireita(no);
                }

                /**
                 * Se o filho for na direção oposta do pai executar rotação dupla a direita
                 */
                if(B.getFb() > 0) {
                    System.out.println("No " + B.getValor() + " filho na direção diferente do pai rotação dupla a direita");
                    raiz = rotaocaoDuplaDireita(no);
                }
            }

            /**
             * No  desbalanceado tendendo para direita por isto o fator de desbalanceamento é maior que 1 
             *  devemos fazer uma rotação para a esquerda
             */
            if(no.getFb() > 1) {
                System.out.println("No " + no.getValor() + " desbalanceado para a direita");
                No<T> B = no.getDireito();

                /**
                 * Se o filho for na mesma direção do pai executar rotação simples a esquerda
                 */
                if(B.getFb() > 0) {
                    System.out.println("No " + B.getValor() + " filho na mesma direção, rotação simples a esquerda");
                    raiz = rotacaoSimplesEsquerda(no);
                }

                /**
                 * Se o filho for na direção oposta do pai executar rotação dupla a esquerda
                 */
                if(B.getFb() < 0) {
                    System.out.println("No " + B.getValor() + " filho na direção diferente do pai rotação dupla a esquerda");
                    raiz = rotaocaoDuplaEsquerda(no);
                }
            }

            return raiz;
        }

        return null;
    }

    /**
     * @description rotação dupla a esquerda, neste primeiro passo B e C são
     * trocados de lugar, para ficarem no mesmo sentido, então é chamado a
     * rotação simples a esquerda para finalizar o processo de balanceamento
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No<T> rotaocaoDuplaEsquerda(No<T> A) {
        System.out.println("Executando rotação dupla a esquerda, nó " + A.getValor());

        No<T> B = A.getDireito();
        No<T> C = B.getEsquerdo();
        No<T> D = C.getDireito();
        No<T> E = B.getDireito();

        A.setDireito(C);
        C.setDireito(B);
        B.setEsquerdo(D);
        B.setDireito(E);

        return rotacaoSimplesEsquerda(A);
    }

    /**
     * @description rotação simples a esquera, B se torna pai de A e C, e retorna
     * para ser encaixado na árvore novamente.
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No<T> rotacaoSimplesEsquerda(No<T> A) {
        System.out.println("Executando rotação simples a esquerda, nó " + A.getValor());

        No<T> B = A.getDireito();
        No<T> C = B.getDireito();
        No<T> D = A.getEsquerdo();
        No<T> E = B.getEsquerdo();

        B.setDireito(C);
        A.setEsquerdo(D);
        A.setDireito(E);
        B.setEsquerdo(A);

        return B;
    }

    /**
     * @description rotação dupla a direita, neste primeiro passo B e C são
     * trocados de lugar, para ficarem no mesmo sentido, então é chamado a
     * rotação simples a direita para finalizar o processo de balanceamento
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No<T> rotaocaoDuplaDireita(No A) {
        System.out.println("Executando rotação dupla a direita, nó " + A.getValor());

        No<T> B = A.getEsquerdo();
        No<T> C = B.getDireito();
        No<T> D = C.getEsquerdo();
        No<T> E = B.getEsquerdo();

        A.setEsquerdo(C);
        C.setEsquerdo(B);
        B.setDireito(D);
        B.setEsquerdo(E);

        return rotacaoSimplesDireita(A);
    }

    /**
     * @description rotação simples a direita, B se torna pai de A e C, e retorna
     * para ser encaixado na árvore novamente.
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public No<T> rotacaoSimplesDireita(No<T> A) {
        System.out.println("Executando rotação simples a direita, nó " + A.getValor());

        No<T> B = A.getEsquerdo();
        No<T> C = B.getEsquerdo();
        No<T> D = A.getDireito();
        No<T> E = B.getDireito();

        B.setEsquerdo(C);
        A.setDireito(D);
        A.setEsquerdo(E);
        B.setDireito(A);

        return B;
    }
}