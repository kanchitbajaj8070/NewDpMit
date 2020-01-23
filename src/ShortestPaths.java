import sun.security.provider.certpath.Vertex;

import java.util.Arrays;

public class ShortestPaths {
    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        int target=graph.length;
        int src=0;
        int[] distances=new int [graph.length];

        Arrays.fill(distances,Integer.MAX_VALUE);
        distances[0]=0;
        while(src!=target)
        {
            for( int j=0;j<graph.length;j++) {
                if (graph[src][j] != 0) {
                    distances[j] = Math.min(distances[j], distances[src] + graph[src][j]);
                }
            }
            System.out.println(Arrays.toString(distances));
            src++;
        }
    }
/*    Vertex Distance from Source
0                0
        1                4
        2                12
        3                19
        4                21
        5                11
        6                9
        7                8
        8                14*/

}
