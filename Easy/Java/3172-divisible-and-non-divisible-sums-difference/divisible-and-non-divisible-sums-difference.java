class Solution {
    public int differenceOfSums(int n, int m) {
        //initialize the variables
        int num1 = 0;
        int num2 = 0;

        //create a for loop to run through each number and categorize appropriately
        for(int i=1; i<= n; i++){
            if(i % m == 0){
                num2 += i;
            } else {
                num1 += i;
            }
            
        } //return the difference of num1 - num2
        return num1 - num2;
    } 
}
