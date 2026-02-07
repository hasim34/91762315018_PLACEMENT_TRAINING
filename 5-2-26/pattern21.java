import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");  
        int n = sc.nextInt();
        int i, j;

        for(i=1; i<=n; i++){
            if(i==1 || i==n){
                for(j=1; j<=n; j++){
                    System.out.print("*");
                }
                
            }
            else{
                System.out.print("*");
                for(j=1; j<=n-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
