class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];
        for(int i = 0; i<image.length; i++){
            for(int k=0,j = image[i].length-1; j>=0; j--,k++){
                res[i][k] = image[i][j]==0?1:0;
            }
        }
        return res;
    }
}