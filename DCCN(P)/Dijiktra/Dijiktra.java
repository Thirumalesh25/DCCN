import java.util.*;

class Dijiktra{
    public static final int INF=Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No.of Vertices : ");
        int v=sc.nextInt();
        int g[][]=new int[v][v];
        System.out.println("Graph : ");
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                g[i][j]=sc.nextInt();
                if(g[i][j]==0 && i!=j) g[i][j]=INF;
            }
        }
        System.out.print("Source : ");
        dijikras(g, sc.nextInt(), v);
    }
    static void dijikras(int[][]g , int s, int v){
        int[] d=new int[v];
        Arrays.fill(d,INF);
        d[s]=0;
        Queue<Integer> q=new PriorityQueue<>(Comparator.comparingInt(n->d[n]));
        q.offer(s);
        while(!q.isEmpty()){
            int k=q.poll();
            for(int i=0;i<v;i++){
                if(g[k][i]!=INF && d[k]+g[k][i]<d[i]){
                    d[i]=d[k]+g[k][i];
                    q.offer(i);
                }
            }
        }
        print(d);
    }
    static void print(int[] d){
        System.out.println("Vertex\t\tDistance");
        for(int i=0;i<d.length;i++){
            System.out.println(i + "\t\t" + (d[i] == INF ? "INF" : d[i]));
        }
    }
}