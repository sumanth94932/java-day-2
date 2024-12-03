import java.util.*;
public class assignn{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=s.nextInt();
       System.out.printf("assign addition:"+(a+=6) +"\n assign substraction:"+(a-=3)+"\n assign multiplication:"+(a*=2)+"\n assign division:"+(a/=2)+"\n assign modulus:"+(a%=5));
    }
}

