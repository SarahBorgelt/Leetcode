class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++){
            //takes the position at character i in the string
            char character = columnTitle.charAt(i);
            //converts the letter into a number. 'A' is number 65 in unicode, which we must remove
            int value = character - 'A' + 1;
            result = result * 26 + value;
        } return result;
    } 
}