class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int j=0;
       for(int val:nums){
        map.put(val,j++);
       }
       int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            int t = target - nums[i];
            if(map.containsKey(t) && map.get(t)!=i){
                arr[0]=Math.min(map.get(t),i);
                arr[1]=Math.max(map.get(t),i);
            }
        }
        return arr;  
    }
}
