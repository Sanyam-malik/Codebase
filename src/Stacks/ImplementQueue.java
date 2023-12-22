package Stacks;

import java.util.Stack;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/queue-using-array-or-singly-linked-list_2099908,
 *   Date:- 2023-12-03
 * </metadata>
 * */
public class ImplementQueue {
    Stack<Integer> stack;
    ImplementQueue() {
        stack = new Stack<>();
    }

    /*----------------- Public Functions of QueueOperations -----------------*/

    boolean isEmpty() {
        return stack.isEmpty();
    }

    void enqueue(int data) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        temp.push(data);
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    int dequeue() {
        if(!isEmpty()) return stack.pop();
        return -1;
    }

    int front() {
        if(!isEmpty()) return stack.peek();
        return -1;
    }

    public static void main(String[] args) {
        ImplementQueue o = new ImplementQueue();
        o.enqueue(1);
        o.enqueue(2);
        o.enqueue(3);
        System.out.println(o.dequeue());
        System.out.println(o.front());
    }
}
