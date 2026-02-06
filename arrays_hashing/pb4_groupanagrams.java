class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map1=new HashMap<>();
        int k=0;
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map1.containsKey(key)){
                map1.put(key,new ArrayList<>());
            }
            map1.get(key).add(strs[i]);
        }
        return new ArrayList<>(map1.values());
    }
}
