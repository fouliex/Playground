package Recursion.bottomupvstopdown;

/**
 * Created by George Fouche on 10/11/17.
 */
public class ProductExample {

    public static int product1toNTopDown(int n){
        return (n> 1) ? ( n* product1toNTopDown(n-1)) :1 ;
    }

    public static int product1ToNBottomUP(int n){
         int result =1;

         for( int num =1; num <= n; num++){
             result *=num;
         }

         return  result;
    }
}
