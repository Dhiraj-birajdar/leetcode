class Solution {
    public boolean isValid(String word) {
        if(word.length()<3 || !word.matches("[a-zA-Z0-9]+")) return false;
        return word.matches("(?i).*[aeiou].*") && word.matches("(?i).*[^aeiou0-9].*");

//         boolean vowel = false;
//         boolean consonant = false;

//         vowel = word.toLowerCase().matches(".*[aeiou].*");
//         consonant = word.toLowerCase().matches(".*[^aeiou0-9].*");
        // return vowel && consonant;
    }
}