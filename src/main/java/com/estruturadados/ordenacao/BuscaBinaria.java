package com.estruturadados.ordenacao;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class BuscaBinaria {
    /*private final int v[] = {4,7,8,10,14,21,22,36,62,77,81,91}; */

    /**
     * @description Método de busca binária O(logn)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int - número buscado 
     */
    public int search(int v[], int valor) {
        int meio = 0;
        int esq = 0;
        int dir = v.length-1;
        boolean achou = false;
        
        while((esq<=dir) && (achou == false)) {
            meio = (esq+dir)/2;
            if(v[meio] == valor) {
                achou = true;
            }
            else if(v[meio] < valor) {
                esq = meio + 1;
            }
            else {
                dir = meio - 1;
            }
        }
        
        if(valor == v[meio]) {
            return meio;
        }
        return v.length;
    }
}
