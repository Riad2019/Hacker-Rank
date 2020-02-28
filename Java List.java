import java.util.LinkedList;
import java.util.Scanner;

  public class HCKR{

      public static void main(String[] args) {
          Scanner In =new Scanner(System.in);
          LinkedList<Integer> linkedList = new LinkedList<Integer>();
          int a = In.nextInt();
          for(int i=0 ; i<a;i++){
              linkedList.add(In.nextInt());

          }

          for(int query =In.nextInt();query>0 ; query--){
              if(In.next().equals("Insert")){
                  linkedList.add(In.nextInt(), In.nextInt());
              }
            else{
                linkedList.remove(In.nextInt());

              }


          }

          for(int number: linkedList){
              System.out.println(number+" ");
          }

          }

         }

