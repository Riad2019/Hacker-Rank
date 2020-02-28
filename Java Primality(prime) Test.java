import java.math.BigInteger;
import java.util.Scanner;

  public class HCKR{

      public static void main(String[] args) {
          Scanner In =new Scanner(System.in);
          BigInteger N =In.nextBigInteger();
          System.out.println(N.isProbablePrime(1) ? "prime":"not prime");

         }
      }
