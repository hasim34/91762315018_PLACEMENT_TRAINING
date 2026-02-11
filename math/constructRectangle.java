class Solution {
    public int[] constructRectangle(int area) {
        int first =0, second=0;

        int root = (int)Math.sqrt(area);

        for(int i = root ; i>=1; i--){
            if(area%i == 0){
                second = i;
                break;
            }
        }
        first = area/second;
        return new int[]{first,second};
    }
}