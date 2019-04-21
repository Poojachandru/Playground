import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int fd,sum=0;
      while(temp!=0)
      {
        fd = temp%10;
          sum =sum + fd;
        temp = temp/10;
      }
         System.out.println(sum);
	}
    }
