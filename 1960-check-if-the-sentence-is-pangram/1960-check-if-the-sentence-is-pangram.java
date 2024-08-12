class Solution {
    public boolean checkIfPangram(String sentence) {
        return sentence.chars().boxed().collect(Collectors.toSet()).size()==26;
    }
}