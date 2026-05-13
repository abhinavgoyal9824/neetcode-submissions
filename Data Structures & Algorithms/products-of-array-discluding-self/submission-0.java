class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int count=0;
        int t=1;
        int z=1;
        for(int val:nums){
            if(val==0){
                count++;
            }else{
                z=z*val;
            }
            t=t*val;
        }
        if(count>1){
            int[] arr = new int[n];
            return arr;
        }else if(count==0){
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=t/nums[i];
            }
            return arr;
        }else{
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    arr[i]=z;
                }
            }
            return arr;
        }
    }
}  
