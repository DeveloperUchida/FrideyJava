import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main
{
   public static void main(String[] args)throws Exception
   {
      Scanner scan = new Scanner(System.in);
      int input = scan.nextInt();
      scan.close();
      System.out.printf("%d\n", input*5);
   }
}