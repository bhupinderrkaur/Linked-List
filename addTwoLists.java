class Solution{
 
     static Node reverse(Node head) {
       Node prev = null;
       while(head != null) {
           Node next = head.next;
           head.next = prev;
           prev = head;
           head = next;
       }
       return prev;
   }
    static Node addTwoLists(Node first, Node second){
   Node l1 = reverse(first);
       Node l2 = reverse(second);
       Node dummy = new Node(0);
       Node temp = dummy;
       int carry = 0;
       int sum = 0;
       while(l1 != null || l2 != null || carry == 1) {
           sum = 0;
           if(l1 != null) {
               sum += l1.data;
               l1 = l1.next;
           }
           if(l2 != null) {
               sum += l2.data;
               l2 = l2.next;
           }
           sum += carry;
           carry = sum / 10;
           Node node = new Node(sum%10);
           temp.next = node;
           temp = temp.next;
       }
       Node ans = reverse(dummy.next);
       return ans;
   }
}
