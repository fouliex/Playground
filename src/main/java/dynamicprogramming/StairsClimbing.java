package dynamicprogramming;

/**
 * You can climb 1 or 2 stairs with one step. How many different ways can you climb n stairs?
 *
 * Naive Solution:
 * Let f(n) be the number of different ways to climb n stairs.
 * How can we reach the nth stair?
 * (1) Be at the (n-2)th stair, then climb 2 Steps
 * (2) Be at the (n-1)th stair, then climb 1 Step
 *
 * For (1), number of ways to reach the (n-2)th Stair is f(n-2)
 * For (2), number of ways to reach the (n-1)th Stair is f(n-1)
 * f(n) = f(n-1)+ f(n-2). Use Recursion! (base case are f(1) =1, f(2) =2)
 *
 */
public class StairsClimbing {
    // Exponential recursive solution
    int stairs(int n){
        if (n==1) return 1;
        if (n==2) return 2;
        return stairs(n-1)+ stairs(n-2);
    }

    // Linear dynamic programming solution
    int stairs2(int n){
        int[] s = new int[n+1];
        s[1] =1;
        s[2] =2;

        for(int i =3; i<=n; ++i){
            s[i] =s[i-1]+ s[i-2];
        }
        return s[n];
    }

    public static void main(String[] args) {
        StairsClimbing stairsClimbing = new StairsClimbing();
        System.out.println(stairsClimbing.stairs(5));
        System.out.println(stairsClimbing.stairs2(4));

    }
}
