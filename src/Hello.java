import java.util.*;
public class Hello {
    public static void main(String[] args) {
        /*System.out.println("My name is Radha Raman");
        System.out.println("Hello world");*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t=arr[0];
        int u=arr[1];
        int d=t+u;
        for(int i=2;i<n;i++) {

            if (arr[i] == d + t) {
                d = arr[i];
                t = arr[i - 1];
            }
        }
        System.out.println((int) Math.ceil((double)arr[n-1]*(double)(arr[n-2]/(double)arr[n-3])));
    }
}
