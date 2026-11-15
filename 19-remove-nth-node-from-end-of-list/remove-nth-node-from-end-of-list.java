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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp = head;
        // int count = 0;
        // while(temp!=null){
        //     temp = temp.next;
        //     count++;
        // }
        // temp = head;
        
        // if(n == count){
        //     return head.next;
        // }
        // if(n == 1){
        //     while(temp.next.next!=null){
        //         temp = temp.next;
        //     }
        //     temp.next = null;
        //     return head;
        // }
        // int res = count - n;
        // temp = head;
        // for(int i = 0;i<res-1;i++){
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;

        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        

        slow.next = slow.next.next;
        return head;
    }
}