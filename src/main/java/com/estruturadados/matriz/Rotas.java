package com.estruturadados.matriz;

/**
 *
 * @author haganicolau
 */
public class Rotas {

    int mapa[][];

    public Rotas() {
        this.mapa = new int[6][6];
    }

    /*
     *0-> 1(Cáceres)
     *1-> 2(BBugres)
     *2-> 3(Cuiabá)
     *3-> 4(VGrande)
     *4-> 5(Tangará)
     *5-> 6(PLacerda)
     */
    public void popular() {
        this.mapa[0][0] = -1;
        this.mapa[1][1] = -1;
        this.mapa[2][2] = -1;
        this.mapa[3][3] = -1;
        this.mapa[4][4] = -1;
        this.mapa[5][5] = -1;

        this.mapa[0][1] = 63;
        this.mapa[0][2] = 210;
        this.mapa[0][3] = 190;
        this.mapa[0][4] = 0;
        this.mapa[0][5] = 190;

        this.mapa[1][0] = 63;
        this.mapa[1][2] = 160;
        this.mapa[1][3] = 150;
        this.mapa[1][4] = 95;
        this.mapa[1][5] = 0;

        this.mapa[2][0] = 210;
        this.mapa[2][1] = 160;
        this.mapa[2][3] = 10;
        this.mapa[2][4] = 0;
        this.mapa[2][5] = 0;

        this.mapa[3][0] = 190;
        this.mapa[3][1] = 150;
        this.mapa[3][2] = 10;
        this.mapa[3][4] = 0;
        this.mapa[3][5] = 0;

        this.mapa[4][0] = 0;
        this.mapa[4][1] = 95;
        this.mapa[4][2] = 0;
        this.mapa[4][3] = 0;
        this.mapa[4][5] = 80;

        this.mapa[5][0] = 190;
        this.mapa[5][1] = 0;
        this.mapa[5][2] = 0;
        this.mapa[5][3] = 0;
        this.mapa[5][4] = 80;
    }

    public int navegar(int origem, int destino) throws Exception {

        int distancia = this.mapa[origem][destino];

        if(distancia == -1) {
            throw new Exception("Cidade origem mesma de destino");
        }

        if(distancia != 0) {
            return distancia;
        }

        int destinoFinal = 0;
        for(int origemAux = 0; origemAux < 6; origemAux++) {

            if(mapa[origemAux][destino] == 0 || mapa[origemAux][destino] == -1) {
                continue;
            }
            destinoFinal =  mapa[origem][origemAux] + mapa[origemAux][destino];
        }
        return destinoFinal;
    }
}