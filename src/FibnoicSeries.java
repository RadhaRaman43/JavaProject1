import java.util.*;

public class FibnoicSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(isAp(arr,n))
        System.out.println(arr[n-1]+arr[n-1]-arr[2]);
        else if (isGp(arr,n))
            System.out.println((int) Math.ceil((double)arr[n-1]*(double)(arr[n-2]/(double)arr[n-3])));
        else if (isFib( arr,n))
            System.out.println(arr[n-1]+arr[n-2]);
        else System.out.println(-999);



    }
    public static boolean isAp(int[] arr,int n){
        int d=arr[1]-arr[0];
        int t=arr[0];
        for(int i=1;i<n;i++){
            if(t+d==arr[i]){
                t=arr[i];
            }
            else return false;
        }
        return true;

    }
    public static boolean isGp(int[] arr,int n){
        double r=(double) arr[1]/(double) arr[0];
        if(Math.ceil(r)!=Math.floor(r))
            return false;
        int t=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]==t*r) {
                System.out.println(r);

                t=arr[i];
            }
            else return false;
        }
        return true;
    }
    public static boolean isFib(int []arr, int n){

        int t=arr[0];
        int u=arr[1];
        int d=t+u;
        for(int i=2;i<n;i++){

            if(arr[i]==d+t){
                d=arr[i];
                t=arr[i-1];
            }
            else return false;
        }
        return true;
    }
}