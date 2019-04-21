import java.util.Scanner;
 class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
        int large = 0;
        if(n1>n2 && n1>n3)
            large= n1;
        else if(n2>n1 && n2>n3)
            large = n2;
        else
          large=n3;
     
        System.out.print(large);
    }
 } 
     