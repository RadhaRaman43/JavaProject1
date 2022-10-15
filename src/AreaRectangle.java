import java.util.*;
public class AreaRectangle {
    public void area(int a, int b){
        int area=a*b;
        System.out.println("Area of rectangle "+area);
    }
    public double areaOfCircle(double r){

        double area=(r*r)*22/7;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double r= sc.nextDouble();
        AreaRectangle obj=new AreaRectangle();
        obj.area(a,b);
        System.out.println("Area of circle is "+obj.areaOfCircle(r));

    }
}
