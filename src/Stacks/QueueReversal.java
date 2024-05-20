package Stacks;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


/*
 * <metadata>
 * <name>Queue Reversal</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/QueueReversal.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/queue-reversal/1</url>
 * <date>2024-05-20</date>
 * <level>Easy</level>
 * <remarks>Solve using Recursion</remarks>
 * <companies>Amazon</companies>
 * <notes>Using Stack, Recursion</notes>
 * </metadata>
 * */
public class QueueReversal {

    public static Queue<Integer> rev(Queue<Integer> q){
        Queue<Integer> res = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }

        while(!stack.isEmpty()) {
            res.offer(stack.pop());
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(rev(new LinkedList<>(List.of(4, 3, 1, 10, 2, 6))));
    }
}
