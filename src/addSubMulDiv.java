import java.util.*;
public class addSubMulDiv {
    public int add(int a, int b){
        int add=a+b;
        return add;
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
    public int div(int a, int b){
         int n=a/b;
         return n;
    }
    public void mul(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        addSubMulDiv abj=new addSubMulDiv();
        System.out.println(abj.add(n1,n2));
        abj.sub(n1, n2);
        System.out.println( abj.div(n1,n2));
        addSubMulDiv moob=new addSubMulDiv();



    }
}
