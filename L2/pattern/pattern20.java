import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i,j;
        int space = 2*n-2;

        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            for(j=1; j<= space ; j++){
                System.out.print(" ");
            }   
            for(j=1; j<=i ; j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
        space+=4;
        for(i=n-1; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            for(j=1; j<= space ; j++){
                System.out.print(" ");
            }   
            for(j=1; j<=i ; j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }

    }
}
