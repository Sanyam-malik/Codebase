package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


/*
 * <metadata>
 * <name>Palindrome Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/PalindromeLL.png"></description>
 * <status>Needs Improvement</status>
 * <url>https://leetcode.com/problems/palindrome-linked-list/description/</url>
 * <date>2024-05-06</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Apple:Adobe:Yahoo:Amazon:Google:VMware:Intuit:Facebook:Microsoft:Bloomberg:ServiceNow</companies>
 * </metadata>
 * */
public class CheckPalindrome {

    static ListNode head = null;

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        Stack<Integer> stack = new Stack<>();

        while(current != null) {
            stack.push(current.val);
            current= current.next;
        }

        ListNode currNode = null;
        while(!stack.isEmpty()) {
            ListNode n =new ListNode(stack.pop());
            if (prev == null) {
                prev = n;
                currNode = prev;
            } else {
                currNode.next = n;
                currNode = currNode.next;
            }
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode reverse = reverseList(head);
        ListNode forward = head;

        while (forward != null && reverse != null) {
            if(forward.val != reverse.val) {
                return false;
            } else {
                forward = forward.next;
                reverse = reverse.next;
            }
        }
        return forward == null && reverse == null;
    }

    public static void main(String args[]) {
        List<Integer> list = List.of(1, 1, 2, 1);
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
        System.out.println(isPalindrome(head));
    }
}
