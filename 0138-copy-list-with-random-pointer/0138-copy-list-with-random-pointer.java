/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(-1);
        Node tail = dummy;
        Node temp = head;

        Map<Node, Node> map = new HashMap<>();

        while(temp != null) {
            Node new_node = new Node(temp.val);
            tail.next = new_node;
            tail = new_node;

            map.put(temp, new_node);
            temp = temp.next;
        }
        Node t1 = head;
        Node t2 = dummy.next;

        while(t1 != null) {
            t2.random = map.get(t1.random);
            t1 = t1.next;
            t2 = t2.next;
        }

        return dummy.next;
    }
}