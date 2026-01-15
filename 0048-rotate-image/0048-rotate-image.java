class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int[] arr:matrix){
            for(int l=0,h=arr.length-1;l<h;l++,h--){
                int tmp = arr[l];
                arr[l] = arr[h];
                arr[h] = tmp;
            }
        }
    }
}

// Approach (Two-Step In-Place Rotation)
// 1️⃣ Transpose the Matrix
// Convert rows into columns by swapping matrix[i][j] with matrix[j][i]
// Only traverse the upper triangle (j = i to n-1) to avoid double swapping

// Effect:

// 1 2 3        1 4 7
// 4 5 6   →    2 5 8
// 7 8 9        3 6 9

// 2️⃣ Reverse Each Row
// After transposition, reverse every row
// This completes the 90° clockwise rotation

// Effect:

// 1 4 7        7 4 1
// 2 5 8   →    8 5 2
// 3 6 9        9 6 3

// Algorithm (Steps)
// Loop through the matrix and transpose it
// Swap matrix[i][j] with matrix[j][i]
// Loop through each row and reverse it
// Use two pointers (l, h) and swap

// Time Complexity
// Transpose: O(n²)
// Reverse rows: O(n²)
// Total:
// O(n2)	​

// Space Complexity
// No extra data structures used
// Rotation done in-place
// O(1)
// 	​

// Key Points to Remember
// Works only for square matrices
// In-place rotation avoids extra memory
// Very common interview pattern 🚀