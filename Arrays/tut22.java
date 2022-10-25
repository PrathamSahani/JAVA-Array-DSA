// BEST TIME TO BUY ANS SOLD
// GFG

public class tut22{
    static int Profit(int arr[], int n){
        int buy = arr[0];
        int max = 0;
        for(int i=1; i<n; i++){
            if(buy>max)
            buy=max;
            else if(arr[i]-buy>max)
            max = arr[i]-buy;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 6, 4};
        int n = arr.length;
        int max = Profit(arr, n);
        System.out.println(max);
    }
}