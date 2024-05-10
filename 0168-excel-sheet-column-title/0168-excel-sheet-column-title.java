class Solution {
    public String convertToTitle(int columnNumber) {
        String s = "";
        int r;
        while(columnNumber-- > 0){
            r = (columnNumber)%26;
            s = (char)('A'+ r) + s;
            columnNumber = (columnNumber) / 26;
        }
        return s;
    }
}