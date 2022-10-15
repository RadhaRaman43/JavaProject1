import java.util.*;
public class Subset {
    private static void subSet(String s,int index,String ans){
        if(index==s.length()){
            System.out.println(ans);
            return;
        }
        subset(s,index+1,ans+s.charAt(index));
        subset(s,index+1,ans);
    }
    public static void main(String[] args) {
        subSet("radha",0,"");

    }
}
