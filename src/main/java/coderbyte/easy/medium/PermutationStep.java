package coderbyte.easy.medium;

/**
 * Have the function PermutationStep(num) take the num parameter being passed and return the next number greater than
 * num using the same digits. For example: if num is 123 return 132, if it's 12453 return 12534.
 * If a number has no greater permutations, return -1 (ie. 999).
 */
public class PermutationStep {

    public int doPermutationStep(int num) {
        String numToString = Integer.toString(num);
        for (int i = numToString.length() - 1; i > 0; i--) {
            int leftDigit = Character.getNumericValue(numToString.charAt(i - 1));
            int rightDigit = Character.getNumericValue(numToString.charAt(i));
            if (leftDigit < rightDigit) {
                    numToString = numToString.substring(0, i - 1) + Integer.toString(rightDigit) + Integer.toString(leftDigit) + numToString.substring(i + 1);
                break;
            }
        }
        for (int j = 0; j < numToString.length(); j++) {
            for (int i = numToString.length() - 1; i > 0; i--) {
                int leftDigit = Character.getNumericValue(numToString.charAt(i - 1));
                int rightDigit = Character.getNumericValue(numToString.charAt(i));
                String temp = numToString.substring(0, i - 1) + Integer.toString(rightDigit) + Integer.toString(leftDigit) + numToString.substring(i + 1);
                if (Integer.parseInt(temp) > num && Integer.parseInt(temp) < Integer.parseInt(numToString)) {
                    numToString = temp;
                }
            }
        }
        if (num == Integer.parseInt(numToString))
            return -1;

        return Integer.parseInt(numToString);
    }

    public static void main(String[] args) {
        PermutationStep permutationStep = new PermutationStep();
        int num = 123;
        System.out.print(permutationStep.doPermutationStep(num));
    }
}
