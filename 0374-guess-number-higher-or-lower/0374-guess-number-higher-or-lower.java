/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // int g = guess(n);
        // if(g == 0)
        //     return n;
        // else if( g == -1)
        //     return guessNumber(n/2);
        // else
        //     return guessNumber() 
        for(int g, s = n, i = 1 ;;i++){
            g = guess(s);
            if(g == 0)
                return s;
            else if(g == -1){
                n = s;
                s = s/2;
            }
            else
                s = s+(n-s)/2;

        }
    }
}