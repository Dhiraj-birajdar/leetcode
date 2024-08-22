class Solution {
    public int findComplement(int num) {
        String bin = Integer.toBinaryString(num)
        .replaceAll("1","2")
        .replaceAll("0","1")
        .replaceAll("2","0");
        return Integer.parseInt(bin,2);
    }
}