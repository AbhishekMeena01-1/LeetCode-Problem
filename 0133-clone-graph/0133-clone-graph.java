/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
 
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        Queue<Node> q= new LinkedList<>();
           HashMap<Node,Node> map=new HashMap<>();
        q.offer(node);
        map.put(node,new Node(node.val,new ArrayList<>()));
        while(!q.isEmpty()){
            Node temp=q.poll();
            for(Node neigh: temp.neighbors){
                if(!map.containsKey(neigh)){
                    map.put(neigh,new Node(neigh.val,new ArrayList<>()));
                    q.offer(neigh);
                }
                map.get(temp).neighbors.add(map.get(neigh));
            }

        }
        return map.get(node);
        
    }
}