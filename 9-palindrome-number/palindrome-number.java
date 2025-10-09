class Solution {
    public boolean isPalindrome(int x) {

        //change the value of x to a string
        String s = String.valueOf(x);

        //check if the value of String s is equal to 
        //the reverse of String s

      return s.equals(new StringBuilder(s).reverse().toString());
    }
}