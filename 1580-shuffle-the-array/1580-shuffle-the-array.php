class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $n
     * @return Integer[]
     */
    function shuffle($nums, $n) {
        $arr = [];
        for($i = 0,$j = 0;$j<$n;$i+=2,$j++)
        {
            $arr[$i]= $nums[$j];
            $arr[$i+1]= $nums[$n+$j];
        }
        print_r($arr);
        return $arr;
    }
}