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
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> arr = new ArrayList<>();

        // Step 1: Store all values
        for (ListNode node : lists) {

            while (node != null) {
                arr.add(node.val);
                node = node.next;
            }
        }

        // Step 2: Sort values
        Collections.sort(arr);

        // Step 3: Create linked list
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int num : arr) {

            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }
}