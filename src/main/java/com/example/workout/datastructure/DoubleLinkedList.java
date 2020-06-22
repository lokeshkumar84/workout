package com.example.workout.datastructure;

public class DoubleLinkedList{


    private static Node head;
    private static Node tail;

    private static void addFirstNode(int data){

        Node node = new Node(data);

        if(head == null){
            head =  node;
            tail = node;
        }else{
            node.setNext(head);
            head.setBefore(node);
            head = node;
        }
    }

    private static void addLastNode(int data){
        Node node = new Node(data);

        if(tail == null){
            head =  node;
            tail = node;
        }else{
            node.setBefore(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    private static void addAfterNode(int input, int data){

        Node node = new Node(data);
        if(head != null){
            Node nodeTraverse = head;
            Node next;
            Node before;
            while(nodeTraverse != null){
                if(nodeTraverse.getData() == input){
                    before = nodeTraverse;
                    next = before.getNext();
                    node.setNext(next);
                    node.setBefore(before);
                    before.setNext(node);
                    next.setBefore(node);
                    break;
                }else{
                    nodeTraverse = nodeTraverse.getNext();
                }
            }
        }else{
            System.out.println("Invalid operation - it's empty");
        }
    }


    private static void addBeforeNode(int input, int data){

        Node node = new Node(data);
        if(head != null){
            Node nodeTraverse = head;
            Node next;
            Node before;
            while(nodeTraverse != null){

                if(nodeTraverse.getData() == input){
                    before = nodeTraverse.getBefore();
                    next = before.getNext();
                    node.setNext(next);
                    node.setBefore(before);
                    before.setNext(node);
                    next.setBefore(node);
                    break;
                }else{
                    nodeTraverse = nodeTraverse.getNext();
                }
            }
        }else{
            System.out.println("Invalid operation - it's empty");
        }
    }

    private static void removeNode(int data){

        Node node = head;
        Node before;
        Node next;
        while(node != null){
            if(node.getData() == data){
                next = node.getNext();
                before = node.getBefore();
                next.setBefore(before);
                before.setNext(next);
                break;
            }
            node = node.getNext();
        }

    }


    private static void traverseForward(){
        Node node;
        if(head != null && tail != null){
            node = head;
            while(node != null){
                System.out.println(node.getData());
                node = node.getNext();
            }
        }
    }

    private static void traverseBackward(){
        Node node;
        if(head != null && tail != null){
            node = tail;
            while(node != null){
                System.out.println(node.getData());
                node = node.getBefore();
            }
        }
    }




    public static void main(String arg[]){

        /*
        insertion:
        1) At the front of the DLL
        2) After a given node.
        3) At the end of the DLL
        4) Before a given node.
         */

        /*
        Remove:
        1) Remove first
        2) Remove last
        3) Remove by value.
         */

        addFirstNode(1);
        addLastNode(4);
        addAfterNode(1,3);
        addAfterNode(9,6);
        addAfterNode(1,7);
        addBeforeNode(3,11);
        addBeforeNode(11,10);
        addAfterNode(11,12);
        addFirstNode(0);
        addLastNode(5);

        //removeFirstNode();
        //removeLastNode();
        removeNode(11);
        removeNode(10);

        System.out.println("-----forward------");
        traverseForward();
        System.out.println("-----backward------");
        traverseBackward();

    }
}
