import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i, j;
        int character = 65 + n - 1; // ASCII value of 'A'
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) (character + j - 1) + " ");
            }
            character--;
            System.out.println();
        }
    }
}
