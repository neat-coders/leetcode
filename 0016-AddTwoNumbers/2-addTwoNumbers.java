class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode ;
        int carray = 0 ;

        while(l1 != null || l2 != null || carray != 0 ){
            int sum = carray;
            if(l1!= null && l2 != null){
                sum += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 != null){
                sum += l1.val;
                l1= l1.next;
            }
            else if(l2 != null){
                sum += l2.val;
                l2 = l2.next;

            }
            ListNode newNode = new ListNode(sum % 10 );
            current.next = newNode ;
            current =current.next;
            carray = sum / 10 ;


        }
        return dummyNode.next;

    }
}