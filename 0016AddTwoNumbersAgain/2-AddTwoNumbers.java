
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
    ListNode current = dummyHead;
    int carry = 0;
    
    while (l1 != null || l2 != null) {
        int value1 = (l1 != null) ? l1.val : 0;
        int value2 = (l2 != null) ? l2.val : 0;
        int sum = value1 + value2 + carry;
        carry = sum / 10;
        int digit = sum % 10;
        
        current.next = new ListNode(digit);
        current = current.next;
        
        l1 = (l1 != null) ? l1.next : null;
        l2 = (l2 != null) ? l2.next : null;
    }
    
    if (carry > 0) {
        current.next = new ListNode(carry);
    }
    
    return dummyHead.next;
    }
}
