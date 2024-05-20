package Queues;

import java.util.LinkedList;
import java.util.Queue;


/*
 * <metadata>
 * <name>Time Needed to Buy Tickets</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/TimeNeededToBuyTickets.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/time-needed-to-buy-tickets/description/</url>
 * <date>2024-05-20</date>
 * <level>Easy</level>
 * <remarks>Good Question</remarks>
 * <companies>Twitter</companies>
 * <notes>Use Queues and See Solution</notes>
 * </metadata>
 * */
public class TimeNeededToBuyTickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;

        for(int i=0; i<tickets.length; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            int index = queue.poll();
            tickets[index]--;
            time++;

            if(tickets[index]==0 && index==k) {
                return time;
            }
            if(tickets[index] > 0) {
                queue.add(index);
            }
        }
        return time;
    }

    public static void main(String args[]) {
        System.out.println(timeRequiredToBuy(new int[]{2, 3, 2}, 2));
    }
}
