Initialize the length of the input array nums to n.

Create two arrays, prefix and suffix, both initialized with ones and having the same length as nums. These arrays will hold the products of elements before and after each index in the nums array.

Calculate the prefix products. This loop starts from index 1 and goes up to n - 1. For each index i, prefix[i] is assigned the product of all elements before nums[i].

Calculate the suffix products. This loop starts from the second-to-last index (n - 2) and goes backward down to 0. For each index i, suffix[i] is assigned the product of all elements after nums[i].

Multiply the corresponding prefix and suffix products for each index to get the final result. This is done by iterating over each index i and calculating prefix[i] * suffix[i].

Return the answer, which is the list containing the products of all elements except the element at each index.
​Intuition
The problem requires us to find the product of all elements in the array except for the current element. One way to approach this is to calculate the product of all elements to the left of the current element and the product of all elements to the right of the current element, and then multiply these two products.

Approach
Left Product Array:

Initialize an array leftProduct to store the product of all elements to the left of each element.
Set leftProduct[0] to 1 since there are no elements to the left of the first element.
Iterate through the input array from index 1 to the end.
For each element nums[i], set leftProduct[i] to the product of all elements to the left of nums[i] by multiplying leftProduct[i - 1] with nums[i - 1].
Right Product Calculation During Array Modification:

Initialize a variable rightProduct to keep track of the product of all elements to the right of the current element.
Iterate through the input array from right to left.
For each element nums[j], update nums[j] to the product of all elements to its left (leftProduct[j]) multiplied by all elements to its right (rightProduct).
Update rightProduct by multiplying it with the current element nums[j].
Screenshot from 2024-03-15 06-54-05.png

Return the Modified Array:

Once the modification is done, return the modified nums array, which now contains the product of all elements except itself.
Complexity
Time complexity: O(n), where n is the length of the input array.

Space complexity: O(n), the space required for the leftProduct array.

Code
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        int rightProduct = 1, num = 0;
        for (int j = nums.length - 1; j >= 0; j--) {
            num = nums[j];
            nums[j] = leftProduct[j] * rightProduct;
            rightProduct = num * rightProduct;
        }
        return nums;

    }
}
