import java.util.HashMap;
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int n : nums){
            mp.put(n, mp.getOrDefault(n, 0)+1);
        }
        int lhs = 0;
        for(int key: mp.keySet()){
            if(mp.containsKey(key+1)){
                if( (mp.get(key) + mp.get(key+1) > lhs)){
                    lhs = mp.get(key) + mp.get(key+1) ;
                }
            }
        }
        return lhs;
    }
}