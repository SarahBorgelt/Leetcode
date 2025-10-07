class Solution {
    public int[] plusOne(int[] digits) {
        //access the last element by using digits.length - 1.
        for(int i = digits.length - 1; i>= 0; i-- ){
            //if i<9, add 1 and return digits
            if(digits[i]<9){
                digits[i]++;
                return digits;
            } //otherwise, digit i = 0;
            digits[i]=0;
            //if the number is 999, add an extra number and set the first index to one.
        } int[] result = new int[digits.length + 1];
        result[0]=1;
        return result;
    }
}