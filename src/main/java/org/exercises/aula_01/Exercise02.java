package org.exercises.aula_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Solicitar a idade de um número indefinido de pessoas e
 imprimir a média de idade lidas. O programa se encerra
  quando a média de idade for superior a 20 anos ou que tenha lido 10 pessoas.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double averageAge;
        List<Integer> listOfPersonsThatAnsweredTheirAge=new ArrayList<>();



        for (int i=0; i<10; i++){
            System.out.println("Type your age: ");
            listOfPersonsThatAnsweredTheirAge.add(scanner.nextInt());

            float totalAge=listOfPersonsThatAnsweredTheirAge
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            averageAge=totalAge/listOfPersonsThatAnsweredTheirAge.size();
            System.out.println(
                    "Average age of the persons that answered the survey: "
                    + averageAge +", number of persons that answered: "
                    + listOfPersonsThatAnsweredTheirAge.size());

            if (averageAge>20) break;
        }
    }
}
