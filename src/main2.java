import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class main2
{
    public static void main (String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        if(a == b)
        {
            System.out.printf("%d\n%d\n",a,b);
        }else if (a > b)
        {
            System.out.printf("%d\n",a);
        }
        else
        {
            System.out.printf("%d\n",b);
        }
}
}
