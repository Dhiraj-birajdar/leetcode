class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;

        //boolean array approach
        // int count = 0;
        // boolean[] alpha = new boolean[26];
        // for(char c:sentence.toCharArray()){
        //     if(!alpha[c-'a']){
        //         alpha[c-'a']=true;
        //         count++;
        //     }
        //     if(count==26) return true;
        // }
        // return false;

        //indexOf() approach
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;

        //stream approach
        // return sentence.chars().boxed().collect(Collectors.toSet()).size()==26;
    }
}