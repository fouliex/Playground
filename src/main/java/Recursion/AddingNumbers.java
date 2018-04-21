package Recursion;

public class AddingNumbers {

    public int sumRecursive(int n){
        if(n==1) return 1;
        return n + sumRecursive(n-1);
    }

    public int sumIterative(int n){
        int num = 0;
        for(int i = 0; i <=n; i++){
            num += i;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new AddingNumbers().sumIterative(4));
        System.out.println(new AddingNumbers().sumRecursive(4));
    }
}
