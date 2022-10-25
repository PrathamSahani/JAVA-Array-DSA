//LARGEST SUM CONTIGUES SUBARRAY
//Er Sahil Ka Gyan


//METHOD
public class tut13{
static void  MaxSubArray(int a[]){
    int max = 0;
    int cur =0;
    for(int i=0; i<a.length; i++){
        cur = cur+ a[i];
        if(cur>max)
        max = cur;
        if(cur<0)
        cur=0;
    }
    System.out.println(max);
}

    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        MaxSubArray(a);

        
    }
}



//METHOD-1
import java.util.*;
public class tut13{
    static void MaxSubArray(int a[]){
        int maxsum =Integer.MIN_VALUE;
        int cursum = 0;
        for(int i=0; i<a.length; i++){
            if(cursum>maxsum)
            maxsum= cursum;
            if(cursum<0)
            cursum=0;
        }
        System.out.print(maxsum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
        a[i]  = s.nextInt();
    }
    MaxSubArray(a);
}

}