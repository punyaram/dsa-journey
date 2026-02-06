class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map1.put(nums[i], map1.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int key : map1.keySet()){
            int freq = map1.get(key);

            if(bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int l=0;

        for(int i=bucket.length-1; i>=0 && l<k; i--){
            if(bucket[i] != null){
                for(int num:bucket[i]){
                    if(l<k){
                        res[l++]=num;
                    }
                }
            }
        }

        return res;
    }
}
