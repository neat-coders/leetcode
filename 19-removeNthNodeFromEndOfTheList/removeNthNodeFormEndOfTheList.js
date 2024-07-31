/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    if (!head || !head.next) {
        return null;
    }
    let crawler = head;
    let laggingCrawler = crawler;

    for (let i = 0; i < n; i++) {
        crawler = crawler.next;
    }

    if (!crawler) {
        return head.next;
    }

    while (crawler.next) {
        crawler = crawler.next;
        laggingCrawler = laggingCrawler.next;
    }

    laggingCrawler.next = laggingCrawler.next.next;

    return head;
};