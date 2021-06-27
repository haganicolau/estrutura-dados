package com.datastructure.introduction;

public class ExplanationVariables {
    public static void main(String [] args) {
        /*Variables: */
        int variableInteger = 12;
        float variableFloat = 1.5F;
        double variableDouble = 1.5;
        char variableChar = 'c';
        boolean variableBoolean = true;

        String variableString = "Text";

        /*arithmetic operators: */
        int response, number1, number2, answerSum;
        response = 10 + 5;
        number1 = 150;
        number2 = 2;

        answerSum = number1 + number2;
        int answerSubration = number1 - number2;
        int answerMultiplication = number1 * number2;
        int answerDivision = number1 / number2;
        int remainderDivision = number1%number2;
        double power = Math.pow(number1, number2);

        System.out.println(answerSum);
        System.out.println(answerSubration);
        System.out.println(answerMultiplication);
        System.out.println(answerDivision);
        System.out.println(remainderDivision);
        System.out.println(power);
    }
}
