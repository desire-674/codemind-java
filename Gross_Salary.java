import java.util.*;
public class we{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextInt();
        double hra=0;
        double da=0;
        double gs=0;
        if(bs<=10000){
            da=bs*0.8;
            hra=bs*0.2;
        }
        else if(bs<=20000){
            da=bs*0.9;
            hra=bs*0.25;
        }
        else {
            da=bs*0.95;
            hra=bs*0.3;
        }
        gs=bs+da+hra;
        System.out.printf("%.2f",gs);
}
}