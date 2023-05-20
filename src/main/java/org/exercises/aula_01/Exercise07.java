package org.exercises.aula_01;
/*
    Crie uma classe que armazena os 12 meses do ano em um array.
    A seguir, gere um valor randômico entre 0 e 11 e apresente
    o mês correspondente ao valor sorteado. Considere que o valor
    0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.
 */

import java.util.Random;

public class Exercise07 {
    public static void main(String[] args) {
        String[] months={
            "JANUARY", "FEBRUARY", "MARCH", "APRIL",
                "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        Random random=new Random();
        System.out.println(months[random.nextInt(12)]);
    }
}
