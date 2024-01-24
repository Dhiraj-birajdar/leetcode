class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length-1;
        for(int i = 0; i< n; i++){
            if(arr[i] == 0){
                for(int j = n; j>i; j--)
                    arr[j] = arr[j-1];
                i++;
            }
        }
    }
}