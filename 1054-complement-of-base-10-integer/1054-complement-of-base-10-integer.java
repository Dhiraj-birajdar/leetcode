class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n)
        .replaceAll("1","2")
        .replaceAll("0","1")
        .replaceAll("2","0");
        return Integer.parseInt(bin,2);
    }
}