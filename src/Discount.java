import java.util.*;
public class Discount {
    public static void disc(int q, int p, int dis){
        if(q>10){
            int totalPrice=q*p;
            double discount=(double) totalPrice*(double) ((double) dis/100);
            double totalAmount=totalPrice+discount;
            System.out.println("Total amount paid by customer "+totalAmount);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int quantity=sc.nextInt();
        int price_per_item=sc.nextInt();
        int dis= sc.nextInt();
        disc(quantity,price_per_item, dis);
    }
}



