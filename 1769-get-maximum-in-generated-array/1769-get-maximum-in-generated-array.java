class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2) return n;     

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int i = 1;

        while(++i <= n){            
            if(i%2==1){
               arr[i] = arr[i/2] + arr[i/2+1];
            }else{
                arr[i] = arr[i/2];
            }
         }
        return Arrays.stream(arr).max().getAsInt();
    }
}