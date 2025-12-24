class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples =  0;
        int boxes = 0;
        int capacitySum=0;
        for(int i:apple) totalApples+=i;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            capacitySum+=capacity[i];
            boxes++;
            if(capacitySum>=totalApples) return boxes;
        }
        return boxes;
    }
}

// class Solution {
//     public int minimumBoxes(int[] apple, int[] capacity) {
//         int sum=0,cap=0,c=0;
//         for(int i:apple) sum+=i;
//         Arrays.sort(capacity);
//         for(int i= capacity.length-1;i>=0;i--){
//             if((cap+=capacity[i])>=sum){
//                 return ++c;
//             }
//             c++;
//         }
//         return c;
//     }
// }