package LinkedList;

import java.util.List;


/*
 * <metadata>
 * <name>Remove Nth Node From End of List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/RemoveNthNode.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/</url>
 * <date>2024-05-07</date>
 * <level>Medium</level>
 * <notes>No Notes Needed</notes>
 * <companies>Uber:Apple:Amazon:Google:Facebook:Microsoft:Bloomberg:Walmart Global Tech</companies>
 * </metadata>
 * */
public class RemoveNthNode {

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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int i = 0, traverseTill = length - n - 1;
        if(traverseTill == -1) return head.next;
        ListNode curr = head;
        while(i < traverseTill){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
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
        List<Integer> list = List.of(1);
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
        head = removeNthFromEnd(head, 2);
    }
}
