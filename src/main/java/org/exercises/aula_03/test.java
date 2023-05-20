package org.exercises.aula_03;

import java.util.Stack;

public class test {
        public static boolean isBalanced(String input) {
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            System.out.println(isBalanced("(())()"));
        }

}
