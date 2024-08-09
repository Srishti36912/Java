import java.util.*;
public class graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        // public Edge(int s, int d, int w) {
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
            // this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // graph[0].add(new Edge(0,2,2));

        // graph[1].add(new Edge(1,2,10)); 
        // graph[1].add(new Edge(1,3,0));

        // graph[2].add(new Edge(2,0,2)); 
        // graph[2].add(new Edge(2,1,10)); 
        // graph[2].add(new Edge(2,3,-1));

        // graph[3].add(new Edge(3,1,0)); 
        // graph[3].add(new Edge(3,2,-1));

        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));

        // graph[1].add(new Edge(1,0));
        // graph[1].add(new Edge(1,3));

        // graph[2].add(new Edge(2,0));
        // graph[2].add(new Edge(2,4));

        // graph[3].add(new Edge(3,1));
        // graph[3].add(new Edge(3,4));
        // graph[3].add(new Edge(3,5));

        // graph[4].add(new Edge(4,2));
        // graph[4].add(new Edge(4,3));
        // graph[4].add(new Edge(4,5));

        // graph[5].add(new Edge(5,3));
        // graph[5].add(new Edge(5,4));
        // graph[5].add(new Edge(5,6));

        // graph[6].add(new Edge(6,5));

        // graph[0].add(new Edge(0,2));

        // graph[1].add(new Edge(1,0));

        // graph[2].add(new Edge(2,3));

        // graph[3].add(new Edge(3,0));

        // graph[2].add(new Edge(2,3));

        // graph[3].add(new Edge(3,1));

        // graph[4].add(new Edge(4,0));
        // graph[4].add(new Edge(4,1));

        // graph[5].add(new Edge(5,0));
        // graph[5].add(new Edge(5,2));

        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,4));

        // graph[1].add(new Edge(1,0));
        // graph[1].add(new Edge(1,2));
        // graph[1].add(new Edge(1,4));

        // graph[2].add(new Edge(2,1));
        // graph[2].add(new Edge(2,3));

        // graph[3].add(new Edge(3,2));

        // graph[4].add(new Edge(4,0));
        // graph[4].add(new Edge(4,1));
        // graph[4].add(new Edge(4,5));

        // graph[5].add(new Edge(5,4));
        // graph[0].add(new Edge(0,1,2));
        // graph[0].add(new Edge(0,2,4));

        // graph[1].add(new Edge(1,3,7));
        // graph[1].add(new Edge(1,2,1));

        // graph[2].add(new Edge(2,4,3));

        // graph[3].add(new Edge(3,5,1));

        // graph[4].add(new Edge(4,3,2));
        // graph[4].add(new Edge(4,5,5));

        // graph[0].add(new Edge(0,1,2));
        // graph[0].add(new Edge(0,2,4));

        // graph[1].add(new Edge(1,2,-4));

        // graph[2].add(new Edge(2,3,2));

        // graph[3].add(new Edge(3,4,4));

        // graph[4].add(new Edge(4,1,-1));

        // graph[0].add(new Edge(0,1,10));
        // graph[0].add(new Edge(0,2,15));
        // graph[0].add(new Edge(0,3,30));

        // graph[1].add(new Edge(1,0,10));
        // graph[1].add(new Edge(1,3,40));

        // graph[2].add(new Edge(2,0,15));
        // graph[2].add(new Edge(2,3,50));

        // graph[3].add(new Edge(3,1,40));
        // graph[3].add(new Edge(3,2,50));

        // graph[0].add(new Edge(0,2));
        // graph[0].add(new Edge(0,3));

        // graph[1].add(new Edge(1,0));

        // graph[2].add(new Edge(2,1));

        // graph[3].add(new Edge(3,4));

        //getBridge
        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));
        // graph[0].add(new Edge(0,3));

        // graph[1].add(new Edge(1,0));
        // graph[1].add(new Edge(1,2));

        // graph[2].add(new Edge(2,0));
        // graph[2].add(new Edge(2,1));

        // graph[3].add(new Edge(3,0));
        // graph[3].add(new Edge(3,4));
        // graph[3].add(new Edge(3,5));

        // graph[4].add(new Edge(4,3));
        // graph[4].add(new Edge(4,5));

        // graph[5].add(new Edge(5,3));
        // graph[5].add(new Edge(5,4));

        //articulation point
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }

    // public static void bfs(ArrayList<Edge> graph[], int V) {
    public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();
        // boolean vis[] = new boolean[V];
        q.add(start);

        while(!q.isEmpty()) {
            int curr = q.remove();
            if(vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
            
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    //O(V^V)
    public static void printAllPath(ArrayList<Edge> graph[], int curr ,boolean vis[], String path, int tar) {
        if(curr == tar) {
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                vis[curr] = true;
                printAllPath(graph, e.dest, vis, path+e.dest, tar);
                vis[curr] = false;
            }
        }
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[] ,boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(rec[e.dest]) {
                return true;
            } else if(!vis[e.dest]) {
                if(isCycleDirected(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
    }

    //O(V+E) topological sorting
    public static void topSortUtil(ArrayList<Edge> graph[] ,boolean vis[], int curr, Stack<Integer> stack) {
        vis[curr] = true;
        
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSortUtil(graph, vis, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                topSortUtil(graph, vis, i, stack);
            }
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    //O(V+E)
    public static boolean isCycleUndirected(ArrayList<Edge> graph[] ,boolean vis[], int curr, int par) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest != par) {
                return true;
            }
            else if(!vis[e.dest]) {
                if(isCycleUndirected(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist; //ascending
            //return p2.dist - this.dist; //descending
        }
    }

    //0(E + E logV)
    public static void dijkshtra(ArrayList<Edge> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for(int i=0; i<V; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));

        while(!pq.isEmpty()) {
            Pair curr = pq.remove(); //shortest
            if(!vis[curr.node]) {
                vis[curr.node] = true;

                for(int i=0; i<graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i=0; i<V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    //O(E.V)
    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V) {
        int dist[] = new int[V];
        for(int i=0; i<V; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int k=0; k<V-1; k++) { //O(V)
            for(int i=0; i<V; i++) {//O(E)
                for(int j=0; j<graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        // detect -ve wt cycle
        for(int i=0; i<V; i++) {//O(E)
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int u = e.src;
                int v = e.dest;

                if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                    System.out.println("Negative wt cycle");
                }
            }
        }

        for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static class PairPrim implements Comparable<PairPrim> {
        int node;
        int cost;

        public PairPrim(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(PairPrim p2) {
            return this.cost - p2.cost; //ascending
        }
    }

    //O(E.logE)
    public static void primsAlgo(ArrayList<Edge> graph[], int V) {
        PriorityQueue<PairPrim> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[V];
        pq.add(new PairPrim(0, 0));

        int mstCost = 0;

        while(!pq.isEmpty()) {
            PairPrim curr = pq.remove();
            if(!vis[curr.node]) {
                vis[curr.node] = true;
                mstCost += curr.cost;

                for(int i=0; i<graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]) {
                        pq.add(new PairPrim(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("Main cost of mst = " + mstCost);
    }

    //O(V+E)
    public static void kosarajuAlgo(ArrayList<Edge> graph[], int V) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                topSortUtil(graph, vis, i, s);
            }
        }

        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0; i<graph.length; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i=0; i<V; i++) {
            for(int j=0; j<graph[i].size(); i++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        while(!s.isEmpty()) {
            int curr = s.pop();
            if(!vis[curr]) {
                dfs(transpose, curr, vis);
                System.out.println();
            }
            
        }
    }

    public static void bridgeDfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(e.dest == par) {
                continue;
            } else if(!vis[e.dest]) {
                bridgeDfs(graph, e.dest, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr] < low[e.dest]) {
                    System.out.println("Bridge is : " + curr + "--" + e.dest);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    public static void getBridge(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];

        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                bridgeDfs(graph, i, vis, dt, low, time, -1);
            }
        }
    }

    public static void APdfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par, boolean ap[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if(par == neigh) {
                continue;
            } else if(vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
                
            } else {
                APdfs(graph, neigh, vis, dt, low, time, curr, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] <= low[neigh] && par != -1) {
                    ap[curr] = true;
                }
                children++;
            }
        }
        if(par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    //O(V+E)
    public static void getAP(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];

        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                APdfs(graph, i, vis, dt, low, time, -1, ap);
            }
        }

        for(int i=0; i<V; i++) {
            if(ap[i]) {
                System.out.println("AP: " + i);
            }
        }
    }
    public static void main(String[] args) {
        // int V = 4;
        // int V = 7;
        // int V = 6;
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //print 2's neighbours
        // for(int i=0; i<graph[2].size(); i++) { 
        //     Edge e = graph[2].get(i);
        //     // System.out.print(e.dest + " ");
        //     System.out.println(e.dest + " , " + e.wt);
        // }

        // boolean vis[] = new boolean[V];
        // for(int i=0; i<V; i++) {
        //     if(vis[i] == false) {
        //         bfs(graph, V, vis, i);
        //     }
        // }
        // bfs(graph, V);

        // for(int i=0; i<V; i++) {
        //         if(vis[i] == false) {
        //             dfs(graph, i, vis);
        //         }
        //     }
        // // dfs(graph, 0, vis);
        // System.out.println();

        // int src = 0, tar = 5;
        // printAllPath(graph, src, new boolean[V], "0", tar);

        // System.out.println(isCycleDirected(graph, new boolean[V], 0, new boolean[V]));
        // boolean vis[] = new boolean[V];
        // boolean rec[] = new boolean[V];
        // for(int i=0; i<V; i++) {
        //     if(vis[i] == false) {
        //         boolean isCycle = isCycleDirected(graph, vis, 0, rec);
        //         if(isCycle) {
        //             System.out.println(isCycle);
        //             break;
        //         }
        //     }
        // }

        // topSort(graph, V);

        // System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));

        // dijkshtra(graph, 0, V);

        // bellmanFord(graph, 0, V);

        // primsAlgo(graph, V);

        // kosarajuAlgo(graph, V);

        // getBridge(graph, V);

        getAP(graph, V);
    }}
