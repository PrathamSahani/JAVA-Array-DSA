//MINIMUM SWAPS REQUIRED TO BRING ELEMENT LESS EQUAL TO K TOGETHER 
//Er Shahil Ka Gyan


public class tut38{
    static int minswap(int a[], int n, int k){
        int good=0, bad=0;
        for(int i=0; i<n; i++){
            if(a[i]<=k)
            good++;
            
        }
        for(int i=0; i<good; i++){
            if(a[i]>k)
            bad++;
        }
        int i=0, j=good, ans=bad;
        while(j<n){
            if(a[i]>k)
            bad--;
            if(a[j]>k)
            bad++;
            ans = Math.min(ans, bad);
            i++;j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {2, 1, 5, 6, 3};
        int n = a.length;
        int k=3;
        System.out.println(minswap(a, n, k));
    }
} 