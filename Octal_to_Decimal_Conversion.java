import java.util.Scanner;
public class OctaltoDecimal
{
     public static void main(String[]args){
         
         Scanner sc=new Scanner(System.in);
         int  octal;
        octal=sc.nextInt();
         
        int decimal=0;
        int n=0;
        
        while(true){
        if(octal == 0)
        {    
        break;    
        }
         else {    
          int temp = octal%10;    
          decimal += temp*Math.pow(8, n);    
          octal = octal/10; 
           
          n++;    
          }    
    }    
        
        System.out.println(decimal);    
       }
        }
