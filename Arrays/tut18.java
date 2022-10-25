// KADANE'S ALGORITHM

public class tut18{
    public static void main(String[] args) {
        int a[] = new int[] { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum Subarray : "+maxsubarray(a));
    }
    static int maxsubarray(int a[]){
        int maxs =0, maxe=0;
        for(int i=0; i<a.length; i++){
            maxe = maxe+ a[i];
            if(maxs<maxe)
                maxs = maxe;
            if(maxe<0)
                maxe=0;
        }
            return maxs;
        
    }
}