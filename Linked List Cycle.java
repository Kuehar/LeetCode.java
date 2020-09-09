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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hasCheckedNode = new HashSet<>();
        while(head != null){
            if (hasCheckedNode.contains(head)){
                return true;
            }else{
                hasCheckedNode.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
/*
Runtime: 3 ms, faster than 20.28% of Java online submissions for Linked List Cycle.
Memory Usage: 40 MB, less than 44.77% of Java online submissions for Linked List Cycle.
*/
