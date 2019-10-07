
package prec;


import java.util.Scanner;
import java.io.*;



public class DecimalFormatDemo {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
        try{
            Long b=sc.nextLong();
               System.out.println(b+" can be fitted in:");
             if(b>=Byte.MIN_VALUE && b<=Byte.MAX_VALUE)
               System.out.println("* byte");
             if(b>=Short.MIN_VALUE && b<=Short.MAX_VALUE)
               System.out.println("* short");
             if(b>=Integer.MIN_VALUE && b<=Integer.MAX_VALUE)
               System.out.println("* int");
             if(b>=Long.MIN_VALUE && b<=Long.MAX_VALUE)
               System.out.println("* long");
        }
       catch(Exception e){
            
           System.out.println(sc.next()+" can't be fitted anywhere.");
        }
                 
        
    }
    }
}













