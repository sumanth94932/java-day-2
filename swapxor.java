import java.util.*;
class swapxor{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        a=(a^b);
        b=a^b;
        a=a^b;
        String r=String.format("after swapping \n a=%d \n b=%d",a,b);
        System.out.println(r);
    }
}