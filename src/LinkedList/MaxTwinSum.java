package LinkedList;

import java.util.ArrayList;
import java.util.List;

/*
 * <metadata>
 * <name>Maximum Twin Sum of a Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MaxTwinSum.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/</url>
 * <date>2024-05-09</date>
 * <level>Medium</level>
 * <notes>No Notes Needed</notes>
 * <companies>Amazon</companies>
 * </metadata>
 * */
public class MaxTwinSum {

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

    public static int pairSum(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        int n = arr.size();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n/2;i++) {
            int j = n-i-1;
            int elem1 = arr.get(i);
            int elem2 = arr.get(j);
            max = Math.max(max, elem1+elem2);
        }
        return max;
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSumOptimized(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        int maxsum=Integer.MIN_VALUE;
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode p1=head;
        ListNode p2=slow.next;
        while(p2!=null){
            int sum=p1.val + p2.val ;
            if(maxsum<sum){
                maxsum=sum;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return maxsum;
    }

    public static void main(String args[]) {
        List<Integer> list = List.of(5, 4, 2, 1);
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
        System.out.println(pairSum(head));
    }
}
