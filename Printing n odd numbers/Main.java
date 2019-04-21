import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    int  count = 1;
      int num;
      for( num=1;num<=2*n;num++)
      {
        if(count%2==1){
        System.out.println(count);
      }
      count=count+1;
	}
}
}