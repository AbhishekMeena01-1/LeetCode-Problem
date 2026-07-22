/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       HashMap<Node,Node> map= new HashMap<>();
       Node temp= head;
       Node dummy=new Node(-1);
       Node res=dummy;
       while(temp!=null){
        Node copy = new Node(temp.val);
        res.next=copy;
        map.put(temp,copy);
        res=res.next;
        temp=temp.next;
       }
       temp=head;
       res=dummy;
       while(temp!=null){
        if(temp.random==null){
            res.next.random=null;
        }else{
            res.next.random=map.get(temp.random);
           
        }
         temp=temp.next;
            res=res.next;
       }
       return dummy.next;
    }
}