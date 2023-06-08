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
        ListNode temp_node=new ListNode(0);
        ListNode curr_Node=temp_node;
        while(list1!=null && list2!=null) 
        {
            if(list1.val<list2.val)
            {
                curr_Node.next=list1;
                list1=list1.next;
            }
            else
            {
                curr_Node.next=list2;
                list2=list2.next;

            }
            curr_Node=curr_Node.next;
        } 
        if(list1!=null)
        {
            curr_Node.next=list1;
            list1=list1.next;
        }
        if(list2!=null)
        {
            curr_Node.next=list2;
            list2=list2.next;
        }
         return temp_node.next;    
    }
   
}
