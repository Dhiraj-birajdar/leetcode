class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
// import java.util.Arrays;
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int k = 0;
//         int head=0,tail=nums.length-1;
//         while(head<=tail)if(nums[head++]!=val)k++;
//         head = 0;
//         while(head<tail){
//             while(head<tail && nums[head]!=val) head++;
//             while(tail> head && nums[tail]==val) tail--;
//             if(head<tail){
//                 nums[head] = nums[tail];
//                 head++;tail--;
//             }
//         }
//         return k;
//     }
// }