class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node pre=null;
        Node nex=null;
        Node cur=node;
        int c=0;
        while(cur!=null && c<k){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
            c++;
        }
        if(nex!=null){
            node.next=reverse(nex,k);
        }
        return pre;
    }
}

