package ReversedLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list=new MySinglyLinkedList();

        for(int i=0;i<10;i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }
     static void reverse(MySinglyLinkedList list) {
        // create 2 pointers
         Node prev = list.head;
         Node currrent = list.head.next;

         // while loop to iterate until curr = null
         while (currrent != null){
             Node nextNode = currrent.next;
             currrent.next = prev;  //change direction of current to prev
             prev = currrent;  // move prev to right to the current
             currrent = nextNode;  // move current to right on the next node

         }

         // now adjust tail and head
         list.tail = list.head;
         list.tail.next =null;
         list.head = prev;


    }


}
