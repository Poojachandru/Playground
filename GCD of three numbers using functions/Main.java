import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a= in.nextInt();
      int b = in.nextInt();
      int gcd= in.nextInt();
       for(int i =1; i<=a && i<=b; i++)
       {
          if(a%i==0 && b%i==0)
            gcd = i;
       }
      System.out.print(gcd);
	}
}