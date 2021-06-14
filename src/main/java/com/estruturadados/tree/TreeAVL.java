package com.estruturadados.tree;

import com.estruturadados.tree.Node.Node;
import com.estruturadados.tree.Node.Value;

public class TreeAVL<T extends Comparable<T>> extends TreeAbstract {

    private int fb;

    public TreeAVL(Value<T> value) {
        super(value);
        this.fb = 0;
    }

    /**
     * @description Método que chama o outro método a partir da raiz para encontrar
     *  o local correto de ser inserido na árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param value float - valor a ser inserido na árvore.
     */
    @Override
    public void inserir(Value value) {
        inserir(this.raiz, value);
        System.out.println("Inserindo o valor: " + value);
        balancear();
    }

    @Override
    public Value<T> remover(Value value) throws Exception {
        return this.remover(this.raiz, value);
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
     * @param node No - nó de forma recursiva
     */
    public void calcularFB(Node node) {
        if(node != null) {
            
            int esq = altura(node.getLeft());
            int dir = altura(node.getRight());

            int fb = dir - esq;

            if(Math.abs(fb) > this.fb)
                this.fb = fb;

            node.setFb(fb);
            calcularFB(node.getLeft());
            calcularFB(node.getRight());

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

    public Node<T> balancear(Node<T> node) {

        if(node != null) {

            /**
             * navegar nó a nó de forma recursiva validando se precisa de balanceamento
             */
            node.setLeft(balancear(node.getLeft()));
            node.setRight(balancear(node.getRight()));
            calcularFB(node);

            Node<T> raiz = node;

            /**
             * No  desbalanceado tendendo para esquerda por isto o fator de desbalanceamento é menor que -1 
             *  devemos fazer uma rotação para a direita
             */
            if(node.getFb() < -1) {
                System.out.println("No " + node.getValue() + " desbalanceado para a esquerda");

                Node<T> B = node.getLeft();
                
                /**
                 * Se o filho for na mesma direção do pai executar rotação simples a direita
                 */
                if(B.getFb() < 0) {
                    System.out.println("No " + B.getValue() + " filho na mesma direção, rotação simples a direita");
                    raiz = rotacaoSimplesDireita(node);
                }

                /**
                 * Se o filho for na direção oposta do pai executar rotação dupla a direita
                 */
                if(B.getFb() > 0) {
                    System.out.println("No " + B.getValue() + " filho na direção diferente do pai rotação dupla a direita");
                    raiz = rotaocaoDuplaDireita(node);
                }
            }

            /**
             * No  desbalanceado tendendo para direita por isto o fator de desbalanceamento é maior que 1 
             *  devemos fazer uma rotação para a esquerda
             */
            if(node.getFb() > 1) {
                System.out.println("No " + node.getValue() + " desbalanceado para a direita");
                Node<T> B = node.getRight();

                /**
                 * Se o filho for na mesma direção do pai executar rotação simples a esquerda
                 */
                if(B.getFb() > 0) {
                    System.out.println("No " + B.getValue() + " filho na mesma direção, rotação simples a esquerda");
                    raiz = rotacaoSimplesEsquerda(node);
                }

                /**
                 * Se o filho for na direção oposta do pai executar rotação dupla a esquerda
                 */
                if(B.getFb() < 0) {
                    System.out.println("No " + B.getValue() + " filho na direção diferente do pai rotação dupla a esquerda");
                    raiz = rotaocaoDuplaEsquerda(node);
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
    public Node<T> rotaocaoDuplaEsquerda(Node<T> A) {
        System.out.println("Executando rotação dupla a esquerda, nó " + A.getValue());

        Node<T> B = A.getRight();
        Node<T> C = B.getLeft();
        Node<T> D = C.getRight();
        Node<T> E = B.getRight();

        A.setRight(C);
        C.setRight(B);
        B.setLeft(D);
        B.setRight(E);

        return rotacaoSimplesEsquerda(A);
    }

    /**
     * @description rotação simples a esquera, B se torna pai de A e C, e retorna
     * para ser encaixado na árvore novamente.
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public Node<T> rotacaoSimplesEsquerda(Node<T> A) {
        System.out.println("Executando rotação simples a esquerda, nó " + A.getValue());

        Node<T> B = A.getRight();
        Node<T> C = B.getRight();
        Node<T> D = A.getLeft();
        Node<T> E = B.getLeft();

        B.setRight(C);
        A.setLeft(D);
        A.setRight(E);
        B.setLeft(A);

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
    public Node<T> rotaocaoDuplaDireita(Node A) {
        System.out.println("Executando rotação dupla a direita, nó " + A.getValue());

        Node<T> B = A.getLeft();
        Node<T> C = B.getRight();
        Node<T> D = C.getLeft();
        Node<T> E = B.getLeft();

        A.setLeft(C);
        C.setLeft(B);
        B.setRight(D);
        B.setLeft(E);

        return rotacaoSimplesDireita(A);
    }

    /**
     * @description rotação simples a direita, B se torna pai de A e C, e retorna
     * para ser encaixado na árvore novamente.
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param A No - nó desbalanceado
     * @return No - nó balanceado
     */
    public Node<T> rotacaoSimplesDireita(Node<T> A) {
        System.out.println("Executando rotação simples a direita, nó " + A.getValue());

        Node<T> B = A.getLeft();
        Node<T> C = B.getLeft();
        Node<T> D = A.getRight();
        Node<T> E = B.getRight();

        B.setLeft(C);
        A.setRight(D);
        A.setLeft(E);
        B.setRight(A);

        return B;
    }
}