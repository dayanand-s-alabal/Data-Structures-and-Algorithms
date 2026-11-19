/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        if(head == null || head.next == null){
            return null;
        }
        Map<ListNode,Integer> map = new HashMap<>();
        while(! map.containsKey(temp) && temp.next != null){
            map.put(temp,temp.val);
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            return null;
        }
        return temp;
    }
}