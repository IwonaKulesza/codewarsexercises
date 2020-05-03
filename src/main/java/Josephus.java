import java.util.List;

public class Josephus {

    class Node {

        Object value;
        Node nextNode;

        Node(Object value) {
            this.value = value;
        }
    }

    class CircularLinkedList {
        private Node head = null;
        private Node tail = null;

        Node getHead(){
            return head;
        }

        public void addNode(Object value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                tail.nextNode = newNode;
            }

            tail = newNode;
            tail.nextNode = head;
        }

        public void deleteNode(Node node) {
            Node currentNode = node.nextNode;
            if(node == currentNode){
                head = null;
                tail = null;
            }
            if (node == head){
                head = node.nextNode;
            }
            if (node == tail){
                tail = node.nextNode;
            }
            while (true){
                if (currentNode.nextNode == node){
                    currentNode.nextNode = node.nextNode;
                    break;
                }
                currentNode = currentNode.nextNode;
            }
        }

        public void listNodes(){
            System.out.println(head.value);
            Node next = head.nextNode;
            while (next != head){
                System.out.println(next.value);
                next = next.nextNode;
            }
        }

        public int countNodes(){
            if (head == null) return 0;
            else {
                int counter = 1;
                Node next = head.nextNode;
                while (next != head){
                    counter += 1;
                    next = next.nextNode;
                }
                return counter;
            }
        }

    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
       return null;
    }
}