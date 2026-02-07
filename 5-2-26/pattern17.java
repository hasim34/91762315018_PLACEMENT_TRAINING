import java.util.Scanner;

public class pattern17 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i,j;
        int space = n-1;
        int character = 65;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=space;j++)
            {
             System.out.print(" ");   
            }
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(character + j - 1));
            }
            for(j=i-1;j>=1;j--)
            {
                System.out.print((char)(character + j - 1));
            }
            space--;
            System.out.println();
        }
    }
}
