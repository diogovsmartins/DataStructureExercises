package org.exercises.ap2_1;

public class Ap2Tests {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();

        System.out.println("Inserir um elemento no inicio da lista.");
        doublyLinkedList.insertNodeAtBeginning(23);
        doublyLinkedList.displayList();

        System.out.println("Inserir um elemento no fim da lista.");
        doublyLinkedList.insertNodeAtEnd(36);
        doublyLinkedList.displayList();

        System.out.println("Remover um elemento no inicio da lista.");
        doublyLinkedList.removeNodeAtBeginning();
        doublyLinkedList.displayList();

        System.out.println("Remover um elemento no fim da lista.");
        doublyLinkedList.removeNodeAtEnd();
        doublyLinkedList.displayList();

        System.out.println("Obter elemento que esta no elemento N da lista.");
        System.out.println(doublyLinkedList.getElementAtGivenPosition(30));

        System.out.println("Imprimir lista completa.");
        doublyLinkedList.displayList();

        System.out.println("Insira os valores [5, 8, 3, 2] no início da lista, nesta ordem.");
        doublyLinkedList.insertNodeAtBeginning(5);
        doublyLinkedList.insertNodeAtBeginning(8);
        doublyLinkedList.insertNodeAtBeginning(3);
        doublyLinkedList.insertNodeAtBeginning(2);
        doublyLinkedList.displayList();

        System.out.println("Insira o valor 7 no fim da lista.");
        doublyLinkedList.insertNodeAtEnd(7);
        doublyLinkedList.displayList();

        System.out.println("Remova o elemento que está no início da lista.");
        doublyLinkedList.removeNodeAtBeginning();
        doublyLinkedList.displayList();

        System.out.println("Obtenha o valor do elemento que está na posição 2 da lista.");
        System.out.println(doublyLinkedList.getElementAtGivenPosition(2));

        System.out.println("Remova o elemento que está no fim da lista");
        doublyLinkedList.removeNodeAtEnd();
        doublyLinkedList.displayList();

        System.out.println("Imprimir a lista inteira.");
        doublyLinkedList.displayList();

        System.out.println("Imprimir a lista inteira de trás pra frente.");
        doublyLinkedList.displayListInReverseOrder();

    }
}
