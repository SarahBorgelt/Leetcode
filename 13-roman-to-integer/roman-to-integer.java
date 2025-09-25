class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer>romanNumeral=new HashMap<>();
        romanNumeral.put('I',1);
        romanNumeral.put('V',5);
        romanNumeral.put('X',10);
        romanNumeral.put('L',50);
        romanNumeral.put('C',100);
        romanNumeral.put('D',500);
        romanNumeral.put('M',1000);

        int total = 0;
        int prev = 0;
        for(int i = s.length()-1; i>=0; i--){
            int curr = romanNumeral.get(s.charAt(i));
            if(curr<prev){
                total -= curr;
            } else{
                total+=curr;
            } prev=curr;
        } return total;
    } 
}