package org.exercises.aula_01;

/*
    Escreva um programa que crie um array de inteiros data
    e use um laço for para criar um novo String que exiba o conteúdo
    do array data entre chaves e separado por vírgulas.
    Por exemplo, se o array data tiver tamanho 4 e armazenar os valores
    3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.
 */
public class Exercise05 {
    public static void main(String[] args) {
        Integer[] data = {3, 4, 1, 5};
        StringBuilder stringBuilder = new StringBuilder("{");

        for (int i = 0; i < data.length; i++) {
            stringBuilder.append(data[i] + ",");
        }
        System.out.println(stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "}"));


    }
}
