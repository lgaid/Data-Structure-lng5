package FindCycle;

public class Solution {
    public static void main(String[] args) {
        ListNode n1=new ListNode(3);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(0);
        ListNode n4=new ListNode(4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        System.out.println(hasCycle(n1));
    }
    public static boolean hasCycle(ListNode head) {

        return false;
    }
}
