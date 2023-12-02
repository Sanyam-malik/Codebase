package Stacks;
import java.util.*;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/reverse-first-k-elements-of-queue_982771,
 *   Date:- 2023-12-03
 * </metadata>
 * */
public class ReverseQueueElements {

    public static Queue<Integer> reverseElements(Queue<Integer> q, int k) {
        Queue<Integer> result = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k;i++) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            result.offer(stack.pop());
        }
        while (!q.isEmpty()) {
            result.offer(q.poll());
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(reverseElements(new LinkedList<>(List.of(1, 2, 3, 4, 5)), 3));
    }
}
