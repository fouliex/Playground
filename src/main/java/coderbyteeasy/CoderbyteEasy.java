package coderbyteeasy;

public class CoderbyteEasy {

    public String firstReverse(String str) {
        StringBuilder sb = new StringBuilder();
         for(int i = str.length() -1; i>=0; i--){
             sb.append(str.charAt(i));
         }
         return String.valueOf(sb);
    }

    public int firstFactorial(int num){
        if(num ==1) return 1;

        return num * firstFactorial(num -1);
    }

    public String longestWord(String str ){
         String [] sentence = str.split(" ");
         String longestWord= "";
         for(String words: sentence){
             if(longestWord.length() < words.length()){
                 longestWord = words;
             }
         }
         return longestWord;

    }

    public int simpleAdding(int num){
        if(num == 0) return 0;
        return  num + simpleAdding(num -1);
    }

    public Boolean simpleSymbols(String str){
        boolean result = false;
        for(int i =1; i < str.length()-1; i++){
            char before = str.charAt(i-1);
            char middle = str.charAt(i);
            char after = str.charAt(i+1);
            if(isLetter(middle) && before =='+' && after == '+'){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }

    public boolean isLowercase(char c){
        if (c >= 'a' && c <= 'z' ) return true;
        return false;
    }

    public boolean isUppercase(char c){
        if (c >= 'a' && c <= 'z' ) return true;
        return false;
    }

    public boolean isLetter(char c){
        return  isLowercase(c) || isUppercase(c);
    }

    public boolean abCheck(String str){
        for(int i = 0; i< str.length(); i++){
            char a = 'a';
            char b = 'b';
            if (str.charAt(i) == a && str.charAt(i+4) == b){
                return true;
            }
        }
        return false;

    }

    public String alphabetSoup(){
        return null;
    }



    //TODO
    public String letterChanges(String str ){
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new CoderbyteEasy().firstReverse("George"));
        System.out.println(new CoderbyteEasy().firstFactorial(4));
        System.out.println(new CoderbyteEasy().longestWord("Georges Erol Fouche"));
        System.out.println(new CoderbyteEasy().simpleAdding(4));
        System.out.println(new CoderbyteEasy().simpleSymbols("++d+====+c++==a"));
        System.out.println(new CoderbyteEasy().abCheck("lane borrowed"));
    }



}

