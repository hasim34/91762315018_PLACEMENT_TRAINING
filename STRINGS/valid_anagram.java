class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // HashMap<Character, Integer> mp = new HashMap<>();
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(char ch : s.toCharArray()){
        //     mp.put(ch, mp.getOrDefault(ch, 0)+1);

        // }

        // for(char ch: t.toCharArray()){
        //     if(mp.containsKey(ch) == false){
        //         return false;
        //     }
        //     mp.put(ch, mp.get(ch)-1);
        //     if(mp.get(ch)==0){
        //         mp.remove(ch);
        //     }
        // }
        // for(char ch : t.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }

        // if(mp.equals(map)){
        //     return true;
        // }else{
        //     return false;
        // }

        // return mp.isEmpty();

        int[] ar = new int[26];

        for(int i=0;i<s.length();i++){
            ar[s.charAt(i) - 'a']++;
            ar[t.charAt(i) - 'a']--;
        }
        for(int x: ar){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}