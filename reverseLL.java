class LinkedList {

 //iterative
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
  //recursive
 static Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;
 
       
        Node rest = reverse(head.next);
        head.next.next = head;
 
        head.next = null;
 
        return rest;
    }
    }
