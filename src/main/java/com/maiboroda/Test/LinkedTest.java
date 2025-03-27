package com.maiboroda.Test;

public class LinkedTest {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(52);
        Node third = new Node(69);

        head.next = second;
        second.next = third;

        System.out.println(getValueByIndex(0, head));
        System.out.println(getValueByIndex(1, head));
        System.out.println(getValueByIndex(2, head));
    }

    public static Object getValueByIndex(int index, Node head) {
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
            return current.value;
        }
        return null;

//        return null;
//        if (index == 0) {
//            return head.value;
//        } else if (index == 1) {
//            Node current = head.next;
//            return current.value;
//        } else if (index == 2) {
//            Node current = head.next.next;
//            return current.value;
//        }
//        return null;
   }

}
