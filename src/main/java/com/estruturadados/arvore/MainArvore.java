package com.estruturadados.arvore;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class MainArvore {
    public static void main(String [] args){
        ArvoreAVL tree = new ArvoreAVL(13);
        tree.inserir(10);
        tree.inserir(15);
        tree.inserir(5);
        tree.inserir(11);
        tree.inserir(16);
        tree.inserir(4);
        tree.inserir(8);
        
        tree.preOrdem();
        tree.emOrdem();
        tree.posOrdem();
    }
}
