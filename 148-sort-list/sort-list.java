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
    public ListNode merge(ListNode firsthalf, ListNode secondhalf){
        ListNode dummy = new ListNode(100);
        ListNode temp = dummy;
        ListNode temp1 = firsthalf;
        ListNode temp2 = secondhalf;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1==null) temp.next= temp2;
        else temp.next = temp1;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode firsthalf = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhalf = slow.next;
        slow.next = null;
        firsthalf = sortList(firsthalf);
        secondhalf = sortList(secondhalf);
        ListNode ans = merge(firsthalf,secondhalf);
        return ans;
    }
}