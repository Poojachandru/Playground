import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
     int num1= n/100;
      int num2=n%10;
      int sum=num1+num2;
      System.out.println(sum);
	}
}