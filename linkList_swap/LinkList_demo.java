/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist_demo;

/**
 *
 * @author Shubha
 */
public class LinkList_demo {
    //class to create node:
    node head;
    static class node {
        int data;
        node next;
        
        //constractor to create node:
        public node(int d) {
            data = d;
            next = null;
        }
    }
    
    //function to print node:
    void PrintNode() {
        node n = head;
        while(n != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    
    //function to insert at first:
    
    void insertAtFirst(int newData){
        node new_node = new node(newData);
        new_node.next = head;
        head = new_node;
    }
    
    //function to inset at last:
    void insertAtLast(int newData){
        node new_node = new node(newData);
        node n = head;
        while(n.next != null){
            n = n.next;
        } 
        n.next = new_node;
    }
    
    //function to swap node:
    public void swapNodes(int value1, int value2) {
        node n1 = head;
        node prev1 = null;
        while(n1.data != value1) {
            prev1 = n1;
            n1 = n1.next;
        }
        
        node n2 = head;
        node prev2 = null;
        while(n2.data != value2) {
            prev2 = n2;
            n2 = n2.next;
        }
        
        if(prev1 != null){
            prev1.next = n2;
        }
        if(prev2 != null) {
            prev2.next = n1;
        }
        //now swap the next pointer:
        node tmp = n1.next;
        n1.next = n2.next;
        n2.next = tmp;
        
    }
    


    public static void main(String[] args) {
        LinkList_demo llist = new LinkList_demo();
        llist.head = new node(2);
        node first = new node(3);
        
        //link the node:
        llist.head.next = first;
        
         //insert at first:
        llist.insertAtFirst(1);
        
        //insert at last:
        llist.insertAtLast(4);
        llist.insertAtLast(5);
        
        //swap node:
        llist.swapNodes(2,4);
        
        //print node:
        llist.PrintNode();

    }
    
}
