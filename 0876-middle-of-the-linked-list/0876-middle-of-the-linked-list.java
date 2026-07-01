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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int cnt = 0;
        while(current != null){
            current = current.next;
            cnt++;
        }
        if(cnt%2==0){
            cnt = cnt+2;
            cnt = cnt /2;
        }else{
            cnt = cnt+1;
            cnt = cnt /2;
        }
        while(cnt != 1){
            head = head.next;
            cnt--;
        }
        return head;
    }
}