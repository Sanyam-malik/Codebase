package LinkedList;

import java.util.ArrayList;
import java.util.List;


/*
 * <metadata>
 * <name>Add Two Numbers</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/AddNumbersLL.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/add-two-numbers/description/</url>
 * <date>2024-05-08</date>
 * <level>Medium</level>
 * <notes>No Notes Needed</notes>
 * <companies>SAP:Uber:Visa:Apple:Adobe:Yahoo:Amazon:Google:Oracle:Huawei:Facebook:JPMorgan:Microsoft:Bloomberg:Capital One</companies>
 * </metadata>
 * */
public class AddTwoNumbers {

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

    public static ListNode addTwoNumbersDirectLL(ListNode l1, ListNode l2) {
        ListNode dummy  = new ListNode();
        ListNode begin = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int l1num = 0;
            int l2num = 0;
            if(l1!=null){
                l1num = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                l2num = l2.val;
                l2 = l2.next;
            }

            int sum = l1num + l2num + carry;
            int digit = sum%10;
            carry = sum/10;


            ListNode newNode = new ListNode(digit);
            dummy.next = newNode;
            dummy = dummy.next;
        }

        return begin.next;
    }

    public static ListNode addTwoNumbersUsingLists(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }

        List<Integer> list2 = new ArrayList<>();
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }

        List<Integer> list3 = new ArrayList<>();
        int carry = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < list1.size() && p2 < list2.size()) {
            int i1 = list1.get(p1);
            int i2 = list2.get(p2);
            int sum = i1+i2+carry;
            carry = sum/10;
            list3.add(sum%10);
            p1++;p2++;
        }

        while (p1 < list1.size()) {
            int sum = list1.get(p1)+carry;
            carry = sum/10;
            list3.add(sum%10);
            p1++;
        }

        while (p2 < list2.size()) {
            int sum = list2.get(p2)+carry;
            carry = sum/10;
            list3.add(sum%10);
            p2++;
        }

        if(carry > 0) {
            list3.add(carry);
        }

        ListNode newHead = null;
        ListNode currNode = newHead;
        for(int i:list3) {
            ListNode n = new ListNode(i);
            if(newHead == null) {
                newHead = n;
                currNode = newHead;
            } else {
                currNode.next = n;
                currNode = currNode.next;
            }
        }
        return newHead;
    }


    public static void main(String args[]) {
        ListNode head1 = null;
        ListNode head2 = null;

        ListNode currNode = head1;
        for(int i: List.of(2,4,3)) {
            ListNode n = new ListNode(i);
            if(head1 != null) {
                currNode.next = n;
                currNode = n;
            } else {
                head1 = n;
                currNode = head1;
            }
        }

        currNode = head2;
        for(int i: List.of(5,6,4)) {
            ListNode n = new ListNode(i);
            if(head2 != null) {
                currNode.next = n;
                currNode = n;
            } else {
                head2 = n;
                currNode = head2;
            }
        }
        ListNode head = addTwoNumbersDirectLL(head1, head2);
        System.out.println(head);
    }
}
