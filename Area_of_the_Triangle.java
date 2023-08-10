import java.util.*;
public class A{
    public static void main(String[]args)
    {
        
        
        Scanner sc=new Scanner(System.in);
       double a=sc.nextDouble();
         double b=sc.nextDouble();
       double c=sc.nextDouble();
        double s= (a+b+c)/2;
        double k=s*(s-a)*(s-b)*(s-c);
        double area= Math.sqrt(k);
    
       System.out.printf("%.2f",area);
        
    }
}