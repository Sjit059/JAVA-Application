/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linknodeinsert;

import java.sql.Struct;

/**
 *
 * @author Shubha
 */
public class LinkNodeInsert {
    //ref of node class:
    node head;
    //create link list:
    static class node {
        int data;
        node next;
        public node(int d){
            data =d;
            next = null;
        }
    }
    
    //function to print the link nodes:
    public void printList(){
        node n = head;
        while(n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    
    //function to insert at front:
    public void pushAtFront(int newData) {
         node newNode = new node(newData);
         newNode.next = head;
         head = newNode;    
    }
    
    //function to insert at the end:
    public void pushAtEnd(int newData) {
        node n = head;
        node newNode = new node(newData);
        newNode.next = null;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = newNode;
    }
    //function to insert after a given node:
    public void pushAfter(node prevNode, int newData){
        node newNode = new node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }


    public static void main(String[] args) {
        LinkNodeInsert llist = new LinkNodeInsert();
        //create nodes:
        llist.head = new node(1);
        node second = new node(2);
        node third = new node(3);
        //link the linkNodes:
        llist.head.next = second;
        second.next = third;
        //insert at front:
        llist.pushAtFront(0);
        
        //insert at the end:
        llist.pushAtEnd(4);
        
        //insert after a node:
        llist.pushAfter(llist.head, 10);
        //print link node:
        llist.printList();
    }
    
}
