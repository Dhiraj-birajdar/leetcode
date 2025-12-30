class Solution {//time O(n*k)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            // String pattern = getPattern(s);
            // if(map.containsKey(pattern)){
            //     map.get(pattern).add(s);
            // }else{
            //     List<String> list = new ArrayList<>();
            //     list.add(s);
            //     map.put(pattern,list);
            // }
            map.computeIfAbsent(getPattern(s), k -> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }

        private String getPattern(String s){
        if(s.isEmpty()) return s;
        int[] arr = new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']+=1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                sb.append((char) (i + 'a')).append(arr[i]);
            }
        }
        return sb.toString();
    }

}

//sorting approach time O(n*k log k)
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> m = Arrays.asList(strs)
//                 .stream().collect(Collectors.groupingBy(s->{
//                     char[] a =s.toCharArray();
//                     Arrays.sort(a);
//                     return new String(a);
//                 }));

//         return new ArrayList<>(m.values());
//     }
// }