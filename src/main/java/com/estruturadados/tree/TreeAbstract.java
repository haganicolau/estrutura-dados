package com.estruturadados.tree;

import com.estruturadados.tree.Node.Node;
import com.estruturadados.tree.Node.Value;

public abstract class TreeAbstract<T extends Comparable<T>> {
    
    protected Node<T> raiz;
    protected int altura;

    public TreeAbstract(Value<T> value) {
        this.raiz = new Node<T>(value);
        this.altura = 0;
    }

    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando os nós. RED: RAIZ -> ESQUERDA -> DIREITA
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */  
    public void preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(Node<T> node) {
        if(node != null) {
            System.out.print(node.getValue() + ", ");
            preOrdem(node.getLeft());
            preOrdem(node.getRight());
        }
    }

    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando os nós. ERD: ESQUERDA -> RAIZ -> DIREITA
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */  
    public void emOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(Node<T> node) {
        if(node != null) {
            emOrdem(node.getLeft());
            System.out.print(node.getValue() + ", ");
            emOrdem(node.getRight());
        }
    }

    
    /**
     * @description Método que chama outro método a partir da raiz da árvore 
     * navegando de forma recursiva visitando os nós. ERD: ESQUERDA -> DIREITA -> RAIZ
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */
    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Node<T> node) {
        if(node != null) {
            posOrdem(node.getLeft());
            posOrdem(node.getRight());
            System.out.print(node.getValue() + ", ");
        }
    }

    public abstract void inserir(Value<T> value);
    
    /**
     * @description Método que acontece a sobrecarga de método, e a partir da 
     * raiz navega-se entre os nós de forma recursiva procurando o local exato
     * onde deve ser inserido o valor. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param node No - acesso nó recursivo
     * @param value float - valor a ser inserido na árvore.
     */ 
    protected void inserir(Node<T> node, Value<T> value) {

        if(value.isSmallerThan(node.getValue())) {
            //esquerda
            if(node.getLeft() == null) {
                Node<T> novo = new Node<T>(value);
                node.setLeft(novo);
            }

            else  {
                inserir(node.getLeft(), value);
            }
        }

        else {
            // direita
            if(node.getRight() == null) {
                Node<T> novo = new Node(value);
                node.setRight(novo);
            }

            else {
                inserir(node.getRight(), value);
            }
        }
    }

    public abstract Value<T> remover(Value<T> value) throws Exception;

    /**
     * @description Método que remove valor em uma arvore binária de busca, 
     * existem três possibiliades para o nó: nó folha (sem filhos), nó com apenas
     * um filho a esquerda ou a direita ou nó com dois filhos (duas sub-arvores)
     * o método navega pela árvore nó a nó, até encontrar o nó desejado, remove-o
     * conforme cada caso, e retorna o valor, caso não encontre o nó solta exceção. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param node No - acesso recursivo
     * @param value float - valor a ser removido
     * @return float - valor a ser removido da árvore 
     * @exception Exception - tratamento caso nó não seja encontrado
     */
    protected Value<T> remover(Node<T> node, Value<T> value) throws Exception {

        /*valor não encontrado*/
        if(node == null) {
            throw new Exception("Valor nao encontrado");
        }
        /*valor maior que o nó, procurar na direita*/
        else if(value.isGreaterThan(node.getValue())) {
            Value<T> response = remover(node.getRight(), value);
            
            if(node.getRight().getValue() == value) {
                node.setRight(null);
            }
            return response;
        }
        /*valor menor que o nó, procurar na esquerda*/
        else if(value.isSmallerThan(node.getValue())) {
            Value<T> response = remover(node.getLeft(), value);

            if(node.getLeft().getValue() == value) {
                node.setLeft(null);
            }
            return response;
        }
        /*valor encontrado esquerdo possui um filho*/
        else if (node.getValue().isEquals(value)
                && node.getLeft() != null
                && node.getRight() == null
        ) {
            Node<T> aux = node.getLeft();
            node.setValue(node.getLeft().getValue());
            node.setLeft(null);
            return aux.getValue();

        }
        /*valor encontrado direito possui um filho*/
        else if (node.getValue().isEquals(value)
                && node.getLeft() == null
                && node.getRight() != null
        ) {
            Node<T> aux = node.getRight();
            node.setValue(node.getRight().getValue());
            node.setRight(null);
            return aux.getValue();

        }
        /*valor encontrado sem filhos*/
        else if (node.getValue().isEquals(value)
                && node.getLeft() == null
                && node.getRight() == null
        ) {
            return node.getValue();
        }
        /*valor encontrado, e possui dois filhos*/
        else {
            Node<T> nodeAux = removerMaximo(node.getLeft());
            Value<T> response = node.getValue();
            node.setValue(nodeAux.getValue());

            if(node.getValue() == node.getLeft().getValue())
                node.setLeft(null);

            return response;
        }
    }

    /**
     * @description método usado na remoção, objetivo encontrar o maior valor na
     * subárvore a esquerda, removê-lo e retornar o nó
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param node No - raz da sub-arvore para buscar o maior valor
     * @return No - nó removido
     */
    public Node<T> removerMaximo(Node<T> node) {
        if(node.getRight() == null
                && node.getLeft() == null) {
            return node;
        }
        else if(node.getRight() != null
                && node.getRight().getRight() == null
                && node.getRight().getLeft() == null) {

            Node<T> aux = node.getRight();
            node.setRight(null);
            return aux;
        }

        else if(node.getRight() != null
                && node.getRight().getRight() == null
                && node.getRight().getLeft() != null) {

            Node<T> aux = node.getRight();
            node.setRight(node.getRight().getLeft());
            return aux;
        }

        else {
            return removerMaximo(node.getRight());
        }
    }


    /**
     * @description Calcula altura a partir da raiz
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     */
    public abstract int altura();
    
    /**
     * @description Calcula altur a partir do nó
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param node No - No da árvore.
     */
    public int altura(Node<T> node) {
        if(node != null) {

            int esq = altura(node.getLeft()) + 1;
            int dir = altura(node.getRight()) + 1;
            int h = Math.max(esq, dir);
            
            this.altura = h;


            return h;
        }

        return 0;   
    }
}
