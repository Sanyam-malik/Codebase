package Stacks;

import java.util.Stack;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/redundant-brackets_975473,
 *   Date:- 2023-12-03
 * </metadata>
 * */
public class PalindromeLinkedList {

    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> currNode = head;
        Stack<Integer> stack = new Stack<>();
        while(currNode != null) {
            stack.push(currNode.data);
            currNode = currNode.next;
        }

        currNode = head;
        while(currNode != null) {
            if(stack.peek() == currNode.data) stack.pop();
            else return false;
            currNode = currNode.next;
        }
        return stack.isEmpty();
    }

    private static int getSize(LinkedListNode<Integer> head) {
        int size = 0;
        while(head.next != null) {
            head = head.next;
            size+=1;
        }
        size+=1;
        return size;
    }

    public static void main(String args[]) {
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        head.next = new LinkedListNode<>(2);
        head.next.next = new LinkedListNode<>(3);
        head.next.next.next = new LinkedListNode<>(2);
        head.next.next.next.next = new LinkedListNode<>(1);
        System.out.println(isPalindrome(head));
    }

}
