import java.util.Scanner;

  public class HCKR{

      public static void main(String[] args) {
          Scanner In =new Scanner(System.in);
         int n = In.nextInt();
          int [] a=new int[n];
          for(int i=0; i<n;i++){
              a[i] =In.nextInt();

          }
          for(int i=0; i< a.length ;i++){
              System.out.println(a[i]);


          }

         }
      }
