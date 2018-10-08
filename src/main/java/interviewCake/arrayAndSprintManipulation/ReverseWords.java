package interviewCake.arrayAndSprintManipulation;

/**
 * Write a method reverseWords() that takes a message as an array of
 * characters and reverses the order of the words in place
 */
public class ReverseWords {

    private  void reverseCharacters(char[] message, int leftIndex, int rightIndex) {

        // walk towards the middle, from both sides
        while (leftIndex < rightIndex) {

            // swap the left char and right char
            char temp = message[leftIndex];
            message[leftIndex] = message[rightIndex];
            message[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }

    /**
     *  1. Reverse all the characters in the entire message, giving us the correct word order
     *  but with wach word backward.
     *
     *  2. Reverse the characters in each individual word
     * @param message
     */
    public void reverseWords(char[]message){
        reverseCharacters(message,0,message.length-1);
        int currentWordStartIndex =0;
        for(int i=0; i<=message.length; i++){
            if(i==message.length || message[i]== ' '){
                reverseCharacters(message, currentWordStartIndex, i - 1);
                currentWordStartIndex = i + 1;
            }
        }
    }


    public static void main(String[] args) {
        char[] message1 = { 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };

        char[] message2 = { 't', 'h', 'e', ' ', 'e', 'a', 'g', 'l', 'e', ' ',
                'h', 'a', 's', ' ', 'l', 'a', 'n', 'd', 'e', 'd' };

        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reverseWords(message1);
        System.out.println(message1);

    }




}
