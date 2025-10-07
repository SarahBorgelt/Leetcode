class Solution {
    public List<String> fizzBuzz(int n) {
        //Create a new string array of length n
        String[] answer = new String[n];
        //Loop backwards from n down to 1 to fill the array in reverse order
        for(int i=n; i>0; i--){
            //n is out of bounds, so we must use n-1
            int index = i - 1;
            // Check divisibility by 3 and/or 5 and assign the corresponding FizzBuzz value
            if(i % 3 ==0 && i %5==0){
                answer[index] = "FizzBuzz";
            } else if(i % 3 ==0){
                answer[index] = "Fizz";
            } else if(i % 5 == 0){
                answer[index] = "Buzz";
            } else {
                //if not divisible by 3 or 5, convert current value into a string
                answer[index] = String.valueOf(i);
            }
            //return the answer as a list
        } return Arrays.asList(answer);
        
    }
}
