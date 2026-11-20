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
    public ListNode findKthNode(ListNode head,int k){
        k -= 1;
        while(head!=null && k > 0){
            k--;
            head = head.next;
        }
        return head;
    }
    public void reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ListNode front = null;
        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode nextNode = null;
        ListNode kthNode = null;

        while(temp != null){
            kthNode = findKthNode(temp,k);
            if(kthNode == null){
                if(prev != null) prev.next = temp;
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(temp == head){
                head = kthNode;
            }else{
                prev.next = kthNode;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }
}