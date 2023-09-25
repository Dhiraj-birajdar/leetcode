class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int x = 0;
        for(String s: operations)
        {
            switch(s)
            {
                case "X--": x--;
                break;
                case "--X": --x;
                break;
                case "X++": x++;
                break;
                case "++X": ++x;
                break;
            }
        }
        return x;
    }
}