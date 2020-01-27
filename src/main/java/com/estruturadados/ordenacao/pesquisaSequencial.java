package com.estruturadados.ordenacao;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class pesquisaSequencial {
    private int v[] = {5,9,8,3,4,6,2,7,0,1};
    
    /**
     * @description Método de busca sequencial O(n)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int - número buscado 
     */
    public static int search(int v[], int valor){
        int i = 0;
        boolean achou = false;
        
        while((achou == false) && (i < v.length)) {
            if(v[i] == valor) {
                achou = true;
                continue;
            }
            i++;
        }
        
        if(achou) return i;
        
        return v.length;
    }
}
