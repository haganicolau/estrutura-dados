package com.estruturadados.introducao;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String [] args) {
        /*
         * 26 - Crie um algoritmo em JAVA que obtenha um número indeterminado de alunos, obtenha o nome
         * a nota P1, a nota P2, calcule a média a partir da seguinte fórmula: (P1 * 0.4) + (P2 * 0.6),
         * enquanto nome for diferente de “sair” e informe para cada aluno:
         * ● Aprovado: Se Média >= 7.0
         * ● Reprovado: Se média < 4,0
         * ● Fazer PS: Se Média >= 4,0 e Média < 7,0
         *
         * Após usuário informar sair como nome e encerrar o programa, informar o que se pede abaixo:
         * ● a maior nota final da turma
         * ● a média aritimética de notas finais
         * ● quantiade de alunos aprovados
         * ● quantidade de alunos reprovados
         * ● quantidade de alunos que precisam fazer ps
         */

        String nome;
        double p1, p2, notaFinal, somaNotas = 0, maiorNota = 0, media = 0;
        int qtdAprovados = 0, qtdReprovados = 0, qtdFazerPS = 0, qtdTotal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        nome = scan.nextLine();
        qtdTotal = 10;
        boolean nomeIgualSair = nome.equals("sair");

        while(!nomeIgualSair) {
            System.out.println("Informe a nome P1: ");
            p1 = scan.nextDouble();

            System.out.println("Informe a nome P2: ");
            p2 = scan.nextDouble();
            scan.nextLine();

            notaFinal = calculoNota(p1, p2);

            if(notaFinal > maiorNota) {
                maiorNota = notaFinal;
            }

            somaNotas = somaNotas + notaFinal;

            if(notaFinal >= 7.0) {
                System.out.println("Situação: Aprovado");
                qtdAprovados++;
            }

            if(notaFinal < 4.0) {
                System.out.println("Situação: Reprovado");
                qtdReprovados++;
            }

            if(notaFinal >= 4.0 && notaFinal < 7 ) {
                System.out.println("Situação: Fazer PS");
                qtdFazerPS++;
            }

            System.out.println("Informe o nome do aluno: ");
            nome = scan.nextLine();
            nomeIgualSair = nome.equals("sair");
        }
        media = somaNotas / qtdTotal;
        System.out.println("Média das notas: " + media);
        System.out.println("Número aprovados: " + qtdAprovados);
        System.out.println("Número reprovados: " + qtdReprovados);
        System.out.println("Número fazer PS: " + qtdFazerPS);
        System.out.println("Maior nota: " + maiorNota);
    }

    static double calculoNota(double notaP1, double notap2) {
        double nota = 0;

        nota = (notaP1 * 0.4) + (notap2 * 0.6);
        return nota;
    }
}
