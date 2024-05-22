package LinkedList;

import java.util.List;

/*
 * <metadata>
 * <name>Reverse Linked List (Experimental)</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReverseLL.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/reverse-linked-list/description/</url>
 * <date>2024-05-22</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Apple:Amazon:Google:Yandex:Intuit:Nvidia:Facebook:Microsoft:Bloomberg</companies>
 * </metadata>
 * */
public class ReverseLLExperimental {

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
        ListNode current = head;
        ListNode stack = null;

        while(current != null) {
            ListNode next = current.next;
            if (stack != null) {
                ListNode oldHead = stack;
                current.next = oldHead;
            } else {
                current.next = null;
            }
            stack = current;
            current = next;
        }
        return stack;
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
