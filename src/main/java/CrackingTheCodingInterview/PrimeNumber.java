package CrackingTheCodingInterview;

class PrimeNumber {
    public boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void primeList(int number){
        for(int i = 2; i <= number; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }

    }

    public static void main(String args[]) throws Exception {
        PrimeNumber p = new PrimeNumber();
        p.primeList(9);


    }
}
