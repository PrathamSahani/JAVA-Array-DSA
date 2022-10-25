//SMALLEST SUBARRAY WITH SUM GREATER THEN A GIVEN VALUE
//Er Sahil Ka Gyan


public class tut36{
    static int small(int a[], int n , int x){
        int cur=0, min = n-1;
        int start=0, end=0;
        while(end<n){
           
            while(cur<=x && end<n)
                cur +=a[end++];
                while(cur>x && start<n){
                if(end-start <min)
                min = end-start;
                cur -= a[start++];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int a[] = {1, 10, 5, 2, 7};
        int n = a.length;
        int x = 24;
        System.out.println(small(a, n, x));
    }
}