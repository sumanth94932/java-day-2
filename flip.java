import java.util.*;
public class flip{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(); 
        int b=s.nextInt();
        System.out.println(a^(1<<b));
    }
}