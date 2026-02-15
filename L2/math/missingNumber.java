import java.util.HashMap;

class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n,1);
        }

        for(int i=0;i<=nums.length;i++){
            if(!mp.containsKey(i)){
                return i;
            }
        }
        return 0;
    }
}