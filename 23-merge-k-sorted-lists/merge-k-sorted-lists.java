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
    // public ListNode mergeKLists(ListNode[] lists) {

    //     ArrayList<Integer> arr = new ArrayList<>();

    //     // Step 1: Store all values
    //     for (ListNode node : lists) {

    //         while (node != null) {
    //             arr.add(node.val);
    //             node = node.next;
    //         }
    //     }

    //     // Step 2: Sort values
    //     Collections.sort(arr);

    //     // Step 3: Create linked list
    //     ListNode dummy = new ListNode(0);
    //     ListNode temp = dummy;

    //     for (int num : arr) {

    //         temp.next = new ListNode(num);
    //         temp = temp.next;
    //     }

    //     return dummy.next;
    // }

    // Optimal approach
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        // Step 1: Add heads of all linked lists
        for (ListNode node : lists) {

            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        // Step 2: Process the smallest node
        while (!pq.isEmpty()) {

            ListNode smallest = pq.poll();

            // Attach smallest node to result
            temp.next = smallest;
            temp = temp.next;

            // Add next node from the same list
            if (smallest.next != null) {
                pq.add(smallest.next);
            }
        }

        return dummy.next;
    }
}