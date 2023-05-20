package org.exercises.aula_02;

import java.util.Collection;
import java.util.Scanner;

/*Escreva uma classe que Leia 5 nomes e notas de uma turma,
 calcula e exibe a média das notas da turma e em seguida exibe
  a relação de nomes cuja nota é superior a esta média.
   Utilize vetores para armazenar as notas.
 */
public class Exercicio01 {
    public static void main(String[] args) {

        float[] studentsGrade = new float[5];
        String[] studentsName = new String[5];
        int cont = 0;
        float classAverage = 0;
        float classGradeSum = 0;
        int[] studentsWithGradeAboveTheAverage = new int[5];

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Type your name :");
            studentsName[cont] = scanner.nextLine();
            System.out.println("Type your grade :");
            var studentGrade = Float.parseFloat(scanner.nextLine());
            studentsGrade[cont] = studentGrade;
            classGradeSum += studentGrade;
            classAverage = classGradeSum / studentsGrade.length;
            cont++;
        } while (cont < 5);

        System.out.println("Class average grade is: " + classAverage);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < studentsGrade.length; i++) {

            if (studentsGrade[i] > classAverage) {
                stringBuilder.append("\n student name: " + studentsName[i] + " Grade: " + studentsGrade[i]);
            }

        }
        System.out.println("Students with grade above average: " + stringBuilder);

    }
}
