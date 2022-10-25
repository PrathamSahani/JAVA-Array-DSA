//KTH MAXIMUM AND MINIMUM ELEMENT IN ARRAY
 

import java.util.Arrays;
public class tut8{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int m =arr.length;
        int k=3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        System.out.println(arr[m-1]);
    }
    
    }



//METHOD -1
    
import java.util.Arrays;
public class tut7{
    static void small(int a[], int k, int m){
        Arrays.sort(a);
        System.out.println(a[k-1]);
        System.out.println(a[m-1]);
    }
    public static void main(String[] args) {
        int a[] = {12,34,54,32,41,1,6,76,43};
        int k= 1;
        int m= a.length;
        small(a, k, m);   
    }
}