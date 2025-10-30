class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        //Create a list to hold words that contain the character x
        List<Integer> wordsContainingX = new ArrayList<>();

        //Create a for loop to run through each character
        for(int i = 0; i<words.length; i++){
            //If the position of index i in words equals x, add it to the wordsContainingX
            if(words[i].indexOf(x) != -1){
                wordsContainingX.add(i);
            } //Return x
        } return wordsContainingX;
        
    }
}
