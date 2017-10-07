package Recursion;

/**
 * link: https://www.mathsisfun.com/algebra/triangular-numbers.html
 * Created by George Fouche on 8/22/17.
 */
public class TriangleNumbers {

    public int triangleNumber(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    public int recursiveTriangleNumber(int n) {
        if (n == 0) {
            return 0;
        }
        int result = n + triangleNumber(n - 1);
        return result;
    }

    public static void main(String[] args) {
        TriangleNumbers triangleNumbers = new TriangleNumbers();
        System.out.println(triangleNumbers.triangleNumber(3));
    }
}
