import java.util.*;
class equal{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if((a^b)==0)
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}