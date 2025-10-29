class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previous=null;
        ListNode curr=head;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=previous;
            previous=curr;
            curr=next;
        }
        return previous;
        
    }
}
