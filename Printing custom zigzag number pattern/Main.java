import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=0;
      for(int i=0;i<n;i++)
      {
          if(i%2==0)
          {
          num++;
          for(int j=0;j<n;j++)
          {
            if(j==n-1)
              num++;
            System.out.print(num);
          }
      }
           else
           for(int j=0;j<n;j++)
          {
            if(j==0)
              num++;
             if(j==1)
              num--;
            System.out.print(num);
        }
        System.out.println();
            
        }
          
	}
}