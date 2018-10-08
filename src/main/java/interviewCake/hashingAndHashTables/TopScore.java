package interviewCake.hashingAndHashTables;

import java.util.Arrays;

/**
 * Efficiently Sort numbers in an array, where each number is below a certain maximum.
 * Created by George Fouche on 8/29/18.
 */
public class TopScore {


    public static void main(String[] args) {
        int [] unsortedScores = {37,89,41,65,91,53};
        final int HIGHEST_POSSIBLE_SCORE = 100;


        int [] sortedScores = sortScores(unsortedScores,HIGHEST_POSSIBLE_SCORE);
        System.out.println(Arrays.toString(sortedScores));
    }

    private static int[] sortScores(int[] unsortedScores, int highestPossibleScore) {
        int[] scoreCounts = new int[highestPossibleScore +1];

        for(int score : unsortedScores){
            scoreCounts[score]++;
        }

        int[] sortedScores = new int[unsortedScores.length];
        int currentSortedIndex =0;

        for(int score = highestPossibleScore; score >= 0; score --){
            int count = scoreCounts[score];

            for( int occurrence =0; occurrence < count; occurrence++){
                sortedScores[currentSortedIndex]= score;
                currentSortedIndex++;
            }
        }

        return sortedScores;
    }

}
