package a1;
import a1.NodeType;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class SortedLinkedList {
    private NodeType head;
    private NodeType currentPos;


    public int getLength(String li){
        NodeType currentPos = head;
        int ct=0;
        while (currentPos != null){
            ct ++;
            currentPos = currentPos.next;
        }
        // System.out.println(currentPos);
        return 0;
    }



    public void insertItem(int info){
        NodeType node = new NodeType();
        node.info = info;
        node.next = null;

        if(head ==null)
        {
            head = node;
        }
        else{
            NodeType n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next=node;
        }
    }
    public void show()
    {
        NodeType node = head;
        while(node.next!=null){
            System.out.println(node.info);
            node = node.next;
        }
        System.out.println(node.info);
    }
    public void deleteItem(ItemType item){

    }
    public int searchItem(ItemType item){
        return 0;
    }

    public void resetList(){

    }

}