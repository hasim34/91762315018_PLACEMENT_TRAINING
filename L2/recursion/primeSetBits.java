class Solution {
    public int num(int n){
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int[] ar =  {2,3,5,7,11,13,17,19};
        int countPrime = 0;
        for(int i = left ; i<=right; i++){
            int temp = num(i);
            for(int n: ar){
                if(temp == n){
                    countPrime++;
                }
            }
        }
        return countPrime;
    }
}