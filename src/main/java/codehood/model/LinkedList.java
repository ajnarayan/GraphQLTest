package codehood.model;

/**
 * Created by anarayan on 12/3/17.
 */
/**
 * spring uses jackson JSON library to automatically marshal instance type LinkedList to JSON
 */
public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
