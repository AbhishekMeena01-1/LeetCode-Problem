class Solution {
    class Pair{
        int node, time;
        Pair(int node,int time){
            this.node=node;
            this.time =time;
        }
        
    }
    class iPair{
        int totalTime, node;
        iPair(int totalTime,int node){
            this.totalTime=totalTime;
            this.node=node;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
       int [] dis=new int [n+1];
       Arrays.fill(dis, Integer.MAX_VALUE);
       dis[k]=0;

       ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
       for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());

       }
       for(int []time:times){
        int u=time[0];
        int v=time[1];
        int w=time[2];
        adj.get(u).add(new Pair(v,w));
       }
       PriorityQueue<iPair> pq = new PriorityQueue<>((a,b)->a.totalTime-b.totalTime);
       pq.offer(new iPair(0,k));
       while(!pq.isEmpty()){
        iPair curr= pq.poll();
        int u=curr.node;
        int currTime=curr.totalTime;
        if(currTime>dis[u]){
            continue;
        }
        for(Pair neighbour : adj.get(u)){
            int v= neighbour.node;
            int edgeTime=neighbour.time;
            int newTime=currTime+edgeTime;
            if(newTime<dis[v]){
                dis[v]=newTime;
                pq.offer(new iPair(newTime,v));
            }
        }
       }
       int max = 0;

for (int i = 1; i <= n; i++) {

    if (dis[i] == Integer.MAX_VALUE)
        return -1;

    max = Math.max(max, dis[i]);
}

return max;
    }
}