/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head ;
        int size = 0 ;
        while(current != null){
            size++;
            current = current.next;
        }
        if(size == n ){
            return head.next;
        }

        ListNode temp = head;
        int numOfIterations= size - n -1;
        while(numOfIterations != 0 ){
            numOfIterations--;
            temp= temp.next;

        }
        temp.next = temp.next.next;
        return head;




    }
}