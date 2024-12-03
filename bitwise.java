 import java.util.*;
 class bit{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("bitwise and:"+(a&b));
        System.out.println("by formula:"+((a+b)-(a|b)));
        System.out.println("bitwise or:"+(a|b));
        System.out.println("by formula:"+((a+b)-(a&b)));
        System.out.println("bitwise xor:"+(a^b));
        System.out.println("by formula:"+((a|b)-(a&b)));
    }
 }