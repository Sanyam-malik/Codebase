package LinkedList;

import java.util.HashMap;


/*
 * <metadata>
 * <name>Copy List with Random Pointer</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/CopyLLRandomPTR.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://leetcode.com/problems/copy-list-with-random-pointer/description/</url>
 * <date>2024-05-23</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/q570bKdrnlw?si=iRRoHzNiGtsZ8aS1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></br><a href="https://leetcode.com/problems/copy-list-with-random-pointer/solutions/4003262/97-92-hash-table-linked-list/">View Solution</a></notes>
 * <remarks>Good Question</remarks>
 * <companies>OYO:Ola:Adobe:Paytm:Apple:Amazon:Myntra:Meesho:Citrix:Google:DE Shaw:Walmart:Cars 24:Facebook:Flipkart:Snapdeal:Sprinklr:UrbanClap:Microsoft:Bloomberg:MakeMyTrip:BankBazaar:Pegasystems:Goldman Sachs:Credit Suisse:Morgan Stanley:Times Internet:Western Digital:Cargo Flash pvt:Aditya Birla group:Greatwits Services Pvt Ltd</companies>
 * </metadata>
 * */
public class CopyLLRandomPTR {

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /*
    * Time: O(n)
    * Space: O(1)
    * */
    public Node copyRandomListInterWeaving(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            Node new_node = new Node(curr.val);
            new_node.next = curr.next;
            curr.next = new_node;
            curr = new_node.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next != null ? curr.next.next : null;
        }

        Node old_head = head;
        Node new_head = head.next;
        Node curr_old = old_head;
        Node curr_new = new_head;

        while (curr_old != null) {
            curr_old.next = curr_old.next.next;
            curr_new.next = curr_new.next != null ? curr_new.next.next : null;
            curr_old = curr_old.next;
            curr_new = curr_new.next;
        }

        return new_head;
    }

    /*
    * Time: O(n)
    * Space: O(n)
    * */
    public Node copyRandomListMap(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> oldToNew = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            oldToNew.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            oldToNew.get(curr).next = oldToNew.get(curr.next);
            oldToNew.get(curr).random = oldToNew.get(curr.random);
            curr = curr.next;
        }

        return oldToNew.get(head);
    }
}
