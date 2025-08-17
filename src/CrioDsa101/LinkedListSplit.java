package CrioDsa101;

import java.util.ArrayList;
import java.util.List;


public class LinkedListSplit {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    List<ListNode> linkedListSplit(ListNode head){
        ListNode oddHead = null , oddTail = null;
        ListNode evenHead = null , evenTail = null;

        while(head != null){
            if (head.data % 2 == 0){
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }

        if (oddTail != null) {
            oddTail.next = null; // Terminate the odd list
        }
        if (evenTail != null) {
            evenTail.next = null; // Terminate the even list
        }

        // Prepare the result
        List<ListNode> result = new ArrayList<>();
        result.add(oddHead); // head of odd list
        result.add(evenHead); // head of even list

        return result;
    }

    public static void main(String[] args) {
        LinkedListSplit splitter = new LinkedListSplit();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Split the linked list
        List<ListNode> result = splitter.linkedListSplit(head);

        // Print the odd list
        System.out.print("Odd List: ");
        ListNode oddHead = result.getFirst();
        while (oddHead != null) {
            System.out.print(oddHead.data + " ");
            oddHead = oddHead.next;
        }
        System.out.println();

        // Print the even list
        System.out.print("Even List: ");
        ListNode evenHead = result.get(1);
        while (evenHead != null) {
            System.out.print(evenHead.data + " ");
            evenHead = evenHead.next;
        }
    }
}
