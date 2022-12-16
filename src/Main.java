import java.util.Scanner;

public class Main
{
  public static void main(String [] arges)throws Exception
  {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      scan.close();
      if(a < b)
      {
          System.out.printf("NG\n");
      }
      else
      {
          System.out.printf("%d\n",a/b);
          System.out.printf("%d\n",a%b);
      }
  }
}