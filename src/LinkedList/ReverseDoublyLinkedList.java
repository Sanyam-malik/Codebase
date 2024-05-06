package LinkedList;

import java.util.List;


/*
 * <metadata>
 * <name>Reverse a Doubly Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReverseDoublyLL.png"></description>
 * <status>Try Again</status>
 * <url>https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1</url>
 * <date>2024-05-06</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>DEShaw:Adobe</companies>
 * </metadata>
 * */
public class ReverseDoublyLinkedList {

    static ListNode head = null;

    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }


    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            current.prev = nextNode;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static void main(String args[]) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListNode currNode = head;
        ListNode prevNode = null;
        for(int i: list) {
            ListNode n = new ListNode(i);
            if(head != null) {
                prevNode = currNode;
                currNode.next = n;
                n.prev = prevNode;
                currNode = n;
            } else {
                head = n;
                currNode = head;
            }
        }

        head = reverseList(head);
        System.out.println(head);
    }
}
