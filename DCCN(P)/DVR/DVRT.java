import java.util.Scanner;

class DVRT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dist = new int[n][n];

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
        for (int i = 0; i < n; i++) {
            System.out.println("Router " + (i + 1) + " table:");
            for (int j = 0; j < n; j++) {
                System.out.println("To " + (j + 1) + " Dist: " + dist[i][j]);
            }
        }
    }
}