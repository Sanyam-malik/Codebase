package LinkedList;



/*
 * <metadata>
 * <name>Delete node in Doubly Linked List</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/DeleteDoublyLL.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1</url>
 * <date>2024-05-06</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Amazon:Walmart</companies>
 * </metadata>
 * */
public class DeleteNodeDoublyLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int d)
        {
            data = d;
            next = prev = null;
        }
    }

    Node deleteNode(Node head,int x){
        if (head == null) return null; // If list is empty, nothing to delete

        if (x == 1) {
            head = head.next; // Move head to the next node
            if (head != null) // If head is not null, update its prev pointer
                head.prev = null;
            return head;
        }

        Node prevNode = null;
        Node currNode = head;
        int pos = 1;
        while (currNode != null) {
            if (pos == x) {
                prevNode.next = currNode.next; // Remove currNode from the list

                if (currNode.next != null) // Update prev pointer of the next node
                    currNode.next.prev = prevNode;
                break; // Exit loop once deletion is done
            } else {
                prevNode = currNode;
                currNode = currNode.next;
                pos++; // Increment position
            }
        }
        return head;
    }

}
