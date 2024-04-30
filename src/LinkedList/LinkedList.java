package LinkedList;

public class LinkedList<V> {

    private class Node {
        V data;
        Node next;

        Node(V data) {
            this.data = data;
        }

        public String toString() {
            return data.toString();
        }

    }

    private Node head;
    private int size = -1;

    private int size() {
        return size;
    }

    private void clear() {
        size=-1;
        head = null;
    }

    private Boolean isEmpty() {
        return size == -1;
    }

    private void add(V data) {
        Node newNode = new Node(data);
        if(size == -1) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    private void add(V data, int index) {
        if(index > size) {
            this.add(data);
        } else {
            int iterator = 0;
            Node temp = head;
            Node newNode = new Node(data);
            while(temp != null) {
                if(++iterator == index) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
                temp = temp.next;
            }
        }
    }

    private void delete(int index) {
        if(size == -1 || index > size || index < 0) {
            return;
        }

        int iterator = 0;
        Node temp = head;
        while(temp != null) {
            if(++iterator == index) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        size--;
    }

    private Node get(int index) {
        if(size == -1 || index > size || index < 0) {
            return null;
        }
        Node n = null;
        Node temp = head;
        int iterator = 0;
        while(temp != null) {
            if(iterator == index) {
                n = temp;
            }
            temp = temp.next;
            iterator++;
        }
        return n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node n = head;
        while(n != null) {
            sb.append(n.data.toString()).append(",");
            n = n.next;
        }
        return sb.substring(0, sb.length()-1);
    }

    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(list);
        list.add(3, 2);
        System.out.println(list);
        list.delete(2);
        System.out.println(list);
    }
}
