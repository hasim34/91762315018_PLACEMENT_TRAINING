import java.util.Scanner;

public class pattern11 {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {   
            int val;
            if(i%2==0)
            {
                val = 0;
            }
            else
            {
                val = 1;
            }
             
            for(j=1;j<=i;j++)
            {
                System.out.print(val + " ");
                val = 1-val;
            }
            System.out.println();
        }
    }
}
