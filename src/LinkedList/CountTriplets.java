package LinkedList;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/count-triplets-in-a-sorted-doubly-linked-list-whose-sum-is-equal-to-a-given-value-x_985286,
 *   Date:- 2023-12-04
 * </metadata>
 * */
public class CountTriplets {

    static class DLLNode
    {
        int data;
        DLLNode next;
        DLLNode prev;

        public DLLNode(int data) {
            this.data = data;
        }
    }

    // function to count pairs whose sum equal to given 'value'
    static int countPairs(DLLNode first, DLLNode second, int value)
    {
        int count = 0;

        // The loop terminates when either of two pointers
        // become null, or they cross each other (second.next
        // == first), or they become same (first == second)
        while (first != null && second != null &&
                first != second && second.next != first) {

            // pair found
            if ((first.data + second.data) == value) {

                // increment count
                count++;

                // move first in forward direction
                first = first.next;

                // move second in backward direction
                second = second.prev;
            }

            // if sum is greater than 'value'
            // move second in backward direction
            else if ((first.data + second.data) > value)
                second = second.prev;

                // else move first in forward direction
            else
                first = first.next;
        }

        // required count of pairs
        return count;
    }

    // function to count triplets in a sorted doubly linked list
// whose sum is equal to a given value 'x'
    static int countTriplets(DLLNode head, int x)
    {
        // if list is empty
        if (head == null)
            return 0;

        DLLNode current, first, last;
        int count = 0;

        // get pointer to the last node of
        // the doubly linked list
        last = head;
        while (last.next != null)
            last = last.next;

        // traversing the doubly linked list
        for (current = head; current != null; current = current.next) {

            // for each current node
            first = current.next;

            // count pairs with sum(x - current.data) in the range
            // first to last and add it to the 'count' of triplets
            count += countPairs(first, last, x - current.data);
        }

        // required count of triplets
        return count;
    }

    public static void main(String[] args) {
        DLLNode head = new DLLNode(1);
        head.next = new DLLNode(2);
        head.next.prev = head;
        head.next.next = new DLLNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DLLNode(4);
        head.next.next.next.prev = head.next.next;
        System.out.println(countTriplets(head, 9));
    }
}
