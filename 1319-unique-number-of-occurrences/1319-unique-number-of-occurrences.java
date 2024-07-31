class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        var map = new HashMap<Integer,Integer>();
        for(int i: arr){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i,1);
        }
        map.forEach((k,v)-> System.out.println(k+" => "+v));
        return map.size() == new HashSet<>(map.values()).size();
    }
}