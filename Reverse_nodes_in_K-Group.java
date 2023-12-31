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
    public ListNode solve(ListNode head, int k, int n) {
        if(n<k) return head;      
        int i=0;
        ListNode temp=head, prev=null, next=null;
        while(i++<k) {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head.next= solve(temp,k, n-k);
        return prev;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        int n=0;
        ListNode temp=head;
        while(temp!=null) {
            temp=temp.next;
            n++;
        }
        return solve(head, k, n);
    }
}
