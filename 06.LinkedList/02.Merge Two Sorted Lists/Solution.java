/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;

        ListNode temp = null;
        ListNode previousNode = null;

        while (list1 != null && list2 != null) {
            ListNode currentNode = null;
            if (list1.val <= list2.val) {
                currentNode = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                currentNode = new ListNode(list2.val);
                list2 = list2.next;
            }

            if (temp == null) {
                temp = currentNode;
                previousNode = currentNode;
            } else {
                previousNode.next = currentNode;
                previousNode = currentNode;
            }
        }

        // Attach any remaining nodes directly
        if (list1 != null) {
            previousNode.next = list1;
        } else if (list2 != null) {
            previousNode.next = list2;
        }

        return temp;
    }
}
