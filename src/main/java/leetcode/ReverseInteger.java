package leetcode;

public class ReverseInteger {

    public int getSize(int x) {
        return (int) Math.floor(Math.log10(x));
    }
    public int negativeNumberReverse(int x){
       int  number = doReverse(x * -1);
       return number * -1;
    }

    public int doReverse(int x){
        int temp;
        int size = getSize(x);
        int reversed = 0;
        int iter = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            x = x / 10;
            reversed += lastDigit * Math.pow(10, size - iter);
            temp = reversed *10 + lastDigit;
            if(x > Integer.MAX_VALUE){
                System.out.println("George");
            }
            if(temp/10 != reversed || temp %10 != lastDigit)return 0;
            iter++;
        }
        return reversed;
    }

    public int reverse(int x) {
        int result;
        if(x < 0){
          result =negativeNumberReverse(x );
        }else{
            result = doReverse(x);
        }


        return result;
    }

    public int reverse2(int x){
        int lastDigit;
        int reversed =0;
        int temp;
        while(x!= 0){
            lastDigit = x%10;
            x =x/10;
            temp = reversed *10 + lastDigit;
            if(temp/10 != reversed || temp %10 != lastDigit)
                return 0;
            reversed = temp;
        }
        return reversed;
    }



    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(1534236469));
        System.out.println(reverseInteger.reverse2(1534236469));

        System.out.println(reverseInteger.reverse(-123));
        System.out.println(reverseInteger.reverse2(-123));

    }
}
