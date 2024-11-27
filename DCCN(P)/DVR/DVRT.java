import java.util.Scanner;

class DVRT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No.of vertices : ");
        int n = sc.nextInt();
        int[][] dist = new int[n][n];
        System.out.println("Graph : ");
        // Input cost matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = sc.nextInt();
            }
        }

        // Close the scanner
        sc.close();

        // Distance Vector Algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // Print result
        System.out.println("Shortest Distances : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(dist[i][j]+" ");
            }
            System.out.println();
        }
    }
}
