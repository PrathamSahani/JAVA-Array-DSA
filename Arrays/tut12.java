//PROGRAM TO CYCILLY ROTAED ARRAY BY ONE 
//Er Shail Ka Gyan 

//METHOD
import java.util.Arrays;
public class tut12{
    static void ROTAED(int a[]){
        int x = a[a.length-1], i;
        for(i=a.length-1; i>0; i--)
        a[i] = a[i-1];
        a[0] = x;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        ROTAED(a);
        System.out.print(Arrays.toString(a));
    }
}


//METHOD -1
public class tut12{
    static void ROTAED(int arr[]){
        int x = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--)
        arr[i] = arr[i-1];
        arr[0] = x;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        ROTAED(arr);
        System.out.println(Arrays.toString(arr));
    }
}
