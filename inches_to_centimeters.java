import java.util.*;
public class Inchtocm{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        
      double inch=sc.nextInt();
      double cm= inch*2.54;
      System.out.format("%.2f",cm);
        
        
    }
}