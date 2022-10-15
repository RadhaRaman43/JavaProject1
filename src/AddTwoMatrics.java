import java.util.*;
public class AddTwoMatrics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.println("Enter the size of the matrices");
        r1=sc.nextInt();
        c1=sc.nextInt();
        r2=sc.nextInt();
        c2=sc.nextInt();

        int[][] matrics1 = new int[r1][c1];
        int[][] matrics2 = new int[r2][c2];
        int[][] matrics3 = new int[r1][c1];
        if(r1==r2 && c1==c2){
            System.out.println("Enter the first matrics elements");
            for(int i=0;i<r1;i++){
             for(int j=0;j<c1;j++){
                matrics1[i][j]=sc.nextInt();
                }
            }

            System.out.println("Enter the second matrics elements");
            for(int i=0;i<r1;i++){
             for(int j=0;j<c1;j++){
                matrics2[i][j]=sc.nextInt();
                }
            }

            System.out.println("Add the elements of two matrics");
            for(int i=0;i<r1;i++) {
                for (int j = 0; j < c1; j++) {
                    matrics3[i][j] = matrics1[i][j] + matrics2[i][j];
                }
            }
            System.out.println("display first matrics");
            for(int i=0;i<r1;i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(matrics1[i][j]+"  ");
                }
                System.out.println();
            }

            System.out.println("display second matrics");
            for(int i=0;i<r1;i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(matrics2[i][j]+"  ");
                }
                System.out.println();
            }
            System.out.println("display third matrics");
            for(int i=0;i<r1;i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(matrics3[i][j]+"  ");
                }
                System.out.println();
            }

        }
        else System.out.println("dimension of the matrics are not matching so we can add the matrics");

    }
}
