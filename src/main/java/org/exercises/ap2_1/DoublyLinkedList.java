package org.exercises.ap2_1;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public void insertNodeAtEnd(final int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insertNodeAtBeginning(final int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
    }

    public void removeNodeAtEnd() {
        if (tail == null) {
            System.out.println("List is empty. Nothing to remove.");

        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
    }

    public void removeNodeAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove.");

        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrevious(null);
        }
    }

    public void insertElementAtGivenPosition(final int desiredIndex, final int data) {
        Node nodeToBeInserted = new Node(data);
        Node previousNode = getElementAtGivenPosition(desiredIndex);
        if (previousNode == null) return;
        Node nextNode = previousNode.getNext();
        nodeToBeInserted.setNext(nextNode);
        nodeToBeInserted.setPrevious(previousNode);

        previousNode.setNext(nodeToBeInserted);
        nextNode.setPrevious(nodeToBeInserted);

    }

    public void displayList() {
        Node currentNode = head;
        StringBuilder listOfNodes = new StringBuilder();
        while (currentNode != null) {
            listOfNodes.append(currentNode.getData()).append(" ");
            currentNode = currentNode.getNext();
        }
        System.out.println(listOfNodes);
    }

    public void displayListInReverseOrder() {
        Node currentNode = head;
        StringBuilder listOfNodes = new StringBuilder();
        while (currentNode != null) {
            listOfNodes.append(currentNode.getData()).append(" ");
            currentNode = currentNode.getNext();
        }
        System.out.println(listOfNodes.reverse().delete(0, 1));
    }

    public Node getElementAtGivenPosition(final int desiredIndex) {
        int currentNodeIndex = 0;
        Node nodeAtCurrentIndex = head;
        if (desiredIndex <= 0) return nodeAtCurrentIndex;
        do {
            try {
                nodeAtCurrentIndex = nodeAtCurrentIndex.getNext();
            } catch (Exception e) {
                e.getMessage();
                System.out.println("Index doesn't exist");
            }
            currentNodeIndex++;
        } while (desiredIndex != currentNodeIndex && nodeAtCurrentIndex != null);
        return nodeAtCurrentIndex;
    }

    public List<Integer> getElementsToBeSorted(final int startingNode, final int endingNode) {
        Node currentNode = getElementAtGivenPosition(startingNode);
        if (currentNode == null) return null;
        List<Integer> doublyLinkedList = new ArrayList<>();

        for (int i = 0; i <= endingNode; i++) {
            doublyLinkedList.add(currentNode.getData());
            if (currentNode.getNext() != null) currentNode = currentNode.getNext();
        }

        return doublyLinkedList;
    }

    public DoublyLinkedList sortLinkedListInDescendingOrder(final int startingNode, final int endingNode) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        List<Integer> elementsToBeSorted = getElementsToBeSorted(startingNode, endingNode);
        selectionSort(elementsToBeSorted);

        elementsToBeSorted
                .stream()
                .forEach(integerValue -> doublyLinkedList.insertNodeAtEnd(integerValue));

        return doublyLinkedList;
    }

    public DoublyLinkedList sortLinkedListInAscendingOrder(final int startingNode, final int endingNode) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        List<Integer> elementsToBeSorted = getElementsToBeSorted(startingNode, endingNode);
        insertionSort(elementsToBeSorted);

        elementsToBeSorted
                .stream()
                .forEach(integerValue -> doublyLinkedList.insertNodeAtEnd(integerValue));

        return doublyLinkedList;
    }

    public void selectionSort(final List<Integer> arrayToBeSorted) {
        int n = arrayToBeSorted.size();

        for (int i = 0; i < n - 1; i++) {
            int indexOfTheLowestValue = i;
            for (int j = i + 1; j < n; j++) {
                if (arrayToBeSorted.get(j) > arrayToBeSorted.get(indexOfTheLowestValue)) {
                    indexOfTheLowestValue = j;
                }
            }
            swap(arrayToBeSorted, i, indexOfTheLowestValue);
        }
    }

    private void swap(final List<Integer> arrayBeingSorted, final int currentIndex, final int indexOfTheLowestValue) {
        int temp = arrayBeingSorted.get(currentIndex);
        arrayBeingSorted.set(currentIndex, arrayBeingSorted.get(indexOfTheLowestValue));
        arrayBeingSorted.set(indexOfTheLowestValue, temp);
    }

    public void insertionSort(final List<Integer> arrayToBeSorted) {
        for (int i = 1; i < arrayToBeSorted.size(); ++i) {
            int key = arrayToBeSorted.get(i);
            int j = i - 1;

            while (j >= 0 && arrayToBeSorted.get(j) > key) {
                arrayToBeSorted.set(j + 1, arrayToBeSorted.get(j));
                j = j - 1;
            }

            arrayToBeSorted.set(j + 1, key);
        }
    }
}
