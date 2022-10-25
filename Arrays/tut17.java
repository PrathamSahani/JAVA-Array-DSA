// MERGE TWO SORTED ARRAY WITHOUT USING EXTRA SPACE 
// GFG

import java.util.Arrays;
public class tut17{
    static int arr1[] = new int[]{11,2,4,6,8};
    static int arr2[] = new int[]{3,5,7,10};

    static int merge(int m ,int n){
        int i=0, j=0, k=m-1;
        while(i<=k && j<n){
            if(arr1[i]<arr2[j])
            i++;
            else{
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        merge(arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}








