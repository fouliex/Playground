package Recursion;

public class Euclidean {

    private int gcdRecursive(int num1, int num2) {
        if(num2 == 0) return num1;
        return  gcdRecursive(num2,num1 % num2);
    }
    public static void main(String[] args) {
        Euclidean euclidean = new Euclidean();
        System.out.println(  euclidean.gcdRecursive(30,100) );
    }

}
