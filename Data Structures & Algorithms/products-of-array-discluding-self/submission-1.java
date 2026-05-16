class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                p[i]=1;
            }else{
                p[i]=p[i-1]*nums[i-1];
            }
        }
        int[] s = new int[n];
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                s[i]=1;
            }else{
                s[i]=s[i+1]*nums[i+1];
            }
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=p[i]*s[i];
        }
        return arr;
    }
}  
