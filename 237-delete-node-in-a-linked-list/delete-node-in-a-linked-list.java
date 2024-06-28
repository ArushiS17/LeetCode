/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //we change given node value to next nodes
        node.next= node.next.next; //we copy the value of the next node to the current node and adjust the next pointer to skip the next node.
    } 
}