import java.util.Scanner;
public class larger{
    public static void main(String args[]){
           Scanner ob= new Scanner(System.in);
           System.out.println("enter the first no:");     
           int a=ob.nextInt();
           System.out.println("enter the second no:");     
           int b=ob.nextInt();
           if(a > b){
               System.out.println("\n first no is great");
           }else if( a < b){
               System.out.println("\n second no is great");
           }else{
               System.out.println("\n both are same");
           }
    
    }


}
