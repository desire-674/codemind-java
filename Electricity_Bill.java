import java.util.*;
public class bill{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
       
        int u=sc.nextInt();
        double cost=0;
        double c=0;
        double total=0;
        double charge=0;
        if(u <=199){
            cost= u*1.20;
            c=1.20;
        }
        else if(u>=200 && u<400)
        {
            cost=u*1.40;
            c=1.40;
        }
        else if(u>=400 && u<600 )
        {
            cost=u*1.60;
            c=1.60;
        }
        else if(u>=600 &&u<800){
            cost=u*1.80;
            c=1.80;
            }
     else if (u>=800){
                cost=u*2.00;
                c=2.00;
        }
        if(cost>=400){
            charge= (15 * cost /100);
        }
        
   
         
       total=cost+charge;
       System.out.printf("Units Consumed: %d
",u);
       System.out.printf("Cost per Unit: %.2f
",c);
       System.out.printf("Bill: %.2f
",cost);
       System.out.printf("Surcharge: %.2f
",charge);
       System.out.printf("Total Amount: %.2f
",total);
       
       
    }
    
}