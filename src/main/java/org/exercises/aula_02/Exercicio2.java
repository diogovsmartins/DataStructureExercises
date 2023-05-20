package org.exercises.aula_02;

import java.util.stream.Stream;

/*Leia um conjunto de notas, cuja quantidade seja determinada pelo
 usuário. Calcule a média de todas elas. Exiba o conjunto das
 notas maiores do que a média calculada. Em seguida, de forma
 agrupada, exiba o outro conjunto de notas (menores do que a média).Utilize vetores
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(3);
        stack.push(2);
        stack.pop();
        stack.push(30);
        stack.pop();
        stack.push(7);
        stack.push(120);
        Stream.of(stack.list)
                .forEach(System.out::println);
        Integer[] aray=new Integer[2];
        var valor=aray[19];
       // var value=stack.pop();
        //System.out.println(value);
//        System.out.println(stack.size());


    }

    public static class Stack {
        private int stackSize=1;
        private int top=-1;
        private Integer[] list=new Integer[stackSize];

        public Integer[] push(Integer numberToAdd){
            this.list[++this.top]=numberToAdd;
            grow();
            return this.list;
        }

        private void grow(){
            Integer[] temporaryList = new Integer[++stackSize];
            for (int i=0; i<list.length; i++){
                temporaryList[i]=this.list[i];
            }
            this.list=temporaryList;
        }

        private void shrink(){

            Integer[] temporaryList = new Integer[--stackSize];
            for (int i=0; i<temporaryList.length; i++){
                temporaryList[i]=this.list[i];
            }
            temporaryList[temporaryList.length-1]=null;
            this.list=temporaryList;
        }

        public Integer[] pop(){
            --this.top;
            shrink();
            return list;
        }
    }
}
