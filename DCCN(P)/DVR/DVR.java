import java.util.*;

class DVR {
    static void BellmanFord(int g[][], int v) {
        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if (g[i][k] + g[k][j] < g[i][j])
                        g[i][j] = g[i][k] + g[k][j];
                }
            }
        }
        show(g,v);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No.of Vertices : ");
        int v = sc.nextInt();
        int INF = 999999;
        int g[][] = new int[v][v];
        System.out.println("Graph : ");
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                g[i][j]=sc.nextInt();
                if(g[i][j]==0 && i!=j) g[i][j]=INF;
            }
        }
        BellmanFord(g, v);
        System.out.print("Updated edge : ");
        int a1=sc.nextInt(), a2=sc.nextInt(), a3=sc.nextInt();
        g[a1][a2]=g[a2][a1]=a3;
        BellmanFord(g, v);
    }
    
    public static void show(int[][] g, int v){
        System.out.println("Shortest distances: ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++)
                System.out.print(g[i][j] + " ");
            System.out.println();
        }
    }
}