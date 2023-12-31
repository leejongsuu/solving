//예시 입력
/*
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0
*/

//예시 출력 12

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] maze = new int[7][7];

    public int BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Point p = Q.poll();
                if(p.x==6 && p.y==6) return level;
                else{
                    for(int j=0; j<4; j++){
                        int nx = p.x + dx[j];
                        int ny = p.y + dy[j];
                        if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && maze[nx][ny] == 0) {
                            Q.offer(new Point(nx, ny));
                            maze[nx][ny] = 1;
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        maze[0][0]=1;
        System.out.println(T.BFS(0, 0));
    }
}
