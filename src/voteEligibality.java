import java.util.*;

public class voteEligibality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18) System.out.println("He/She is aligible for voting ");
        else System.out.println("He/she is not aligible for voting");
    }
}
