package interviewCake.hashingAndHashTables;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a method that takes an integer flightLength(in minutes) and an array of integers
 * moviesLengths(in minutes) and returns a boolean indicating whether there are two numbers
 * in movieLengths whose sum equals flightLength.
 * Created by George Fouche on 8/21/18.
 */
public class InflightEntertainment {

    public static boolean canTwoMoviesFillFlight(int [] movieLengths, int flightLength){

        Set<Integer> movieLengthsSeen = new HashSet<>();

        for(int firstMovieLength : movieLengths){
            int matchingSecondMovieLength = flightLength -firstMovieLength;
            if(movieLengthsSeen.contains(matchingSecondMovieLength)){
                return true;
            }

            movieLengthsSeen.add(firstMovieLength);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] movieLengths = {1,1,3,4,5};
        int flightLength = 2;

        System.out.println(canTwoMoviesFillFlight(movieLengths,flightLength));
    }

}
