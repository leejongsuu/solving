//예시 입력 
/*
3 2
3 6 9
*/

//예시 출력
/*
3 6
3 9
6 3
6 9
9 3
9 6
*/
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] arr, pm, ch;

    public void DFS(int L){
       if(L==m) {
           for(int x : pm) System.out.print(x+ " ");
           System.out.println();
       } else{
           for (int i = 0; i < n; i++) {
               if(ch[i]==0){
                   ch[i] = 1;
                   pm[L] = arr[i];
                   DFS(L + 1);
                   ch[i]=0;
               }
           }
       }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0);
    }
}
