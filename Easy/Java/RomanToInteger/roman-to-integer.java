class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer>romanNumeral=new HashMap<>();
        //Create hashmap to store key-value pairs
        romanNumeral.put('I',1);
        romanNumeral.put('V',5);
        romanNumeral.put('X',10);
        romanNumeral.put('L',50);
        romanNumeral.put('C',100);
        romanNumeral.put('D',500);
        romanNumeral.put('M',1000);

        int total = 0; //create variables for running total and previous number
        int prev = 0;
        //Create a for loop to go through each part of the string moving from right to left
        for(int i = s.length()-1; i>=0; i--){
            //declare a variable curr that is equal to the value of the character at i
            int curr = romanNumeral.get(s.charAt(i));
            //logic handling for if current value is less than previous or greater than previous
            //for example IV is four in Roman Numerals
            if(curr<prev){
                total -= curr;
            } else{
                total+=curr;
            } prev=curr;
        } return total;
    } 
}
