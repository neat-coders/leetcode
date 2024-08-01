
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
          if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            boolean isDuplicate = false;
            ListNode nextUniqueNode = findNextUniqueNode(current);

            if (nextUniqueNode != current.next) {
                prev.next = nextUniqueNode;
            } else {
                prev = current;
            }

            current = nextUniqueNode;
        }

        return dummy.next;
    }

    private ListNode findNextUniqueNode(ListNode current) {
        while (current.next != null && current.val == current.next.val) {
            current = current.next;
        }
        return current.next;
    }
}
