package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/*
 * <metadata>
 * <name>Reverse Nodes in k-Group</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReverseNodesinKGroup.png"></description>
 * <status>Needs Improvement(Solution added)</status>
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

    static ListNode reverseLinkedList(ListNode head) {
        /*
         * Initialize 'temp' at
         * head of linked list
         */
        ListNode temp = head;

        /*
         * Initialize pointer 'prev' to NULL,
         * representing the previous node
         */
        ListNode prev = null;

        /*
         * Traverse the list, continue till
         * 'temp' reaches the end (NULL)
         */
        while(temp != null){
            /*
             * Store the next node in
             * 'front' to preserve the reference
             */
            ListNode front = temp.next;

            /*
             * Reverse the direction of the
             * current node's 'next' pointer
             * to point to 'prev'
             */
            temp.next = prev;

            /*
             * Move 'prev' to the current
             * node for the next iteration
             */
            prev = temp;

            /*
             * Move 'temp' to the 'front' node
             * advancing the traversal
             */
            temp = front;
        }

        /*
         * Return the new head of
         * the reversed linked list
         */
        return prev;

    }

    /*
     * Function to get the Kth node from
     * a given position in the linked list
     */
    static ListNode getKthNode(ListNode temp, int k) {
        /*
         * Decrement K as we already
         * start from the 1st node
         */
        k -= 1;

        /*
         * Decrement K until it reaches
         * the desired position
         */
        while (temp != null && k > 0) {
            /*
             * Decrement k as temp progresses
             */
            k--;

            /*
             * Move to the next node
             */
            temp = temp.next;
        }

        /*
         * Return the Kth node
         */
        return temp;
    }

    /*
     * Function to reverse nodes in groups of K
     */
    static ListNode kReverse(ListNode head, int k) {
        /*
         * Initialize a temporary
         * node to traverse the list
         */
        ListNode temp = head;

        /*
         * Initialize a pointer to track the
         * last node of the previous group
         */
        ListNode prevLast = null;

        /*
         * Traverse through the linked list
         */
        while (temp != null) {

            /*
             * Get the Kth node of the current group
             */
            ListNode kThNode = getKthNode(temp, k);

            /*
             * If the Kth node is NULL
             * (not a complete group)
             */
            if (kThNode == null) {

                /*
                 * If there was a previous group,
                 * link the last node to the current node
                 */
                if (prevLast != null) {
                    prevLast.next = temp;
                }

                /*
                 * Exit the loop
                 */
                break;
            }

            /*
             * Store the next node
             * after the Kth node
             */
            ListNode nextNode = kThNode.next;

            /*
             * Disconnect the Kth node
             * to prepare for reversal
             */
            kThNode.next = null;

            /*
             * Reverse the nodes from
             * temp to the Kth node
             */
            reverseLinkedList(temp);

            /*
             * Adjust the head if the reversal
             * starts from the head
             */
            if (temp == head) {
                head = kThNode;
            } else {
                /*
                 * Link the last node of the previous
                 * group to the reversed group
                 */
                prevLast.next = kThNode;
            }

            /*
             * Update the pointer to the
             * last node of the previous group
             */
            prevLast = temp;

            /*
             * Move to the next group
             */
            temp = nextNode;
        }

        /*
         * Return the head of the
         * modified linked list
         */
        return head;
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
