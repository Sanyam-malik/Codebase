package LinkedList;



/*
 * <metadata>
 * <name>Middle of the Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MiddleofLinkedList.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/middle-of-the-linked-list/description/</url>
 * <date>2024-05-21</date>
 * <level>Easy</level>
 * <notes>Fast and Slow Pointers</notes>
 * <remarks>Good Question</remarks>
 * <companies>Adobe:Apple:Amazon:Google:Facebook:Qualcomm:Microsoft</companies>
 * </metadata>
 * */
public class MiddleofLinkedList {

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

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
