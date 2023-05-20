package org.exercises.aula_07;

public class LinkedListExercises {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedListExercises().new LinkedList();
        linkedList.testLinkedListClass();
    }

    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public class LinkedList{
        public Node head;
        public Node tail;
        public int size;

        public LinkedList(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void add(int value){
            Node newNode = new Node(value);
            if(this.head == null){
                this.head = newNode;
                this.tail = newNode;
            }else{
                this.tail.next = newNode;
                this.tail = newNode;
            }
            this.size++;
        }

        public void remove(int value){
            Node currentNode = this.head;
            Node previousNode = null;
            while(currentNode != null){
                if(currentNode.value == value){
                    if(previousNode == null){
                        this.head = currentNode.next;
                    }else{
                        previousNode.next = currentNode.next;
                    }
                    this.size--;
                    return;
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        public void print(){
            Node currentNode = this.head;
            while(currentNode != null){
                System.out.println(currentNode.value);
                currentNode = currentNode.next;
            }
        }

        public void testLinkedListClass(){
            LinkedList linkedList = new LinkedList();
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.add(5);
            linkedList.print();
            linkedList.remove(3);
            System.out.println("\nPrint after removing 3\n");
            linkedList.print();
        }
    }
}