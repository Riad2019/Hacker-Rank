import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner n=new Scanner(System.in);
		n.nextInt();
		String x=n.next();
		int y=0;
		for(char ch='a';ch<='z';ch++)
		{
		    
			if(x.toLowerCase().contains(String.valueOf(ch)))
				y++;
		}
		if(y==26)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
