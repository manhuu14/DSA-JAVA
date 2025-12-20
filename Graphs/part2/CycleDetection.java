import java.util.*;

public class CycleDetection {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int w){
            this.src=src;
            this.dest=dest;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        } 
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1)); 

        graph[3].add(new Edge(3, 1, 1));
        //graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        //graph[4].add(new Edge(4, 3, 1));
        //graph[4].add(new Edge(4, 5, 1)); 

        graph[5].add(new Edge(5, 3, 1));
        //graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));       
    }  
    public static void dfs(ArrayList<Edge>graph[], int curr, boolean visit[]){
        System.out.print(curr+" "); 
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(!visit[e.dest]){
                dfs(graph, e.dest, visit);
            }
        }
    } 
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length]; 
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    } 
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr,int par ){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            //case3 
            if(!vis[e.dest] ){
                if(detectCycleUtil(graph,vis,e.dest,curr)){
                    return true;
                }
                
            }
            //case1
            else if(vis[e.dest] && e.dest!=par){
                return true;
            } 
            //case 2->do nothing ->continue
        } 
        return false;
    }
    public static void main(String args[]){
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph); 
        System.out.println(detectCycle(graph));
    }
}