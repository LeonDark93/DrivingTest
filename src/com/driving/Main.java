package com.driving;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Test test;
        int questionIndex = 1;
        System.out.print("Введите номер билета ： ");
        test = new Test(input.nextInt());
        System.out.println();
        while(questionIndex<=20){
            System.out.print("Ответ на "+questionIndex+" вопрос : ");
            test.setAnswer(input.nextInt());
            questionIndex++;
            System.out.println("");

        }

        AnswersChecker answersChecker = new AnswersChecker();
        TestResult result = answersChecker.check(test);
        System.out.println("Ваш результат = "+result.getPercent());
    }

}

// TODO: Найти проблемы в программе и решить
//  TODO   реализовать возможность изменение ответов
