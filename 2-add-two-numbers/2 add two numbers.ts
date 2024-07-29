/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
    const result = new ListNode();
    let crawlerResult = result;
    let lastCrawler: ListNode;
    let crawlerL1 = l1;
    let crawlerL2 = l2;
    let carry = 0;

    while (crawlerL1 || crawlerL2) {
        crawlerResult.next = new ListNode();

        if (crawlerL1 && crawlerL2) {
            const sum = crawlerL1.val + crawlerL2.val + carry;
            crawlerResult.val = sum % 10;
            carry = Math.floor(sum / 10);
        } else {
            const crawler = crawlerL1 ? crawlerL1 : crawlerL2;

            const sum = crawler.val + carry;
            crawlerResult.val = sum % 10;
            carry = Math.floor(sum / 10);
        }

        crawlerL1 = crawlerL1?.next;
        crawlerL2 = crawlerL2?.next;
        lastCrawler = crawlerResult;
        crawlerResult = crawlerResult.next;
    }

    if (carry === 1) {
        crawlerResult.val = carry;
    } else {
        lastCrawler.next = null;
    }

    return result;
};