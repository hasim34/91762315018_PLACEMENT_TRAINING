import java.util.Scanner;

public class pattern13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number :");
        int n = sc.nextInt();      
        int i,j;
        int temp = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
