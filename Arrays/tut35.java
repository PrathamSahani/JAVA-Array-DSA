//CHOCALATE DISTRIBUTION PROBLEM 


import java.util.Arrays;
public class tut35{
    static int CHOCALATE(int arr[], int n, int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff<min)
              min =diff;
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]= {3,4,1,9,56,7,9,12};
        int n = arr.length;
        int m = 5;
        System.out.println(CHOCALATE(arr, n, m));
    }
}