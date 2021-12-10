package linked_lists;


public class SinglyLinkedList {

    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null){
            head = newNode;
        }else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;

            }
            currentNode.next = newNode;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){

        if(index == 0){
            insertAtStart(data);
        }else {
            Node node = new Node(data);
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            node.next = currentNode.next;
            currentNode.next = node;
        }
    }

    public void deleteAt(int index){

        if(index == 0){
            head = head.next;
        }
        else{
            Node currentNode = head;
            Node n1 = null;
            for(int i = 0; i < index - 1; i++){
                currentNode = currentNode.next;
            }
            n1 = currentNode.next;
            currentNode.next = n1.next;
            System.out.println("Deleted: "+ n1.data);
            n1 = null;
        }


    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtEnd(5);
        singlyLinkedList.insertAtEnd(9);
        singlyLinkedList.insertAtEnd(7);
        singlyLinkedList.insertAtEnd(3);
        singlyLinkedList.insertAtStart(8);
        singlyLinkedList.insertAt(2, 78);
        singlyLinkedList.insertAt(0, 1);

        singlyLinkedList.show();
    }
}
//Pseudocode
//Create a Node class
//Create insert method
