import java.util.*;
class Subset {
    private static void subSet(String s,int index,String ans){
        if(index==s.length()){
            System.out.println(ans);
            return;
        }
        subSet(s,index+1,ans+s.charAt(index));
        subSet(s,index+1,ans);
    }
    public static void main(String[] args) {
        subSet("radha",0,"");

    }
}