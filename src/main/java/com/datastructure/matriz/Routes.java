package com.datastructure.matriz;

/**
 *
 * @author haganicolau
 */
public class Routes {

    private int map[][];

    public Routes() {
        this.map = new int[6][6];
    }

    /*
     *0-> 1(Cáceres)
     *1-> 2(BBugres)
     *2-> 3(Cuiabá)
     *3-> 4(VGrande)
     *4-> 5(Tangará)
     *5-> 6(PLacerda)
     */
    public void enterValues() {
        this.map[0][0] = -1;
        this.map[1][1] = -1;
        this.map[2][2] = -1;
        this.map[3][3] = -1;
        this.map[4][4] = -1;
        this.map[5][5] = -1;

        this.map[0][1] = 63;
        this.map[0][2] = 210;
        this.map[0][3] = 190;
        this.map[0][4] = 0;
        this.map[0][5] = 190;

        this.map[1][0] = 63;
        this.map[1][2] = 160;
        this.map[1][3] = 150;
        this.map[1][4] = 95;
        this.map[1][5] = 0;

        this.map[2][0] = 210;
        this.map[2][1] = 160;
        this.map[2][3] = 10;
        this.map[2][4] = 0;
        this.map[2][5] = 0;

        this.map[3][0] = 190;
        this.map[3][1] = 150;
        this.map[3][2] = 10;
        this.map[3][4] = 0;
        this.map[3][5] = 0;

        this.map[4][0] = 0;
        this.map[4][1] = 95;
        this.map[4][2] = 0;
        this.map[4][3] = 0;
        this.map[4][5] = 80;

        this.map[5][0] = 190;
        this.map[5][1] = 0;
        this.map[5][2] = 0;
        this.map[5][3] = 0;
        this.map[5][4] = 80;
    }

    public int navigate(int origin, int destiny) throws Exception {

        int distance = this.map[origin][destiny];

        if(distance == -1) {
            throw new Exception("Cidade origin mesma de destiny");
        }

        if(distance != 0) {
            return distance;
        }

        int finalDestination = 0;
        for(int originAux = 0; originAux < 6; originAux++) {

            if(this.map[originAux][destiny] == 0
                || this.map[originAux][destiny] == -1
                || this.map[origin][originAux] == 0
            ) {
                continue;
            }
            finalDestination =  this.map[origin][originAux] + this.map[originAux][destiny];
        }
        return finalDestination;
    }
}