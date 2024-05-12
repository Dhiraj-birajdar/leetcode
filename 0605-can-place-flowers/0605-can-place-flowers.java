class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(n==0) return true;
        if(n > Math.ceil(flowerbed.length/2.0)) return false;
        if(flowerbed.length == 1 && flowerbed[0] == 0 && n ==1) return true;
        
        int i = 0, c = 0;
        
        if(flowerbed[0] == 1) 
            i+=2;
        else if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            c++;
            i = 1;
        }else if(flowerbed[0] == 0 && flowerbed[1] == 1) i=3;

        while(i < flowerbed.length-1){
            if(flowerbed[i] == 0 && (flowerbed[i-1]==0 && flowerbed[i+1]==0)){
                flowerbed[i] = 1;
                c++;
                i++;
            }else
                i++;
        }
        
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2] == 0) c++;
        
        return n<=c? true: false;
    }
}