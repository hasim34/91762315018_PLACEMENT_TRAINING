class Solution {
    public String largestOddNumber(String num) {
        if((num.charAt(num.length()-1)-'0')%2 != 0){
            return num;
        }
        Integer markerEnd = null;

        for(int i=num.length() -1;i>=0;i--){
            if((num.charAt(i)-'0')%2 != 0){
                markerEnd = i;
                break;
            }
        }
        if(markerEnd == null){
            return "";
        }else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i<=markerEnd ; i++){
                sb.append(num.charAt(i));
            }
            return sb.toString();
        }
    }
}