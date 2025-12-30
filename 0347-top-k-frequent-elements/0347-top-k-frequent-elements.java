//O(n)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(bucket[entry.getValue()]==null){
                bucket[entry.getValue()]=new ArrayList<Integer>();
            }
            bucket[entry.getValue()].add(entry.getKey());
        }
        List<Integer> res = new ArrayList<>();
        for(int i=nums.length;i>=0 && res.size()<k;i--){
            if(bucket[i]!=null){
                res.addAll(bucket[i]);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }

    //O(n + m log m)
    public int[] __topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}