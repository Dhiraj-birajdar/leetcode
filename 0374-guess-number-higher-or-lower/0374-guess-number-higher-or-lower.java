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
        for(int gr, g = n ;;){
            gr = guess(g);
            if(gr == 0)
                return g;
            else if(gr == -1){
                n = g;
                g = g/2;
            }
            else
                g = g+(n-g)/2;

        }
    }
}