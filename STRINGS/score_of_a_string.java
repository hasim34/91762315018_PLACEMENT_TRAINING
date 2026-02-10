class Solution {
    public int scoreOfString(String s) {
        int len = s.length();
        int score =0 ;
        for(int i=0;i<len-1;i++){
            score += Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        return score;
    }
}