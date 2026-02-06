class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dam=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(dam.contains(nums[i])){
                return true;
            }
            dam.add(nums[i]);
        }
        return false;
    }
}