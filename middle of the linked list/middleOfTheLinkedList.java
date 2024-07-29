class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode following_ptr = head;
    ListNode lead_ptr = head;

    while (lead_ptr != null && lead_ptr.next != null) {
        lead_ptr = lead_ptr.next.next;
        following_ptr = following_ptr.next;
    }
    
        return following_ptr;
    }

   
}
