import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer : ");
        int n = sc.nextInt();

        int i, j;
        int space = 0;
        int temp = n;
        for(i=1; i<=n; i++){
            for(j=1; j<=temp; j++){
                System.out.print("*");
            }
            for(j=1; j<= space ; j++){
                System.out.print(" ");
            }   
            for(j=1; j<=temp ; j++){
                System.out.print("*");
            }
            space+=2;
            temp--;
            System.out.println();
        }
        space-=2;
        temp++;
        for(i=n; i>=1; i--){
            for(j=1; j<=temp; j++){
                System.out.print("*");
            }
            for(j=1; j<= space ; j++){
                System.out.print(" ");
            }   
            for(j=1; j<=temp ; j++){
                System.out.print("*");
            }
            space-=2;
            temp++;
            System.out.println();
        }
        sc.close();
    }
}
