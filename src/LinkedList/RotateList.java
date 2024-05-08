package LinkedList;

import java.util.List;


/*
 * <metadata>
 * <name>Rotate List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/RotateLL.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/rotate-list/description/</url>
 * <date>2024-05-08</date>
 * <level>Medium</level>
 * <notes>No Notes Needed</notes>
 * <companies>Microsoft:Bloomberg</companies>
 * </metadata>
 * */
public class RotateList {

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

    public static ListNode rotateRight(ListNode head, int k) {
        int len = findLength(head);
        if(k==0 || len == 0 || k == len || k%len == 0) return head;
        k = k%len;
        int lastIndex = len - k;
        int iterator = 0;
        ListNode p1 = null;
        ListNode p2 = null;
        ListNode currNode = head;
        ListNode prevNode = null;
        while(iterator < lastIndex) {
            prevNode = currNode;
            currNode = currNode.next;
            iterator++;
        }
        if (prevNode != null) {
            prevNode.next = null;
        }
        p1 = head;
        p2 = currNode;

        while (currNode != null && currNode.next != null) {
            currNode = currNode.next;
        }
        if (currNode != null) currNode.next = p1;
        return p2;
    }

    public static int findLength(ListNode head){
        int count = 0;
        if(head == null) return count;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }


    public static void main(String args[]) {
        List<Integer> list = List.of(0,1,2);
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
        head = rotateRight(head, 4);
    }
}
