import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int i=1;
      while(temp!=0)
      {
      	temp=temp/10;
        i=i*10;
      }
      i=i/100;
      int fd=n/i;
      int sec = fd% 10;
      System.out.println(sec);
	}
}