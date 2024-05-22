package LinkedList;

import java.util.List;

/*
 * <metadata>
 * <name>Merge Two Sorted Lists</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MergeLL.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/merge-two-sorted-lists/description/</url>
 * <date>2024-05-23</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Good Question</remarks>
 * <companies>Uber:Adobe:Amazon:Oracle:Google:Shopee:Facebook:Microsoft:Bloomberg:Accenture</companies>
 * </metadata>
 * */
public class MergeLL {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.val);
            ListNode next = this.next;
            while(next != null) {
                sb.append("->");
                sb.append(next.val);
                next = next.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode dummy = head;

        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1 != null && curr2 != null) {
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;

            if(curr1.val <= curr2.val) {
                curr1.next = null;
                dummy.next = curr1;
                curr1 = next1;
            } else {
                curr2.next = null;
                dummy.next = curr2;
                curr2 = next2;
            }
            dummy = dummy.next;
        }

        if (curr1 != null) {
            dummy.next = curr1;
        }

        if (curr2 != null) {
            dummy.next = curr2;
        }
        return head.next;
    }

    public static void main(String args[]) {
        ListNode head1 = new ListNode();
        ListNode d1 = head1;
        ListNode head2 = new ListNode();
        ListNode d2 = head2;

        for(int i: List.of(1, 2, 4)) {
            d1.next = new ListNode(i);
            d1 = d1.next;
        }

        for(int i: List.of(1, 3, 4)) {
            d2.next = new ListNode(i);
            d2 = d2.next;
        }

        ListNode head = mergeTwoLists(head1.next, head2.next);
        System.out.println(head);
    }
}
