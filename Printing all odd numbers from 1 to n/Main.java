import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int n=0;n<=num;n++)
      { 
        if(n%2!=0)
          System.out.println(n);
   }
}
}