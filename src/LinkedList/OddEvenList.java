package LinkedList;

import java.util.List;


/*
 * <metadata>
 * <name>Odd Even Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/OddEvenLL.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/odd-even-linked-list/description/</url>
 * <date>2024-05-16</date>
 * <level>Medium</level>
 * <notes>Use Two Pointers</notes>
 * <remarks>Good Question</remarks>
 * <companies>eBay:Adobe:Amazon:TikTok:Facebook</companies>
 * </metadata>
 * */
public class OddEvenList {

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

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode currOdd = odd;
        ListNode currEven = even;

        while (currEven != null){
            currOdd.next = currEven.next;
            currOdd = currOdd.next;
            currEven.next = currOdd.next;
            currEven = currEven.next;
        }
        currOdd.next = even;
        return odd;
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
        head = oddEvenList(head);

        System.out.println(head);
    }


}
