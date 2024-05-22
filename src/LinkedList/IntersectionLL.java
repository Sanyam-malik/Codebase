package LinkedList;

import java.util.List;

/*
 * <metadata>
 * <name>Intersection of Two Linked Lists</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/IntersectionLL.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/intersection-of-two-linked-lists/description/</url>
 * <date>2024-05-23</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Good Question</remarks>
 * <companies>Adobe:Amazon:Nvidia:TikTok:Airbnb:LinkedIn:Facebook:Microsoft</companies>
 * </metadata>
 * */
public class IntersectionLL {

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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        if(headA == null || headB == null) return null;
        while (ptrA != ptrB) {
            if(ptrA == null) {
                ptrA = headB;
            } else {
                ptrA = ptrA.next;
            }
            if(ptrB == null) {
                ptrB = headA;
            } else {
                ptrB = ptrB.next;
            }
        }
        return ptrA;
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

        ListNode head = getIntersectionNode(head1.next, head2.next);
        System.out.println(head);
    }
}
