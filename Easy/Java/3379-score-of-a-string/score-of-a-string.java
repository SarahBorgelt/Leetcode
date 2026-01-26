class Solution {
    public int scoreOfString(String s) {
        //Set initial value of ascii to 0
        int ascii=0;

        //Run through each letter in the string, 
        //check the difference in terms of absolute value,
        //add the absolute value to ascii
        for(int i = 0; i < s.length()-1; i++){
            int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
            ascii += diff;
        
        //Return ascii
        } return ascii;
    }
}
