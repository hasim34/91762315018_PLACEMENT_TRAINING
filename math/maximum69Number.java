class Solution {
    public int maximum69Number (int num) {
        String st = Integer.toString(num);
        int n;
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == '6' && flag==false){
                sb.append("9");
                flag = true;
            }else
            {sb.append(st.charAt(i));}
        }
        return Integer.parseInt(sb.toString());

    }
}