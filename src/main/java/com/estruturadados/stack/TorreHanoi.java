package com.estruturadados.stack;

public class TorreHanoi {

    StaticStack pino1;
    StaticStack pino2;
    StaticStack pino3;

    public TorreHanoi() {
        this.pino1 = new StaticStack(7);
        this.pino2 = new StaticStack(7);
        this.pino3 = new StaticStack(7);

        try{
            this.pino1.push(7);
            this.pino1.push(6);
            this.pino1.push(5);
            this.pino1.push(4);
            this.pino1.push(3);
            this.pino1.push(2);
            this.pino1.push(1);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void move(StaticStack origem, StaticStack destino) {
        try{
            int numOrigem;
            int numDestino;

            if(destino.isEmpty()) {
                numOrigem = origem.pop();
                destino.push(numOrigem);
                return;
            }

            numOrigem = origem.pop();
            numDestino = destino.pop();
            if(numDestino < numOrigem) {
                origem.push(numOrigem);
                destino.push(numDestino);
                System.out.println("Não é possível colocar um valor maior em cima de um menor.");
                return;
            }

            destino.push(numDestino);
            destino.push(numOrigem);
            return;
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean changeComplete() {
        if(this.pino3.isFull()) {
            return true;
        }
        return false;
    }

    public void print() {

        StaticStack aux1 = new StaticStack(7);
        StaticStack aux2 = new StaticStack(7);
        StaticStack aux3 = new StaticStack(7);

        if(pino1.isEmpty()) {
            System.out.println("Vazia");
        }
        System.out.println("*************Pino 1*************");
        try{
            while(!this.pino1.isEmpty()) {
                int num = this.pino1.pop();
                System.out.println(num);
                aux1.push(num);
                
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        System.out.println("*************Pino 2*************");
        if(pino2.isEmpty()) {
            System.out.println("Vazia");
        }
        try{
            while(!this.pino2.isEmpty()) {
                int num = this.pino2.pop();
                System.out.println(num);
                aux2.push(num);
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        System.out.println("*************Pino 3*************");
        if(pino3.isEmpty()) {
            System.out.println("Vazia");
        }
        try{
            while(!this.pino3.isEmpty()) {
                int num = this.pino3.pop();
                System.out.println(num);
                aux3.push(num);
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        
        try{
            while(!aux1.isEmpty()) {
                this.pino1.push(aux1.pop());
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        
        try{
            while(!aux2.isEmpty()) {
                this.pino2.push(aux2.pop());
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        
        try{
            while(!aux3.isEmpty()) {
                this.pino3.push(aux3.pop());
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }
    }

    StaticStack getPino(int num) {
        switch(num) {
            case 1:
                return this.pino1;

            case 2: 
                return this.pino2;
            
            case 3:
                return this.pino3;

            default:   
                return null;

        }
    }

}