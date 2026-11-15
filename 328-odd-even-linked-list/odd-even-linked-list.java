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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pointer = head;
        ListNode evenHead = head.next;
        ListNode lastOdd = pointer;
        boolean isOdd = true;

        while(pointer != null && pointer.next != null){
            if(isOdd){
                lastOdd = pointer;
            }
            ListNode nxt = pointer.next;
            pointer.next = pointer.next.next;
            pointer = nxt;

            isOdd = !isOdd;
        }
        if(isOdd){
            lastOdd = pointer;
        }
        lastOdd.next = evenHead;
        return head;
    }
}