package LinkedList;

import java.util.ArrayList;
import java.util.List;



/*
 * <metadata>
 * <name>Merge Nodes in Between Zeros</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MergeBwZeroesLL.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/merge-nodes-in-between-zeros/description/</url>
 * <date>2024-05-16</date>
 * <level>Medium</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Good Question</remarks>
 * <companies>Microsoft</companies>
 * </metadata>
 * */
public class MergeNodesInBetweenZeroes {

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

    public static ListNode mergeNodes(ListNode head) {
        if(head.val ==0 && head.next.val == 0) {
            return new ListNode();
        }

        ListNode newHead = new ListNode();
        ListNode newHeadCurr = newHead;
        ListNode currNode = head.next;
        int sumSOFar = 0;
        while(currNode != null) {
            if(currNode.val == 0) {
                newHeadCurr.next = new ListNode(sumSOFar);
                newHeadCurr = newHeadCurr.next;
                sumSOFar = 0;
            } else {
                sumSOFar += currNode.val;
            }
            currNode = currNode.next;
        }
        return newHead.next;
    }

    public static ListNode mergeNodesUsingSpace(ListNode head) {
        List<Integer> list= new ArrayList<Integer>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr= curr.next;
        }

        ListNode newHead = new ListNode();
        ListNode newCurr = newHead;
        int sumSoFar = 0;
        for(Integer i: list) {
            if(i == 0) {
                if (sumSoFar > 0) {
                    newCurr.next = new ListNode(sumSoFar);
                    newCurr = newCurr.next;
                    sumSoFar = 0;
                }
            } else {
                sumSoFar +=i;
            }
        }
        return newHead.next;
    }

    public static void main(String args[]) {
        List<Integer> list = List.of(0,3,1,0,4,5,2,0);
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
        head = mergeNodes(head);

        System.out.println(head);
    }

}
