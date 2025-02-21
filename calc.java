import java.util.Scanner;
import java.lang.*;
public class calc{
     public static void main(String args[]){
     int var;
     Scanner ob=new Scanner(System.in);
     
     while(true){
             System.out.println("\nenter the option\n1.Add\n2.subtract\n3.multiply\n4.divition\n5.exit");
             int opt=ob.nextInt();
             System.out.println("\nenter two numbers:");
             int a=ob.nextInt();
             int b=ob.nextInt();
             if(opt==1){
                var=a+b;
                System.out.println("result is:"+ var);
             }else if(opt==2){
                  var=a-b;
                  System.out.println("result is:"+ var);
             }else if(opt==3){
                 var=a*b;
                 System.out.println("result is:"+var);
             }else if(opt==4){
                var=a/b;
                System.out.println("result is:"+var);
     }else{
        System.exit(0);
     }
   
   }
     }
}
