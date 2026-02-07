import java.util.Scanner;

public class pattern7 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();                           
        int i,j;
        int t = 1;
        int space = n-1;
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
            t+=2;
            space--;
            System.out.println();
        }
    }
}
