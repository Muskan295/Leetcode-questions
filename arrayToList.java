class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};

class Solution {
    public Node arrayToList(int arr[]) {
        if(arr.length==0){
            return null;
        }
        Node head=new Node(arr[0]);
        Node curr=head;
        for(int i=1;i<arr.length;i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;
        }
        return head;
    }
}
