class Clone {
   //Function to clone a linked list with next and random pointer.
   Node copyList(Node head) {
       Node cur = head; 
       while(cur!=null){
           Node temp = cur.next;
           cur.next = new Node(cur.data);
           cur.next.next = temp;
           cur=temp;
       }
       
       cur = head;
       while(cur!=null){
           if(cur.next!=null){
                cur.next.arb = (cur.arb != null)
                                       ? cur.arb.next
                                       : cur.arb;
           }
           cur = cur.next.next;
       }
       
       Node original = head;
       Node copy = head.next;
       Node temp = copy;
       
       while(original !=  null){
           original.next = original.next.next;
           if(copy.next != null){
               copy.next = copy.next.next;
           }
           
           original = original.next;
           copy = copy.next;
       }
       return temp;
   }
}
