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
        if(head==null || head.next==null) return head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode temp = head;
        ListNode tempO = odd;
        ListNode tempE = even;
        int index = 1;
        while(temp!=null){
            if(index%2==1){
                tempO.next = temp;
                tempO = tempO.next;
            }else{
                tempE.next = temp;
                tempE = tempE.next;
            }
            temp = temp.next;
            index++;
        }
        tempE.next = null;
        tempO.next = even.next;
        return odd.next;
    }
}