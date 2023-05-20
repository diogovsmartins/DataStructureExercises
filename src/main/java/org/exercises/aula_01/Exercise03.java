package org.exercises.aula_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Escrever um programa que leia, valores inteiros, até ser lido o valor-99.
 Quando isso acontecer, o programa deverá escrever a soma e a média dos valores lidos.
*/
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> listOfUserInputs = new ArrayList<>();
        int userInput;
        int averageValue = 0;
        int sumOfUserInputs = 0;

        do {
            System.out.println("Type an integer number, if you want to stop type -99: ");
            userInput=scanner.nextInt();
            if (userInput==-99) break;
            listOfUserInputs.add(userInput);

            sumOfUserInputs=listOfUserInputs
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            averageValue=sumOfUserInputs/ listOfUserInputs.size();
        }while (userInput != -99);

        System.out.println("Average value: " + averageValue + ", sum of all inputs: "+ sumOfUserInputs);
    }
}
