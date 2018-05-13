package algorithms;

public class BinarySearch {

    public static int binarySearch(int x, int[] a) {
        int p = 0;
        int r = a.length -1;
        while (p <= r) {
            int q = (p + r) / 2;
            if (a[q] == x) return q;
            if (a[q] > x) r = q - 1;
            else p = q + 1;
        }
        return -1;
    }

    public static int binarySearchRecursively(int x, int[]a,int p,int r){
        if(p > r){
            return -1;
        }else{
            int q = (p+r)/ 2;
            if(a[q] == x){
                return q;
            }else if(a[q]> x){
                return binarySearchRecursively(x,a,p,q-1);
            }else{
                return binarySearchRecursively(x,a,q+1,r);
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(7, a));
        System.out.println(binarySearchRecursively(7,a,0,10));
    }
}
