package org.exercises.aula_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Elabore uma classe que receba 5 notas de alunos por meio,
    armazene essas notas em um array de cinco elementos,
    apresente em tela as cinco notas em ordem decrescente
    (da maior para a menor) e a média aritmética das notas.
 */
public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Float> studentsGrade=new ArrayList<>();

        for (int i=0; i<5; i++){
            System.out.println("Add the grade for student "+i+": ");
            studentsGrade.add(scanner.nextFloat());
            studentsGrade=studentsGrade
                    .stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        }
       Double classGrade= studentsGrade.stream().mapToDouble(Float::doubleValue).sum();
        System.out.println(
                "List of grades in decreasing order: "
                        + studentsGrade+"," +
                        " class average grade: "+(classGrade/studentsGrade.size()));
    }
}
