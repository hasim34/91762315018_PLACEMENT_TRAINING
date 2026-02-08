import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i, j;
        int size = 2*n-1;
        
        for(i=1; i<=size; i++){
            for(j=1; j<=size; j++){
                int top = i-1;
                int left = j-1;
                int right = size-j;
                int bottom = size-i;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n-min);
            }
            System.out.println();
        }
        
    }
}
