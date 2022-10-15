import java.util.*;
public class GrossSalary {
    public static void grosSalary(double basicSalary){
        double ta= 0.10*basicSalary;
        double da=.15*basicSalary;
        double hra=.20*basicSalary;
        double pf=.12*basicSalary;
        double bonus;
        if(basicSalary>=20000){
             bonus=.10*basicSalary;
        }
        else {
            bonus=.20*basicSalary;

        }
        double grossSalary=ta+da+hra+bonus+basicSalary-pf;
        System.out.println(grossSalary);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Input basic salary");
        double basicSalary=sc.nextDouble();
        grosSalary(basicSalary);
    }
}
