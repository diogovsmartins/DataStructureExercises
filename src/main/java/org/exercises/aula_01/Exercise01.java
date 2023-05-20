package org.exercises.aula_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Solicitar a idade de um número indefinido de  pessoas
e imprimir a média de idade lidas. O programa se encerra
 quando a média de idade for superior a 20 anos.
 */
public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double averageAge;

        List<Integer> arrayWithAges = new ArrayList<>();

        do{
            System.out.println("Type the an age: ");
            arrayWithAges.add(scanner.nextInt());
            float totalAge=arrayWithAges
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            averageAge=totalAge / arrayWithAges.size();
            System.out.println("Average age is: " + averageAge);

        }while (averageAge < 20);

    }
}
