package org.exercises.ap2_2;

import org.exercises.ap2_1.DoublyLinkedList;

public class Ap2_2_Tests {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertNodeAtEnd(33);
        doublyLinkedList.insertNodeAtBeginning(5);
        doublyLinkedList.insertNodeAtEnd(10);
        doublyLinkedList.insertNodeAtBeginning(3);
        doublyLinkedList.insertNodeAtEnd(7);
        doublyLinkedList.insertElementAtGivenPosition(3,26);
        doublyLinkedList.displayList();

        DoublyLinkedList sortedLinkedList = doublyLinkedList.sortLinkedListInDescendingOrder (0, 5);
        sortedLinkedList.displayList();

        sortedLinkedList = doublyLinkedList.sortLinkedListInAscendingOrder (0, 5);
        sortedLinkedList.displayList();
    }

}
