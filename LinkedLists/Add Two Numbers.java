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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;
        int carry = 0;
        while(l1 != null ||  l2 != null){
            int val1 = l1!=null ? l1.val : 0;
            int val2 = l2!=null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum/10;
            current_node.next = new ListNode(sum%10);
            current_node = current_node.next;
            if(l1 !=null)l1=l1.next;
            if(l2 !=null)l2=l2.next;
        }
        if(carry>0){
            current_node.next = new ListNode(carry);
            
        }
        return temp_node.next;
    }
}