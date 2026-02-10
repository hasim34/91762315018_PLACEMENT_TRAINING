class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int spaceCount = 0;
        int len = s.length();
        int i;
        for(i = len - 1 ; i >= 0; i-- ){
            if(s.charAt(i) == ' '){
                spaceCount++;
                if(spaceCount!=0 && count!=0){
                    break;
                }
            }
            else{
                count++;
            }
            
        }
        return count++;
    }
}