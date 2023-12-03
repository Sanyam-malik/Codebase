package LinkedList;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/binary-to-integer_2421938,
 *   Date:- 2023-12-04
 * </metadata>
 * */
public class BinaryLinkedListInteger {

    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    };

    public static int binaryToInteger(int n, Node head) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();
        while(head !=null) {
            sb.append(Integer.toString(head.data));
            head = head.next;
        }
        String bString = sb.toString();
        int binary = 0;
        for(int i=0; i<bString.length(); i++) {
            int pow = n-i-1;
            if(Character.getNumericValue(bString.charAt(i))==1) {
                binary+= (int) Math.pow(2, pow);
            }
        }
        return binary;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);
        System.out.println(binaryToInteger(4, head));
    }
}
