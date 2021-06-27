package com.datastructure.introduction;

import java.util.Scanner;

public class Exercise26 {

    public static void main(String [] args) {
        /*
         * 26 - Crie um algoritmo em JAVA que obtenha um número indeterminado de alunos, obtenha o name
         * a nota P1, a nota P2, calcule a média a partir da seguinte fórmula: (P1 * 0.4) + (P2 * 0.6),
         * enquanto name for diferente de “sair” e informe para cada aluno:
         * ● Aprovado: Se Média >= 7.0
         * ● Reprovado: Se média < 4,0
         * ● Fazer PS: Se Média >= 4,0 e Média < 7,0
         *
         * Após usuário informar sair como name e encerrar o programa, informar o que se pede abaixo:
         * ● a maior nota final da turma
         * ● a média aritimética de notas finais
         * ● quantiade de alunos aprovados
         * ● quantidade de alunos reprovados
         * ● quantidade de alunos que precisam fazer ps
         */

        String name;
        double p1, p2, finalGrade, sumGrade = 0, highestGrade = 0, average = 0;
        int approvedQuantity = 0, disapprovedQuantity = 0, quantityPS = 0, totalQuantity = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = scan.nextLine();
        totalQuantity = 10;
        boolean sameNameExit = name.equals("out");

        while(!sameNameExit) {
            System.out.println("Enter a name P1: ");
            p1 = scan.nextDouble();

            System.out.println("Enter a name P2: ");
            p2 = scan.nextDouble();
            scan.nextLine();

            finalGrade = calculateGrade(p1, p2);

            if(finalGrade > highestGrade) {
                highestGrade = finalGrade;
            }

            sumGrade = sumGrade + finalGrade;

            if(finalGrade >= 7.0) {
                System.out.println("Status: approved");
                approvedQuantity++;
            }

            if(finalGrade < 4.0) {
                System.out.println("Status: disapproved");
                disapprovedQuantity++;
            }

            if(finalGrade >= 4.0 && finalGrade < 7 ) {
                System.out.println("Situação: Fazer PS");
                quantityPS++;
            }

            System.out.println("Informe o name do aluno: ");
            name = scan.nextLine();
            sameNameExit = name.equals("sair");
        }
        average = sumGrade / totalQuantity;
        System.out.println("average das notas: " + average);
        System.out.println("approved numbers: " + approvedQuantity);
        System.out.println("disapproved numbers: " + disapprovedQuantity);
        System.out.println("PS numbers: " + quantityPS);
        System.out.println("highest grade: " + highestGrade);
    }

    static double calculateGrade(double gradeTest1, double gradeTest2) {
        double grade = 0;

        grade = (gradeTest1 * 0.4) + (gradeTest2 * 0.6);
        return grade;
    }
}
