package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


/*
 * <metadata>
 * <name>Palindrome Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/PalindromeLL.png"></description>
 * <status>Completed</status>
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

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow.next); // reverse second list
        slow.next = null;
        while(rev != null) {
            if(head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
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
