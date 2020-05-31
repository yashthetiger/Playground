import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=in.nextInt();
    int great=0;
    for(int i=1;i<n;i++)
      if(list[i]>list[great])
        great=i;
    System.out.println(great);
  }
}