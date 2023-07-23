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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
    }
    ListNode n1 =  new ListNode();
    n1.next = head;
    ListNode curr = n1;
    while(curr.next!=null && curr.next.next!=null){
        ListNode temp1 = curr.next;
        ListNode temp2 = curr.next.next;
        curr.next = temp2;
        temp1.next = temp2.next;
        temp2.next = temp1;
        curr = curr.next.next;
    }
    return n1.next;
}
}
