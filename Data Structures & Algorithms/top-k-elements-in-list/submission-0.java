class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        int[][] arr = new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            arr[i][0]=e.getKey();
            arr[i][1]=e.getValue();
            i++;
        }
        Arrays.sort(arr,(a,b) -> b[1]-a[1]);
        int[] f = new int[k];
        for(int j=0;j<k;j++){
            f[j]=arr[j][0];
        }
        return f;
    }
}
