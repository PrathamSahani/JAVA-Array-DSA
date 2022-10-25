// FIND ALL PAIRS ON INTEGER ARRAY WHOSE SUM IS EQUAL TO GIVEN NUMBER
// GFG

public class tut23{
    static void sum(int arr[], int n, int sum ){
        int count=0;
        for(int i=0; i<n; i++)
        for(int j=i+1; j<n; j++)
        if(arr[i] + arr[j] ==sum){
            System.out.println(" ("+arr[i]+ " "+arr[j]+")");
            count++;
           
        }
        System.out.println(count);
    }
        public static void main(String[] args) {
            int arr[] = {1, 5, 7, -1, 5 };
            int n = arr.length;
            int sum = 0;
            sum(arr, n , sum);
            
        }
    }




