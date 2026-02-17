public class sumOfN {
    public static int findSum(int n) {
        // code here
        if(n==0){
            return 0;
        }else{
            return n + findSum(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findSum(n));
    }
}
