//예시 입력
/*
9 12
1 2 12
1 9 25
2 3 10
2 8 17
2 9 8
3 4 18
3 7 55
4 5 44
5 6 60
5 7 38
7 8 35
8 9 15
*/

//예시 출력 196

//크루스칼
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int v1, v2, cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {

    static int[] unf;
    static ArrayList<Edge> list = new ArrayList<>();;

    public static int Find(int v) {
        if(v==unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if(fa!=fb) unf[fa] = fb;
    }

    public static int solution() {

        int answer = 0;
        Collections.sort(list);

        for (Edge ob : list) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if (fv1 != fv2) {
                answer += ob.cost;
                Union(ob.v1, ob.v2);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(new Edge(a, b, c));
        }

        System.out.println(solution());
    }
}

//프림
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int vex, cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {

    static int[] ch;
    static ArrayList<ArrayList<Edge>> list = new ArrayList<>();

    public int dijk(int v) {

        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();

        pQ.offer(new Edge(v, 0));
        while (!pQ.isEmpty()) {

            Edge o = pQ.poll();
            int now = o.vex;
            if (ch[now] == 0) {
                ch[now] = 1;
                answer += o.cost;
                for (Edge ob : list.get(now)) {
                    if(ch[ob.vex]==0) pQ.offer(new Edge(ob.vex, ob.cost));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        ch = new int[v + 1];
        for (int i = 0; i <= v; i++) list.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.get(a).add(new Edge(b, c));
            list.get(b).add(new Edge(a, c));
        }

        System.out.println(T.dijk(1));
    }
}
