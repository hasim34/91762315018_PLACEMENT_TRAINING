class Solution {
    public static boolean isVowel(Character ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public String reverseVowels(String s) {
        char[] ar = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            if(!isVowel(ar[i])){
                i++;
                continue;
            } 
            if(!isVowel(ar[j])){
                j--;
                continue;
            }
            
            char c = ar[i];
            ar[i] = ar[j];
            ar[j] = c;
            i++;
            j--;
            
        }

        return new String(ar);
    }
}