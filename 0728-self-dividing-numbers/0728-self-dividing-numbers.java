class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> r = new ArrayList();
        for(;left<=right;left++)
            if(isSelfDividing(left))
                r.add(left);
        return r;

    }
    private boolean isSelfDividing(int n){
        for(int i = n; i>0; i/=10){
            if(i%10==0 || n%(i%10)!=0)
                return false;
        }
        return true;
    }
}