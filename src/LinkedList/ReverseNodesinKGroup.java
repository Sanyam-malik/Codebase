package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



/*
 * <metadata>
 * <name>Reverse Nodes in k-Group</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReverseNodesinKGroup.png"></description>
 * <status>Needs Improvement</status>
 * <url>https://leetcode.com/problems/reverse-nodes-in-k-group/description/</url>
 * <date>2024-05-22</date>
 * <level>Hard</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/lIar1skcQYI?si=_B_4_q2oekik1IkE" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>Good Question</remarks>
 * <companies>Zoom:Yahoo:Amazon:Google:Facebook:Microsoft:Bloomberg:ByteDance:Capital One</companies>
 * </metadata>
 * */
public class ReverseNodesinKGroup {

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

    public static ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();

        ListNode newHead = new ListNode();
        ListNode dummy = newHead;
        ListNode curr = head;
        int iterator = 0;

        while(curr != null) {
            if(iterator - (k) == 0) {
                while(iterator >= 0 && !stack.isEmpty()) {
                    ListNode n = stack.pop();
                    n.next = null;
                    dummy.next = n;
                    dummy = dummy.next;
                    iterator--;
                }
            }
            stack.push(curr);
            iterator++;
            curr = curr.next;
        }


        if(iterator - (k) == 0) {
            while(iterator >= 0 && !stack.isEmpty()) {
                ListNode n = stack.pop();
                n.next = null;
                dummy.next = n;
                dummy = dummy.next;
                iterator--;
            }
        }

        Stack<ListNode> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        while(!temp.isEmpty()) {
            ListNode n = temp.pop();
            n.next = null;
            dummy.next = n;
            dummy = dummy.next;
        }
        return newHead.next;
    }

    public static void main(String args[]) {
        List<Integer> list = List.of(1, 2);
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
        head = reverseKGroup(head, 2);
    }

}
