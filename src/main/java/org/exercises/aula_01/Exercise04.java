package org.exercises.aula_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Escrever um programa que receba vários números inteiros no teclado
e no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> listOfUserInputs = new ArrayList<>();
        int userInput;
        int averageValue = 0;
        int sumOfUserInputs = 0;

        do {
            System.out.println("Type an integer number: ");
            userInput=scanner.nextInt();
            if(userInput==0){
                break;
            }
            else if (userInput % 3 == 0) {
                listOfUserInputs.add(userInput);
                sumOfUserInputs=listOfUserInputs
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum();
                averageValue=sumOfUserInputs/ listOfUserInputs.size();
            }


        }while (userInput != 0);

        System.out.println("Average value from multiples of 3: " + averageValue );
    }
}
