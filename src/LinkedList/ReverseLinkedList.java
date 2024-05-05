package LinkedList;

import java.util.List;

/*
 * <metadata>
 * <name>Reverse Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReverseLL.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/reverse-linked-list/description/</url>
 * <date>2024-05-06</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Apple:Amazon:Google:Yandex:Intuit:Nvidia:Facebook:Microsoft:Bloomberg</companies>
 * </metadata>
 * */
public class ReverseLinkedList {

    static ListNode head = null;

    public static class ListNode {
        int val;
        ListNode next;
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
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String args[]) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListNode currNode = head;
        for(int i: list) {
            ListNode n = new ListNode(i);
            if(head != null) {
                currNode.next = n;
                currNode = n;
            } else {
                head = n;
                currNode = head;
            }
        }
        head = reverseList(head);
    }

}
