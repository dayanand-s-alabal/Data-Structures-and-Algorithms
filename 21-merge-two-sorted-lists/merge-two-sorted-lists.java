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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode temp = list1;

        ListNode retList = new ListNode();
        ListNode retNode = retList;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                retList.next = temp1;
                temp1 = temp1.next;
            }else{
                retList.next = temp2;
                temp2 = temp2.next;
            }
            retList = retList.next;
        }
        while(temp1 != null){
            retList.next = temp1;
            temp1 = temp1.next;
            retList = retList.next;
        }

        while(temp2 != null){
            retList.next = temp2;
            temp2 = temp2.next;
            retList = retList.next;
        }
        
        return retNode.next;
    }
}