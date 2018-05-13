package leetcode;

public class StringToInteger {

     public int myAtoi(String str){
         if(str == null || str.length() == 0){
              return 0;
         }
         // remove whitespaces
         str = str.trim();

         // positive and negative check
         boolean isNegative =false;
         int startIndex = 0;
         if(str.charAt(0) == '+' || str.charAt(0) == '-'){
             startIndex =1;
         }
         if(str.charAt(0)=='-'){
             isNegative = true;
         }

         double result =0;
         for(int i = startIndex; i <str.length();i++){
             if(str.charAt(i)< '0' || str.charAt(i) > '9'){
                 break;
             }
             int number = (int) str.charAt(i) - '0';
             result = result *10 + number;
         }

         if(isNegative){
             result = -result;
         }


         //handle out of the range cases
         if(result > Integer.MAX_VALUE){
             return Integer.MAX_VALUE;
         }

         if(result < Integer.MIN_VALUE){
             return Integer.MIN_VALUE;
         }


         return (int)result;
     }

    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        System.out.println(stringToInteger.myAtoi("123"));
        System.out.println(stringToInteger.myAtoi("+123"));
        System.out.println(stringToInteger.myAtoi("123"));
    }
}
