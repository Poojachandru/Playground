import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int num = n;
      for( int r=n;r>=1;r--)
      {
        for(int c=n;c>=1;c--)
        {
      System.out.print(c);
      }
        System.out.print("\n");
        n=n-1;
      }
    }
}