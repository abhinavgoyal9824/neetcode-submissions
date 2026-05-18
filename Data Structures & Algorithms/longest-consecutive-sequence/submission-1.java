class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        int[] arr = new int[set.size()];
        int j = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int k = it.next();
            arr[j]=k;
            j++;
        }
        Arrays.sort(arr);
        int count=1;
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                count++;
            }else{
                max=Math.max(count,max);
                count=1;
            }
        }
        max=Math.max(count,max);
        return max;
    }
}
