package com.estruturadados.arvore;

public class ArvoreAVL extends ArvoreAbstract {

    private int fb;


    public ArvoreAVL(int valor) {
        super(valor);
        this.fb = 0;
    }

    /**
     * @description Método que chama o outro método a partir da raiz para encontrar
     *  o local correto de ser inserido na árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param valor float - valor a ser inserido na árvore.
     */
    public void inserir(int valor) {
        inserir(this.raiz, valor);
        System.out.println("Inserindo o valor: " + valor);
        balancear();
    }

    @Override
    public int remover(int valor) throws Exception {
        int valorEncontrado = this.remover(this.raiz, valor);
        return valorEncontrado;
    }

    public int altura() {
        return altura(this.raiz);
    }

    public void calcularFB() {
        calcularFB(this.raiz);
    }

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

    public void balancear() {
        this.raiz = balancear(this.raiz);
    }

    public No balancear(No no) {

        if(no != null) {

            /**
             * navegar nó a nó de forma recursiva validando se precisa de balanceamento
             */
            no.setEsquerdo(balancear(no.getEsquerdo()));
            no.setDireito(balancear(no.getDireito()));
            calcularFB(no);

            No raiz = no;

            /**
             * No  desbalanceado tendendo para esquerda por isto o fator de desbalanceamento é menor que -1 
             *  devemos fazer uma rotação para a direita
             */
            if(no.getFb() < -1) {
                System.out.println("No " + no.getValor() + " desbalanceado para a esquerda");

                No B = no.getEsquerdo();
                
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
                No B = no.getDireito();

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


    public No rotaocaoDuplaEsquerda(No A) {
        System.out.println("Executando rotação dupla a esquerda, nó " + A.getValor());

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


    public No rotacaoSimplesEsquerda(No A) {
        System.out.println("Executando rotação simples a esquerda, nó " + A.getValor());

        No B = A.getDireito();
        No C = B.getDireito();
        No D = A.getEsquerdo();
        No E = B.getEsquerdo();

        B.setDireito(C);
        A.setEsquerdo(D);
        A.setDireito(E);
        B.setEsquerdo(A);

        return B;
    }

    public No rotaocaoDuplaDireita(No A) {
        System.out.println("Executando rotação dupla a direita, nó " + A.getValor());

        No B = A.getEsquerdo();
        No C = B.getDireito();
        No D = C.getEsquerdo();
        No E = B.getEsquerdo();

        A.setEsquerdo(C);
        C.setEsquerdo(B);
        B.setDireito(D);
        B.setEsquerdo(E);

        return rotacaoSimplesDireita(A);
    }

    public No rotacaoSimplesDireita(No A) {
        System.out.println("Executando rotação simples a direita, nó " + A.getValor());

        No B = A.getEsquerdo();
        No C = B.getEsquerdo();
        No D = A.getDireito();
        No E = B.getDireito();

        B.setEsquerdo(C);
        A.setDireito(D);
        A.setEsquerdo(E);
        B.setDireito(A);

        return B;
    }

}