import java.math.BigInteger;
import java.util.Scanner;

  public class HCKR{

      public static void main(String[] args) {
          Scanner In =new Scanner(System.in);
          BigInteger a =In.nextBigInteger();
          BigInteger b=In.nextBigInteger();
          BigInteger c,d;
          c =a.add(b);
          d=a.multiply(b);
          System.out.println(c);
          System.out.println(d);

         }
      }
