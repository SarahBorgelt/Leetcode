class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        //use a for loop to run through each part of the string
        //use if statements to impact the value of x
        for(int i = 0; i < operations.length; i++){
            /*must use .equals to compare strings. Check if the value of operations at index i equals the necessary criteria to add one*/
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x+=1;
            }
                /*if the value at index i isnt equal to
                the necessary criteria to add one, check if
                it meets the necessary criteria to subtract one*/
            else if(operations[i].equals( "--X") || operations[i].equals("X--")){
                x-=1;
            }
        } return x;
    }
}