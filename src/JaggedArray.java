import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows in the array");
        int row=sc.nextInt();
        int[][] arr=new int[row][];
        int len=0;
        System.out.println("input no of elements in each column ");
        for(int i=0;i<row;i++){
            int a=sc.nextInt();
            arr[i] =new int[a];
            len+=a;
        }
        System.out.println("No of elements present in the array is "+len);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
