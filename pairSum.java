class LL{
static void pairSum(Node head, int x)
{
    Node first = head;
    Node second = head;
    while (second.next != null)
        second = second.next;

    boolean found = false;
    while ( first != second && second.next != first)
    {
       
        if ((first.data + second.data) == x)
        {
            found = true;
            System.out.println( "(" + first.data +
                                ", "+ second.data + ")" );
            first = first.next;
            second = second.prev;
        }
        else
        {
            if ((first.data + second.data) < x)
                first = first.next;
            else
                second = second.prev;
        }
    }

    if (found == false)
        System.out.println("No pair found");
}
}
