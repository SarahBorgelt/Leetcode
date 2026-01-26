class Solution {
    public int lengthOfLastWord(String s) {
        //error handling if s is null or empty. Automatically 0.
        if (s == null || s.isEmpty()){
            return 0;
        } else {
            //s.trim remvoves any whitespaces and .split splits the string into an array of substrings if there is one or more whitespace characters
            String[] words = s.trim().split("\\s+");
            //Access the last word in the array. Words.length gives the number of words
            //in the array and -1 is the last index. The .length returns the number of characters in that word
            return words[words.length-1].length();
        } 
    }
}
