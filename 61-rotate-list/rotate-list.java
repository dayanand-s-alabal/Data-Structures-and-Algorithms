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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;

        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        ListNode prev = null;
        k = k % len;
        while(k-- > 0){
            temp = head;
            while(temp != null && temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}