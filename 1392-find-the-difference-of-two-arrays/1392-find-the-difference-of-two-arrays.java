class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var l1 = new ArrayList<>(Arrays.stream(nums1).boxed().toList());
        var l2 = new ArrayList<>(Arrays.stream(nums2).boxed().toList());
        var l1copy = new ArrayList<>(Arrays.stream(nums1).boxed().toList());
        l1.removeAll(l2);
        l2.removeAll(l1copy);

        // System.out.println(l1);
        // System.out.println(l2);
        
        var res = new ArrayList<List<Integer>>();
       res.add(new HashSet<>(l1).stream().toList());
        res.add(new HashSet<>(l2).stream().toList());
        return res;
    }
}