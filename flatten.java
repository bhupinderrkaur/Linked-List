class LL{
    
    Node merge(Node a, Node b){
        Node ans = new Node(0);
        Node ansptr = ans;
        while(a!=null && b!=null){
            if(a.data<b.data){
                ansptr.bottom = a;
                a = a.bottom;
            }else{
                ansptr.bottom = b;
                b = b.bottom;
            }
            ansptr = ansptr.bottom;
        }
        if(a!=null) ansptr.bottom = a;
        if(b!=null) ansptr.bottom = b;
        return ans.bottom;
    }
    
    Node flatten(Node root){
	  
	    if(root==null || root.next==null) return root;
	    root.next = flatten(root.next);
	    return merge(root,root.next);
    }
}
