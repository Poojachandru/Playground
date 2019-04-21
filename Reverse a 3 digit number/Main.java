import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int[] a={0,0,0};
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    for(int i=0;i<3;i++)
    {
      a[i]=n%10;
      n=n/10;
  }
    int rev=a[0]*100+a[1]*10+a[2];
    System.out.println(rev);
}
}