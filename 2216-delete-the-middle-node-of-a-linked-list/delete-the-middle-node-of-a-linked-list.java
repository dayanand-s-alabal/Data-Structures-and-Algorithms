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
    public ListNode deleteMiddle(ListNode head) {
        int length = 0;
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int mid = (length/2) + 1;
        ListNode prev = null;
        temp = head;
        for(int i = 1;i<mid;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}