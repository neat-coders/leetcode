/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {

    function linkedListToBigInt(list) {
        let numberString = "";
        while (list != null) {
            numberString = numberString.concat((list.val).toString());
            list = list.next;
        }
        numberString = numberString.split('').reverse().join('');
        return BigInt(numberString);
    }

    // Convert both linked lists to BigInts
    let firstNumberBigInt = linkedListToBigInt(l1);
    let secondNumberBigInt = linkedListToBigInt(l2);

    let sumBigInt = firstNumberBigInt + secondNumberBigInt;

    let sumString = sumBigInt.toString();

    // Reverse the sum string to match the linked list order
    sumString = sumString.split('').reverse().join('');

    let head = new ListNode(Number(sumString[0]));
    let currentNode = head;

    for (let i = 1; i < sumString.length; i++) {
        currentNode.next = new ListNode(Number(sumString[i]));
        currentNode = currentNode.next;
    }

    return head;
};
