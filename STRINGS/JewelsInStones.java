
public class JewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for(char ch: jewels.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        int count =0;
        for(char ch: stones.toCharArray()){
            if(mp.containsKey(ch)){
                count += mp.get(ch);
            }
        }
        return count;
    }
} 
