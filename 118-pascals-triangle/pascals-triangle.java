class Solution {
    public List<List<Integer>> generate(int numRows) {
        //We have to use a list since we don't have a definitive amount of rows
        List<List<Integer>>triangle = new ArrayList<>();
        //If the number of rows is 0, always return the triangle
        if(numRows == 0){
            return triangle;
        } 

        //Always add one as the first row
        triangle.add(Arrays.asList(1));

        //Create a loop to run through the remaining rows 
        for(int i=1; i<numRows;i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();

            //Because the first element is always one, we will add 1 to the current row.
            currentRow.add(1);

            //We create j to loop through the middle numbers. We use j < i because only the middle elements of the row need to be calculated, and there are exactly i - 1 middle elements in row i.
            for(int j = 1; j < i; j++){
                //get the sum of the two numbers directly above the current position
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            //The last number is always 1
            currentRow.add(1);

            //Add the current row to the triangle before re-starting the loop
            triangle.add(currentRow);
        }
         return triangle;
        }
    }
