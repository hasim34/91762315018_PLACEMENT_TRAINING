import java.util.Scanner;

public class pattern8 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i,j;
        int t = 2*n-1;
        int space = 0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=space;j++)
            {
             System.out.print(" ");   
            }
            for(j=1;j<=t;j++)
            {
                System.out.print("*");
            }
            t-=2;
            space++;
            System.out.println();
        }
    }
}
 
