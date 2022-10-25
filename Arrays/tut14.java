//MINIMIZE AND MAXIMIZE DIFFERENCE IN AN ARRAY
//Er Shail KA Gyan 


import java.util.Arrays;
public class tut14{
    static int getMinDiff(int a[], int n , int k){
        Arrays.sort(a);
        int ans = a[n-1] - a[0];
        int smallest = a[0]+k;
        int largest = a[n-1] - k;
        for(int i=0; i<n-1; i++){
            int min = Math.min(smallest, a[i+1]-k);
            int max = Math.max(largest, a[i]+k);
            if(min<0)
            continue;
            ans = Math.min(ans, max-min);


        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,5,15,10};
        int n = a.length;
        int k=3;
        int b =getMinDiff(a,n,k);
        System.out.println(b);
    }

}





