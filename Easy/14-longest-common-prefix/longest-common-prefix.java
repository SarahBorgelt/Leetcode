class Solution {
    public String longestCommonPrefix(String[] strs) {
        //handle null and zero string length first
        if(strs == null || strs.length == 0){
            return "";
        }

        //Next, find the shortest string
        String shortest = strs[0];

        //Create a for-each loop to check which string is the shortest. If a word is shorter, it becomes the shortest.
        for(String s : strs){
            if(s.length() < shortest.length()){
                shortest = s;
            }
        }

        /*Compare characters. Use a for-loop to run through each character and assign it to char c, which will hold the letter at index i*/
        for(int i =0; i< shortest.length(); i++){
            char c = shortest.charAt(i);
            //Use a for-each loop to check each word in the strs array. 
            for(String s : strs){
                //If the character at index i in word s does not equal c, return the shortest common prefix at substring 0 through i (where i is excluded).
                if(s.charAt(i) != c){
                    return shortest.substring(0,i);
                }
            }
            //If there is no return above, the entire array matches and we can return the entire word.
        } return shortest;
    }
}
