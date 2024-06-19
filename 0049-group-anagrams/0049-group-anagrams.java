class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = Arrays.asList(strs)
                .stream().collect(Collectors.groupingBy(s->{
                    char[] a =s.toCharArray();
                    Arrays.sort(a);
                    return new String(a);
                }));

        return new ArrayList<>(m.values());
    }
}