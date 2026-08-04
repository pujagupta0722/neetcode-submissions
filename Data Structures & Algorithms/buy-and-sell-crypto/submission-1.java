class Solution {
    public int maxProfit(int[] arr) {
        int mn = arr[0];
        int pf = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]-mn >pf){
                pf= arr[i]-mn;
            }
            mn = Math.min(arr[i],mn);
        }
        return pf;
    }
}
