import java.util.*;
public class swap{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value:");
        int b=s.nextInt(); 
        int g=s.nextInt();
        int c=b;
        b=g;
        g=c;
        String reg=String.format ("after swapping \n boys=%d \n girls=%d",b,g);
        System.out.println(reg);
    }
}